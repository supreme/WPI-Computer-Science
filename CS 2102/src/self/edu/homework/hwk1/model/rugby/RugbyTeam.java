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
     * Whether or not the team has an pre-game intimidation ritual.
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
     * @param hasIntimidationRitual Whether or not the team has an pre-game intimidation ritual.
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getJersey() {
        return jersey;
    }

    public void setJersey(String jersey) {
        this.jersey = jersey;
    }

    public boolean isHasIntimidationRitual() {
        return hasIntimidationRitual;
    }

    public void setHasIntimidationRitual(boolean hasIntimidationRitual) {
        this.hasIntimidationRitual = hasIntimidationRitual;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLoses() {
        return loses;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }

    @Override
    public String getTeamOrigin() {
        return country;
    }

    @Override
    public boolean expectToBeat(IContestant opponent) {
        return false;
    }
}
