package self.edu.homework.hwk1.model.robotics;

import self.edu.homework.hwk1.Match;
import self.edu.homework.hwk1.model.IResult;

/**
 * Represents the results of a robotics {@link Match}.
 * @author Stephen Andrews
 * @author Ted Bieber
 */
public class RoboticsResult implements IResult {

    /**
     * The points accumulated by team 1.
     */
    private int team1Points;

    /**
     * The amount of attempted tasks by team 1.
     */
    private int team1AttemptedTasks;

    /**
     * Whether or not the robot of team 1 fell down.
     */
    private boolean team1DidFallDown;

    /**
     * The points accumulated by team 2.
     */
    private int team2Points;

    /**
     * The amount of attempted tasks by team 2.
     */
    private int team2AttemptedTasks;

    /**
     * Whether or not the robot of team 2 fell down.
     */
    private boolean team2DidFallDown;

    /**
     * Constructs an {@link RoboticsResult} object.
     * @param team1Points The points accumulated by team 1.
     * @param team1AttemptedTasks The amount of attempted tasks by team 1.
     * @param team1DidFallDown Whether or not the robot of team 1 fell down.
     * @param team2Points The points accumulated by team 2.
     * @param team2AttemptedTasks The amount of attempted tasks by team 2.
     * @param team2DidFallDown Whether or not the robot of team 2 fell down.
     */
    public RoboticsResult(int team1Points, int team1AttemptedTasks, boolean team1DidFallDown, int team2Points, int team2AttemptedTasks, boolean team2DidFallDown) {
        this.team1Points = team1Points;
        this.team1AttemptedTasks = team1AttemptedTasks;
        this.team1DidFallDown = team1DidFallDown;
        this.team2Points = team2Points;
        this.team2AttemptedTasks = team2AttemptedTasks;
        this.team2DidFallDown = team2DidFallDown;
    }

    /**
     * Gets the points accumulated by team 1.
     * @return The points accumulated by team 1.
     */
    public int getTeam1Points() {
        return team1Points;
    }

    /**
     * Sets the points accumulated by team 1.
     * @param team1Points The new point value to set.
     */
    public void setTeam1Points(int team1Points) {
        this.team1Points = team1Points;
    }

    /**
     * Gets the amount of attempted tasks by team 1.
     * @return The amount of attempted tasks by team 1.
     */
    public int getTeam1AttemptedTasks() {
        return team1AttemptedTasks;
    }

    /**
     * Sets the amount of attempted tasks for team 1.
     * @param team1AttemptedTasks The new amount of attempted tasks to set.
     */
    public void setTeam1AttemptedTasks(int team1AttemptedTasks) {
        this.team1AttemptedTasks = team1AttemptedTasks;
    }

    /**
     * Whether or not the robot of team 1 fell down.
     * @return <code>true</code> if so, <code>false</code> if not.
     */
    public boolean didTeam1DidFallDown() {
        return team1DidFallDown;
    }

    /**
     * Sets the <code>didFallDown</code> flag for team 1.
     * @param team1DidFallDown The new flag to set.
     */
    public void setTeam1DidFallDown(boolean team1DidFallDown) {
        this.team1DidFallDown = team1DidFallDown;
    }

    /**
     * Gets the points accumulated by team 2.
     * @return The points accumulated by team 2.
     */
    public int getTeam2Points() {
        return team2Points;
    }

    /**
     * Sets the points accumulated by team 2.
     * @param team2Points The new point value to set.
     */
    public void setTeam2Points(int team2Points) {
        this.team2Points = team2Points;
    }

    /**
     * Gets the amount of attempted tasks by team 2.
     * @return The amount of attempted tasks by team 2.
     */
    public int getTeam2AttemptedTasks() {
        return team2AttemptedTasks;
    }

    /**
     * Sets the amount of attempted tasks for team 2.
     * @param team2AttemptedTasks The new amount of attempted tasks to set.
     */
    public void setTeam2AttemptedTasks(int team2AttemptedTasks) {
        this.team2AttemptedTasks = team2AttemptedTasks;
    }

    /**
     * Whether or not the robot of team 2 fell down.
     * @return <code>true</code> if so, <code>false</code> if not.
     */
    public boolean didTeam2DidFallDown() {
        return team2DidFallDown;
    }

    /**
     * Sets the <code>didFallDown</code> flag for team 2.
     * @param team2DidFallDown The new flag to set.
     */
    public void setTeam2DidFallDown(boolean team2DidFallDown) {
        this.team2DidFallDown = team2DidFallDown;
    }

    @Override
    public boolean isValid() {
        return ((team1AttemptedTasks < 8 && team1Points <= 16)
                && (team2AttemptedTasks < 8 && team2Points <= 16));
    }
}
