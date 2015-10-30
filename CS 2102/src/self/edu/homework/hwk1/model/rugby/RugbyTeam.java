package self.edu.homework.hwk1.model.rugby;

import self.edu.homework.hwk1.model.IContestant;

import java.awt.*;

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
    private int loses;

    /**
     * Constructs an {@link RugbyTeam}.
     * @param country The country the team belongs to.
     * @param jersey The color of the team's jersey.
     * @param hasIntimidationRitual Whether or not the team has a pre-game intimidation ritual.
     * @param wins The amount of wins the team has.
     * @param loses The amount of losses the team has.
     */
    public RugbyTeam(String country, String jersey, boolean hasIntimidationRitual, int wins, int loses) {
        this.country = country;
        this.jersey = jersey;
        this.hasIntimidationRitual = hasIntimidationRitual;
        this.wins = wins;
        this.loses = loses;
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
    public boolean isHasIntimidationRitual() {
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
     * Gets the amount of loses the team has.
     * @return The amount of loses the team has.
     */
    public int getLoses() {
        return loses;
    }

    /**
     * Sets the amount of losses the team has.
     * @param loses The new loses value to set.
     */
    public void setLoses(int loses) {
        this.loses = loses;
    }

    @Override
    public boolean expectToBeat(IContestant opponent) {
        return false;
    }
}
