package basicinterp.instruction;

/**
 * User: Pavel
 * Date: 13.10.11
 */
public final class PrintInstruction extends Instruction {

    private Printable target;

    public PrintInstruction(Printable target) {
        this.target = target;
    }

    @Override
    public  void execute() {
        System.out.println(target.representation());
    }
}
