package basicinterp.logic;

import basicinterp.math.MathExpression;

/**
 * User: Pavel
 * Date: 13.10.11
 */

public final class GreaterThan extends LogicExpression {

    public GreaterThan(MathExpression leftArg, MathExpression rightArg) {
        super(leftArg, rightArg);
    }

    @Override
    protected boolean evaluate(int leftArg, int rightArg) {
        return (leftArg > rightArg);
    }
}