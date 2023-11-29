package user_exception.exception;

public class ShortException extends Exception{
    public ShortException() {
        super("User name or password too short");
    }

    public ShortException(String message) {
        super(message);
    }
}
