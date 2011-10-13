package basicinterp.logic;

import basicinterp.math.MathExpression;

/**
 * User: Pavel
 * Date: 13.10.11
 */
public abstract class LogicExpression {

    private MathExpression leftArg;
    private MathExpression rightArg;

    public LogicExpression(MathExpression leftArg, MathExpression rightArg) {
        this.leftArg = leftArg;
        this.rightArg = rightArg;
    }

    public boolean evaluate() {
        return evaluate(leftArg.evaluate(), rightArg.evaluate());
    }

    protected abstract boolean evaluate(int leftArg, int rightArg);

}
