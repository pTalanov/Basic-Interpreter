package basicinterp.math;

public final class Constant extends MathExpression {

    private final int value;

    public Constant(int value) {
        this.value = value;
    }

    public int evaluate() {
        return value;
    }
}
