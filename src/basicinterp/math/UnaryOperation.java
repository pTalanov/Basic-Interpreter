package basicinterp.math;

abstract public class UnaryOperation extends MathExpression {

    private MathExpression arg;

    public UnaryOperation(MathExpression arg) {
        this.arg = arg;
    }

    abstract protected int evaluate(int arg);

    public int evaluate() {
        return evaluate(arg.evaluate());
    }

}
