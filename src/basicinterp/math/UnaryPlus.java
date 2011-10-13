package basicinterp.math;

public final class UnaryPlus extends UnaryOperation {

    public UnaryPlus(MathExpression arg) {
        super(arg);
    }

    @Override
    protected int evaluate(int arg) {
        return arg;
    }
}
