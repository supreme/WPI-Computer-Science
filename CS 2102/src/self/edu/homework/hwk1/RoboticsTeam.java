package self.edu.homework.hwk1;

/**
 * Represents a {@link RoboticsTeam}.
 * @author Stephen Andrews
 * @author Ted Bieber
 */
public class RoboticsTeam implements IContestant {

    /**
     * The school the team is from.
     */
    private String school;

    /**
     * The special feature of the team's robot.
     */
    private String specialFeature;

    /**
     * The team's rank in the competition.
     */
    private int rank;

    /**
     * Constructs an {@link RoboticsTeam} object.
     * @param school The school the team is from.
     * @param specialFeature The special feature of the team's robot.
     * @param rank The team's rank in the competition.
     */
    public RoboticsTeam(String school, String specialFeature, int rank) {
        this.school = school;
        this.specialFeature = specialFeature;
        this.rank = rank;
    }

    /**
     * Gets the school the team is from.
     * @return The school the team is from.
     */
    public String getSchool() {
        return school;
    }

    /**
     * Gets the special feature of the team's robot.
     * @return The special feature of the robot.
     */
    public String getSpecialFeature() {
        return specialFeature;
    }

    /**
     * Gets the team's rank in the competition.
     * @return The team's rank.
     */
    public int getRank() {
        return rank;
    }

    /**
     * Sets the team's rank.
     * @param rank The new rank to be set.
     */
    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public boolean expectToBeat(IContestant opponent) {
        RoboticsTeam o = (RoboticsTeam) opponent;
        String oSpecial = o.getSpecialFeature();

        if (oSpecial.length() > specialFeature.length()) {
            return false;
        } else if (specialFeature.length() > oSpecial.length()) {
            return true;
        } else {
            return false;
        }
    }
}
