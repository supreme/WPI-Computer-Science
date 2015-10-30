package self.edu.homework.hwk1.model;

import self.edu.homework.hwk1.Match;

/**
 * Represents the results of a {@link Match}.
 * @author Stephen Andrews
 * @author Ted Bieber
 */
public interface IResult {

    /**
     * Determines whether or not the result of a {@link Match}
     * is valid.
     * @return <code>true</code> if so, <code>false</code> if not.
     */
    boolean isValid();
}
