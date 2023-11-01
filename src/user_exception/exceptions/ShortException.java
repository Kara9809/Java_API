package user_exception.exceptions;

public class ShortException extends Exception{
    public ShortException() {
        super("User name or pass too short");
    }

    public ShortException(String message) {
        super(message);
    }
}
