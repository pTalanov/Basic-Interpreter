package basicinterp.instruction;

import basicinterp.string.StringExpression;
import basicinterp.string.StringVariable;

/**
 * User: Pavel
 * Date: 13.10.11
 */
public final class StringAssignmentInstruction extends Instruction {

    final private StringVariable variable;
    final private StringExpression expression;

    public  StringAssignmentInstruction(StringVariable variable, StringExpression expression) {
        this.expression = expression;
        this.variable = variable;
    }

    public void execute() {
        variable.setValue(expression.evaluate());
    }
}
