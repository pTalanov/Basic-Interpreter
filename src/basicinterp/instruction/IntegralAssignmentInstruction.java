package basicinterp.instruction;

import basicinterp.math.IntegralVariable;
import basicinterp.math.MathExpression;

/**
 * User: Pavel
 * Date: 13.10.11
 */
public final class IntegralAssignmentInstruction extends Instruction {

    private IntegralVariable variable;
    private MathExpression expression;

    public IntegralAssignmentInstruction(IntegralVariable variable, MathExpression expression) {
        this.variable = variable;
        this.expression = expression;
    }

    public void execute() {
        variable.setValue(expression.evaluate());
    }
}
