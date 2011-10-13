package basicinterp.string;

import basicinterp.exception.VariableUndefinedException;

/**
 * User: Pavel
 * Date: 13.10.11
 */
public final class StringVariable extends StringExpression {

    private final String name;
    private String value = null;

    public StringVariable(String name) {
        this.name = name;
    }

    @Override
    public String evaluate() {
        if (value == null) {
            throw new VariableUndefinedException("Variable \"" + name + "\" is not defined ");
        }
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
