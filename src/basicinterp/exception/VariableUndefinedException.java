package basicinterp.exception;

public class VariableUndefinedException extends RuntimeException {
    public VariableUndefinedException(String message) {
        super(message);
    }
}
