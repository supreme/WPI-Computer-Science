package self.edu.homework.hwk1;

import self.edu.homework.hwk1.model.IContestant;
import self.edu.homework.hwk1.model.IResult;

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
        return team1; //TODO
    }

    public boolean underdogWon() {
        return false; //TODO
    }

}
