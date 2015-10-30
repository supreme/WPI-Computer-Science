package self.edu.homework.hwk1.model;

/**
 * An interface for contestants in a match.
 * @author Stephen Andrews
 */
public interface IContestant {

    /**
     * Gets the place of origination of the team.
     * @return The place of origination.
     */
    String getTeamOrigin();

    boolean expectToBeat(IContestant opponent);

}
