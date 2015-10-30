package self.edu.homework.hwk1.model.robotics;

import self.edu.homework.hwk1.model.IContestant;

/**
 * Represents a {@link RoboticsTeam}.
 * @author Stephen Andrews
 * Ted Bieber
 */
public class RoboticsTeam implements IContestant {

    private String school;

    private String specialFeature;

    private int rank;

    public RoboticsTeam(String school, String specialFeature, int rank) {
        this.school = school;
        this.specialFeature = specialFeature;
        this.rank = rank;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSpecialFeature() {
        return specialFeature;
    }

    public void setSpecialFeature(String specialFeature) {
        this.specialFeature = specialFeature;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String getTeamOrigin() {
        return null;
    }

    @Override
    public boolean expectToBeat(IContestant opponent) {
        return false;
    }

}
