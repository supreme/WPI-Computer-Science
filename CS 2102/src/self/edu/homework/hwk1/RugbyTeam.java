package self.edu.homework.hwk1;

/**
 * Represents a {@link RugbyTeam}.
 * @author Stephen Andrews
 * @author Ted Bieber
 */
public class RugbyTeam implements IContestant {

    /**
     * The country the team belongs to.
     */
    private String country;

    /**
     * The color of the team's jersey.
     */
    private String jersey;

    /**
     * Whether or not the team has a pre-game intimidation ritual.
     */
    private boolean hasIntimidationRitual;

    /**
     * The amount of wins the team has.
     */
    private int wins;

    /**
     * The amount of losses the team has.
     */
    private int losses;

    /**
     * Constructs an {@link RugbyTeam}.
     * @param country The country the team belongs to.
     * @param jersey The color of the team's jersey.
     * @param hasIntimidationRitual Whether or not the team has a pre-game intimidation ritual.
     * @param wins The amount of wins the team has.
     * @param losses The amount of losses the team has.
     */
    public RugbyTeam(String country, String jersey, boolean hasIntimidationRitual, int wins, int losses) {
        this.country = country;
        this.jersey = jersey;
        this.hasIntimidationRitual = hasIntimidationRitual;
        this.wins = wins;
        this.losses = losses;
    }

    /**
     * Gets the country the team belongs to.
     * @return The country the team belongs to.
     */
    public String getCountry() {
        return country;
    }

    /**
     * Gets the color of the team's jersey.
     * @return The color of the team's jersey.
     */
    public String getJersey() {
        return jersey;
    }


    /**
     * Whether or not the team has a pre-game intimidation ritual.
     * @return <code>true</code> if so, <code>false</code> if not.
     */
    public boolean hasIntimidationRitual() {
        return hasIntimidationRitual;
    }

    /**
     * Gets the amount of wins the team has.
     * @return The amount of wins the team has.
     */
    public int getWins() {
        return wins;
    }

    /**
     * Sets the amount of wins the team has.
     * @param wins The new win value to set.
     */
    public void setWins(int wins) {
        this.wins = wins;
    }

    /**
     * Gets the amount of losses the team has.
     * @return The amount of losses the team has.
     */
    public int getLosses() {
        return losses;
    }

    /**
     * Sets the amount of losses the team has.
     * @param losses The new losses value to set.
     */
    public void setLosses(int losses) {
        this.losses = losses;
    }

    /**
     * Gets the win/loss ratio for the team.
     * @return The win/loss ratio for the team.
     */
    private double getWinLossRatio() {
        return (double) wins/losses;
    }

    @Override
    public boolean expectToBeat(IContestant opponent) {
        RugbyTeam o = (RugbyTeam) opponent;
        if (hasIntimidationRitual && !o.hasIntimidationRitual) {
            return true;
        }

        if (getWinLossRatio() > o.getWinLossRatio()) {
            return true;
        }

        return false;
    }
}
