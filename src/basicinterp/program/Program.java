package basicinterp.program;

import basicinterp.instruction.Instruction;
import basicinterp.math.IntegralVariable;
import basicinterp.string.StringVariable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * User: Pavel
 * Date: 13.10.11
 */
public final class Program {

    private List<Instruction> instructions = new ArrayList<Instruction>();
    private Map<String, StringVariable> stringVariableTable
            = new HashMap<String, StringVariable>();
    private Map<String, IntegralVariable> integralVariableTable
            = new HashMap<String, IntegralVariable>();

    public Program() {

    }

    public void addInstruction(Instruction instruction) {
        instructions.add(instruction);
    }

    public void run() {
        for (Instruction instruction : instructions) {
            instruction.execute();
        }
    }

    public IntegralVariable getIntegralVariable(String name) {
        IntegralVariable variable = integralVariableTable.get(name);
        if (variable == null)
        {
            variable = new IntegralVariable(name);
            integralVariableTable.put(name, variable);
        }
        return variable;
    }

    public StringVariable getStringVariable(String name) {
        StringVariable variable = stringVariableTable.get(name);
        if (variable == null)
        {
            variable = new StringVariable(name);
            stringVariableTable.put(name, variable);
        }
        return variable;
    }

}
