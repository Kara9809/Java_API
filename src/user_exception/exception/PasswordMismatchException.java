package user_exception.exception;

public class PasswordMismatchException extends Exception{
    public PasswordMismatchException() {
        super("It's not the same passwords...");

    }

    public PasswordMismatchException(String message) {
        super(message);
    }
}
