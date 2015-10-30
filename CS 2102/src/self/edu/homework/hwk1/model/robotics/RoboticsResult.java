package self.edu.homework.hwk1.model.robotics;

import self.edu.homework.hwk1.model.IResult;

/**
 * @author Stephen Andrews
 */
public class RoboticsResult implements IResult {

    private int team1Points;

    private int team1AttemptedTasks;

    private boolean team1DidFallDown;

    private int team2Points;

    private int team2AttemptedTasks;

    private boolean team2DidFallDown;

    public RoboticsResult(int team1Points, int team1AttemptedTasks, boolean team1DidFallDown, int team2Points, int team2AttemptedTasks, boolean team2DidFallDown) {
        this.team1Points = team1Points;
        this.team1AttemptedTasks = team1AttemptedTasks;
        this.team1DidFallDown = team1DidFallDown;
        this.team2Points = team2Points;
        this.team2AttemptedTasks = team2AttemptedTasks;
        this.team2DidFallDown = team2DidFallDown;
    }

    public int getTeam1Points() {
        return team1Points;
    }

    public void setTeam1Points(int team1Points) {
        this.team1Points = team1Points;
    }

    public int getTeam1AttemptedTasks() {
        return team1AttemptedTasks;
    }

    public void setTeam1AttemptedTasks(int team1AttemptedTasks) {
        this.team1AttemptedTasks = team1AttemptedTasks;
    }

    public boolean isTeam1DidFallDown() {
        return team1DidFallDown;
    }

    public void setTeam1DidFallDown(boolean team1DidFallDown) {
        this.team1DidFallDown = team1DidFallDown;
    }

    public int getTeam2Points() {
        return team2Points;
    }

    public void setTeam2Points(int team2Points) {
        this.team2Points = team2Points;
    }

    public int getTeam2AttemptedTasks() {
        return team2AttemptedTasks;
    }

    public void setTeam2AttemptedTasks(int team2AttemptedTasks) {
        this.team2AttemptedTasks = team2AttemptedTasks;
    }

    public boolean isTeam2DidFallDown() {
        return team2DidFallDown;
    }

    public void setTeam2DidFallDown(boolean team2DidFallDown) {
        this.team2DidFallDown = team2DidFallDown;
    }

    @Override
    public boolean isValid() {
        return false;
    }
}
