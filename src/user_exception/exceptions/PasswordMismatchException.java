package user_exception.exceptions;

public class PasswordMismatchException extends Exception{
    public PasswordMismatchException() {
        super("Passwords are not the same...");
    }

    public PasswordMismatchException(String message) {
        super(message);
    }
}
