package self.edu.homework.hwk1;

import tester.Tester;

/**
 * Contains various examples for testing our implementation
 * of the problem.
 * @author Stephen Andrews
 * @author Ted Bieber
 */
public class Examples {

    RoboticsTeam wpi = new RoboticsTeam("WPI", "Bleats like a goat", 1);
    RoboticsTeam rpi = new RoboticsTeam("RPI", "Falls over", 0);
    RoboticsTeam mit = new RoboticsTeam("MIT", "Costs a lot", 2);
    RoboticsTeam wpiWannabes = new RoboticsTeam("'WPI'", "baaaaaaaaaaaaaaaaa", 1);

    /**
     * -------------------------------------------------
     *              ASSIGNMENT EXAMPLES
     * -------------------------------------------------
     */
    // tests whether wpi will beat rpi in expectToBeat
    boolean testWpiVSRpi(Tester t) {
        return t.checkExpect(wpi.expectToBeat(rpi),
                true) ;
    }

    // tests whether rpi will beat mit in expectToBeat
    boolean testRpiVSMit(Tester t) {
        return t.checkExpect(rpi.expectToBeat(mit),
                false) ;
    }

    // tests whether wpi will beat mit in expectToBeat
    boolean testWpiVSMit(Tester t) {
        return t.checkExpect(wpi.expectToBeat(mit),
                true) ;
    }

    // tests whether wpiWannabes are expected to beat wpi
    boolean testCopyCatsVSWpi(Tester t) {
        return t.checkExpect(wpiWannabes.expectToBeat(wpi),
                false);
    }

    // tests whether wpi is expected to beat wpiWannabes
    boolean testWPIvsCopyCats(Tester t) {
        return t.checkExpect(wpi.expectToBeat(wpiWannabes),
                false);
    }
    IResult wpirpiResult = new RoboticsResult(10, 1, false, 0, 1, true);
    Match wpiVrpi = new Match(wpi, rpi, wpirpiResult);

    boolean testUnderdogWPIvRPI(Tester t) {
        return t.checkExpect(wpiVrpi.underdogWon(), false);
    }

    IResult rpimitResult = new RoboticsResult(10, 2, false, 8, 3, true);
    Match rpiVmit = new Match(rpi, mit, rpimitResult);

    boolean testUnderdogRPIvMIT(Tester t) {
        return t.checkExpect(rpiVmit.underdogWon(), true);
    }

    IResult wpiVcopycatsResult = new RoboticsResult(5, 2, true, 6, 1, false);
    Match wpiVwannabes = new Match(wpi, wpiWannabes, wpiVcopycatsResult);

    boolean testUnderdogWpiVwannabes(Tester t) {
        return t.checkExpect(wpiVwannabes.underdogWon(), true);
    }

    RugbyTeam usa = new RugbyTeam("USA", "Red White Blue", false, 12, 55);
    RugbyTeam jamaica = new RugbyTeam("Jamaica", "Black Yellow Green", true, 900, 1);
    RugbyTeam mexico = new RugbyTeam("Mexico", "Red White Green", false, 11, 55);
    RugbyTeam worseUSA = new RugbyTeam("USA -1.0", "Red Tan Blue", false, 10, 55);

    // tests whether USA is expected to beat the worse version of USA
    boolean testUsaVworseUSA(Tester t) {
        return t.checkExpect(usa.expectToBeat(worseUSA),
                true);
    }
    // tests whether USA is expected to beat jamaica
    boolean testUsaVjamaica(Tester t) {
        return t.checkExpect(usa.expectToBeat(jamaica),
                false);
    }
    // tests whether mexico is expected to beat the worse version of USA
    boolean testMexicoVworseUSA(Tester t) {
        return t.checkExpect(mexico.expectToBeat(worseUSA),
                true);
    }
    // tests whether mexico is expected to beat jamaica
    boolean testMexicoVjamaica(Tester t) {
        return t.checkExpect(mexico.expectToBeat(jamaica),
                false);
    }
    // tests whether jamaica is expected to beat mexico
    boolean testJamaicaVMexico(Tester t) {
        return t.checkExpect(jamaica.expectToBeat(mexico),
                true);
    }

    IResult usaVjamaicaResult = new RugbyResult(10, 9);
    Match usaVjamaica = new Match(usa, jamaica, usaVjamaicaResult);

    boolean testusaVjamaicaUnderdogTest(Tester t) {
        return t.checkExpect(usaVjamaica.underdogWon(), true);
    }

    IResult usaVworseResult = new RugbyResult(10, 0);
    Match usaVworse = new Match(usa, worseUSA, usaVworseResult);

    boolean testusaVworseUnderdogTest(Tester t) {
        return t.checkExpect(usaVworse.underdogWon(), false);
    }
}