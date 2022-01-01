package pl.adamd.coms.core.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException() {
        super("Employee not found.");
    }
}
