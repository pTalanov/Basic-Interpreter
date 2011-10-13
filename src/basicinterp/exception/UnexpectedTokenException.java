package basicinterp.exception;

public class UnexpectedTokenException extends RuntimeException {
    public UnexpectedTokenException(String message) {
        super(message);
    }
}
