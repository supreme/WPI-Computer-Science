package self.edu.homework.hwk1.model.rugby;

import self.edu.homework.hwk1.model.IResult;

/**
 * @author Stephen Andrews
 */
public class RugbyResult implements IResult {

    private int team1points;

    private int team2points;

    public RugbyResult(int team1points, int team2points) {
        this.team1points = team1points;
        this.team2points = team2points;
    }

    public int getTeam1points() {
        return team1points;
    }

    public void setTeam1points(int team1points) {
        this.team1points = team1points;
    }

    public int getTeam2points() {
        return team2points;
    }

    public void setTeam2points(int team2points) {
        this.team2points = team2points;
    }

    @Override
    public boolean isValid() {
        return false;
    }
}
