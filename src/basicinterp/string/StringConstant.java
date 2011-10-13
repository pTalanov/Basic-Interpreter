package basicinterp.string;

/**
 * User: Pavel
 * Date: 13.10.11
 */
public final class StringConstant extends StringExpression {
    private final String value;

    public StringConstant(String value) {
        this.value = value;
    }

    @Override
    public String evaluate() {
        return value;
    }
}
