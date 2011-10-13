package basicinterp.math;

import basicinterp.instruction.Printable;

public abstract class MathExpression implements Printable {

    abstract public int evaluate();

    public String representation() {
        return String.valueOf(evaluate());
    }

}
