package basicinterp.math;

public final class Division extends BinaryOperation {

    public Division(MathExpression left, MathExpression right) {
        super(left, right);
    }

    @Override
    public int evaluate(int arg1, int arg2) {

        return arg1 / arg2;
    }
}
