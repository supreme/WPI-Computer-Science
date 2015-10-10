;; Stephen Andrews
;; Individual Project

(require "world-cs1102.rkt")

#|                                     ---LANGUAGE---                                     |#

;; An animation is (make-animation list[command])
(define-struct animation (commands))

;; A object is (make-object symbol shape location color)
(define-struct object (name shape loc color))

;; A location is (make-location number number)
(define-struct location (x y))

;; A shape is
;; - (make-rect width height)
;; - (make-circ radius)
(define-struct rect (width height))
(define-struct circ (radius))

;; A collision-event is (make-collision-event cmd)
(define-struct collision-event (cmd))

;; The collider will check if a collision has been detected within the list of
;; objects on the canvas as well as the canvas boundary
;; An obj-collider can either be
;; - (make-collider object obstacle boolean list[collision-event]), or
;; - 'null for commands that do not require a collider clause
(define-struct obj-collider (obj obstacle clipped? event))

;; A command is
;; - (make-tween object obj-collider canvas)
;; - (make-set-loc object number number obj-collider canvas)
;; - (make-do-repeat object cmd boolean canvas)
;; - (make-remove-object object canvas)
;; - (make-add-object object canvas)
;; - (make-stop-object object)
;; - (make-end-animation canvas)
(define-struct tween (obj dx dy collider a-canvas))
(define-struct set-loc (obj x y collider a-canvas))
(define-struct do-repeat (obj cmd condition-met? a-canvas))
(define-struct remove-object (obj a-canvas))
(define-struct add-object (obj a-canvas))
(define-struct stop-object (obj))
(define-struct end-animation (a-canvas))

#|                                     ---EXAMPLES---                                     |#

(define example1
  (let ([a-circle
         (make-object 'circle
           (make-circ 10)
           (make-location 5 5 0 0)
           'red)]
        [a-rectangle
         (make-object 'rectangle
           (make-rect 10 50)
           (make-location 150 300 0 0)
           'blue)])
    (let ([anim-canvas
           (make-canvas 500 200 (list a-circle a-rectangle))])
      
      (make-animation (list (make-tween anim-canvas
                                        a-circle 3 3
                                        (make-obj-collider a-circle
                                                           anim-canvas
                                                           true
                                                           (make-collision-event (list
                                                                                  (make-remove-object a-rectangle
                                                                                                      anim-canvas)
                                                                                  (make-tween a-circle -6 -6
                                                                                              (make-obj-collider a-circle
                                                                                                                 anim-canvas
                                                                                                                 true
                                                                                                                 (make-collision-event (list
                                                                                                                                        (make-remove-object a-circle
                                                                                                                                                            anim-canvas))))
                                                                                              anim-canvas)))))
                            (make-end-animation anim-canvas))))))

(define example2
  (let ([a-circle
         (make-object 'a-circle
           (make-circ 10)
           (make-location 5 5 0 0)
           'purple)])
    (let ([anim-canvas
           (make-canvas 1000 1000 (list a-circle))])
      
      (make-animation (list
                       (make-do-repeat a-circle
                                       (make-set-loc a-circle
                                                     (random (canvas-width anim-canvas))
                                                     (random (canvas-height anim-canvas))
                                                     (make-obj-collider a-circle
                                                                        anim-canvas
                                                                        true
                                                                        (make-collision-event
                                                                         (make-stop-object a-circle)))
                                                     anim-canvas)
                                       false
                                       anim-canvas)
                       (make-end-animation anim-canvas))))))

(define example3
  (let ([a-circle
         (make-object 'circle
           (make-circ 10)
           (make-location 50 5 0 0)
           'orange)]
        [a-rectangle
         (make-object 'rectangle
           (make-rect 50 10)
           (make-location 50 300 0 0)
           'green)]
        [b-rectangle
         (make-object 'b-rectangle
           (make-rect 10 50)
           (make-location 100 250 0 0)
           'green)])
    (let ([anim-canvas
           (make-canvas 600 400 (list a-circle a-rectangle))])
      
      (make-animation (list
                       (make-tween a-circle
                                   0 10
                                   (make-obj-collider a-circle
                                                      anim-canvas
                                                      true
                                                      (make-collision-event (list (make-add-object
                                                                                   b-rectangle
                                                                                   anim-canvas)
                                                                                  (make-tween a-circle
                                                                                              10 0
                                                                                              (make-collision-event
                                                                                               (list (make-set-loc a-circle
                                                                                                                   (random (canvas-width anim-canvas))
                                                                                                                   (random (canvas-height anim-canvas))
                                                                                                                   'null
                                                                                                                   anim-canvas)))
                                                                                              anim-canvas))))
                                   anim-canvas)
                       (make-end-animation anim-canvas))))))


(define custom-example
  (let ([a-circle
         (make-object 'circle
           (make-circ 25)
           (make-location 25 25 0 0)
           'purple)])
    (let ([anim-canvas
            (make-canvas 800 600 (list a-circle))])

    (make-animation (list
                     (make-do-repeat a-circle
                                     (make-tween a-circle
                                                 10
                                                 10
                                                 (make-obj-collider a-circle
                                                                    anim-canvas
                                                                    true
                                                                    (make-collision-event
                                                                     (list (make-remove-object a-circle
                                                                                               anim-canvas))))
                                                 anim-canvas)
                                     false
                                     anim-canvas))))))



#|                                     ---INTERPRETER---                                     |#
    
;; The width of the canvas
(define CANVAS-WIDTH 1024)
  
;; The height of the canvas
(define CANVAS-HEIGHT 600)
  
;; The update tick
(define UPDATE-TICK (/ 1 28))

;; The objects on the canvas
(define CANVAS-OBJECTS empty)

#|                                     ---HELPER FUNCTIONS---                                     |#
;; draw-objects : list[objects] -> scene
;; Draws the all of the objects contained in the canvas on the scene.
(define (draw-objects objects)
  (cond [(empty? objects) (empty-scene WIDTH HEIGHT)]
        [(cons? objects)
         (let [(obj (first objects))]
           (place-image
            (object-shape obj) 5 5 (draw-objects (rest objects))))]))
  
;; run-animation : animation -> void
;; Cycles through the specified animation.
(define (run-animation a-animation)
  (begin
    (big-bang CANVAS-WIDTH CANVAS-HEIGHT UPDATE-TICK true)
    (tick (animation-commands a-animation))
    )
  )

;; tick : list[cmd] -> scene
;; Called every second. Updates the canvas with the next command
;; in the queue and reduces the list of commands by one.
(define (tick commands)
  (run-command (first commands))
  (update-frame (draw-objects CANVAS-OBJECTS))
  (sleep/yield 1)
  (tick (rest commands)))

;; run-command : command -> void
;; The logic for running the different command types.
;; Invokes the determined command.
(define (run-command a-command)
  (cond ([(tween? a-command) 7] 
         [(set-loc? a-command) 7]
         [(do-repeat? a-command) 7]
         [(remove-object? a-command) 7]
         [(add-object? a-command) 7]
         [(stop-object? a-command) 7]
         [(end-animation a-command) 7]))
  )
                                














