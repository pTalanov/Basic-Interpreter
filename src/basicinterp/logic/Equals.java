package basicinterp.logic;

import basicinterp.math.MathExpression;

/**
 * User: Pavel
 * Date: 13.10.11
 */

public final class Equals extends LogicExpression {

    public Equals(MathExpression leftArg, MathExpression rightArg) {
        super(leftArg, rightArg);
    }

    protected boolean evaluate(int leftArg, int rightArg) {
        return (leftArg == rightArg);
    }
}
