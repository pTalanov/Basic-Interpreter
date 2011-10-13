package basicinterp.string;

import basicinterp.instruction.Printable;

/**
 * User: Pavel
 * Date: 13.10.11
 */
public abstract class StringExpression implements Printable {
    public StringExpression() {

    }

    public abstract String evaluate();

    public String representation() {
        return evaluate();
    }
}
