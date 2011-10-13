package basicinterp.instruction;

import basicinterp.logic.LogicExpression;

/**
 * User: Pavel
 * Date: 13.10.11
 */
public final class ConditionalInstruction extends Instruction {

    private final LogicExpression condition;
    private final Instruction instructionToExecute;

    public ConditionalInstruction(LogicExpression condition, Instruction toExecute) {
        this.condition = condition;
        this.instructionToExecute = toExecute;
    }

    public void execute() {
        if (condition.evaluate()) {
            instructionToExecute.execute();
        }
    }
}
