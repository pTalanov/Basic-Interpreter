package basicinterp.math;

public abstract class BinaryOperation extends MathExpression {

    private MathExpression leftArg;
    private MathExpression rightArg;

    public BinaryOperation(MathExpression left, MathExpression right) {
        this.leftArg = left;
        this.rightArg = right;
    }

    abstract protected int evaluate(int arg1, int arg2);

    public int evaluate() {
        return evaluate(leftArg.evaluate(), rightArg().evaluate());
    }

}
