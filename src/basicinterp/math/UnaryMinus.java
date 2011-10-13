package basicinterp.math;

public final class UnaryMinus extends UnaryOperation {

    public UnaryMinus(MathExpression arg) {
        super(arg);
    }

    @Override
    protected int evaluate(int arg) {
        return -arg;
    }
    
}
