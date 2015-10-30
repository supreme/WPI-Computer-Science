package self.edu.homework.hwk1.model;

import self.edu.homework.hwk1.Match;

/**
 * An interface for contestants in a {@link Match}.
 * @author Stephen Andrews
 * @author Ted Bieber
 */
public interface IContestant {

    /**
     * Determines whether or not the contestant will
     * beat their opponent in the {@link Math}.
     * @param opponent The contestant's opponent.
     * @return <code>true</code> if so, <code>false</code> if not.
     */
    boolean expectToBeat(IContestant opponent);

}
