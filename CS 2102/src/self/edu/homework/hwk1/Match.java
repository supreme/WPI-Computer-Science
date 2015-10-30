package self.edu.homework.hwk1;

import self.edu.homework.hwk1.model.IContestant;
import self.edu.homework.hwk1.model.IResult;
import self.edu.homework.hwk1.model.robotics.RoboticsResult;
import self.edu.homework.hwk1.model.rugby.RugbyResult;

/**
 * Represents a match between two {@link IContestant}s and declares
 * a winner based on the {@link IResult}s of the match.
 * @author Stephen Andrews
 * @author Ted Bieber
 */
public class Match {

    /**
     * Team 1.
     */
    private IContestant team1;

    /**
     * Team 2.
     */
    private IContestant team2;

    /**
     * The results of the match.
     */
    private IResult results;

    /**
     * Constructs a {@link Match} between two {@link IContestant}s.
     * @param team1 Team 1.
     * @param team2 Team 2.
     * @param results The results of the match.
     */
    public Match(IContestant team1, IContestant team2, IResult results) {
        this.team1 = team1;
        this.team2 = team2;
        this.results = results;
    }

    /**
     * Gets team 1.
     * @return Team 1.
     */
    public IContestant getTeam1() {
        return team1;
    }

    /**
     * Gets team 2.
     * @return Team 2.
     */
    public IContestant getTeam2() {
        return team2;
    }

    /**
     * Gets the results of the match.
     * @return The results of the match.
     */
    public IResult getResults() {
        return results;
    }

    /**
     * Gets the winner of the match based on the criteria for each specific {@link IResult}.
     * @return The winner of the match.
     */
    public IContestant winner() {
        if (results instanceof RoboticsResult) {
            RoboticsResult matchResults = (RoboticsResult) results;
            boolean didTeam1Fall = matchResults.didTeam1DidFallDown();
            boolean didTeam2Fall = matchResults.didTeam2DidFallDown();
            int team1Points = (didTeam1Fall ? matchResults.getTeam1Points() - 5 : matchResults.getTeam1Points());
            int team2Points =(didTeam2Fall ? matchResults.getTeam2Points() - 5 : matchResults.getTeam2Points());
            int team1Tasks = matchResults.getTeam1AttemptedTasks();
            int team2Tasks = matchResults.getTeam2AttemptedTasks();

            return (team1Points + team1Tasks > team2Points + team2Tasks ? team1 : team2);
        } else {
            RugbyResult matchResults = (RugbyResult) results;

            return (matchResults.getTeam1points() > matchResults.getTeam2points() ? team1 : team2);
        }
    }

    /**
     * Whether or not the winner was not expected to win.
     * @return <code>true</code> if so, <code>false</code> if not.
     */
    public boolean underdogWon() {
        IContestant winner = winner();
        IContestant loser = (winner.equals(team1) ? team2 : team1);

        return !winner.expectToBeat(loser);
    }
}
