package self.edu.homework.hwk1;

/**
 * Represents the results of a rugby {@link Match}.
 * @author Stephen Andrews
 * @author Ted Bieber
 */
public class RugbyResult implements IResult {

    /**
     * The amount of points accumulated by team 1.
     */
    private int team1points;

    /**
     * The amount of points accumulated by team 2.
     */
    private int team2points;

    /**
     * Constructs a {@link RugbyResult} object.
     * @param team1points The amount of points accumulated by team 1.
     * @param team2points The amount of points accumulated by team 2.
     */
    public RugbyResult(int team1points, int team2points) {
        this.team1points = team1points;
        this.team2points = team2points;
    }

    /**
     * Gets the amount of points accumulated by team 1.
     * @return The amount of points accumulated by team 1.
     */
    public int getTeam1points() {
        return team1points;
    }

    /**
     * Sets the amount of points of team 1.
     * @param team1points The new value of points to set.
     */
    public void setTeam1points(int team1points) {
        this.team1points = team1points;
    }

    /**
     * Gets the amount of points accumulated by team 2.
     * @return The amount of points accumulated by team 2.
     */
    public int getTeam2points() {
        return team2points;
    }

    /**
     * Sets the amount of points of team 2.
     * @param team2points The new value of points to set.
     */
    public void setTeam2points(int team2points) {
        this.team2points = team2points;
    }

    @Override
    public boolean isValid() {
        return (team1points < 150 && team2points < 150);
    }

}
