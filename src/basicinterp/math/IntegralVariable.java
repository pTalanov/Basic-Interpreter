package basicinterp.math;

import basicinterp.exception.VariableUndefinedException;

/**
 * User: Pavel
 * Date: 13.10.11
 */
public final class IntegralVariable extends MathExpression {
    private String name;
    private Integer value = null;

    public IntegralVariable(String name) {
        if ((name == null) || (name.isEmpty())) {
            throw new IllegalArgumentException("Variable name cannot be empty");
        }
        this.name = name;
    }

    @Override
    public int evaluate() {
        if (value == null) {
            throw new VariableUndefinedException("Variable \"" + name + "\" has not been defined");
        }
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
