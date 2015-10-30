package self.edu.homework.hwk1;

import self.edu.homework.hwk1.model.IContestant;
import self.edu.homework.hwk1.model.IResult;
import self.edu.homework.hwk1.model.robotics.RoboticsResult;
import self.edu.homework.hwk1.model.rugby.RugbyResult;

/**
 * @author Stephen Andrews
 */
public class Match {

    private IContestant team1;

    private IContestant team2;

    private IResult results;

    public Match(IContestant team1, IContestant team2, IResult results) {
        this.team1 = team1;
        this.team2 = team2;
        this.results = results;
    }

    public IContestant getTeam1() {
        return team1;
    }

    public void setTeam1(IContestant team1) {
        this.team1 = team1;
    }

    public IContestant getTeam2() {
        return team2;
    }

    public void setTeam2(IContestant team2) {
        this.team2 = team2;
    }

    public IResult getResults() {
        return results;
    }

    public void setResults(IResult results) {
        this.results = results;
    }

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

    public boolean underdogWon() {
        return false; //TODO
    }

}
