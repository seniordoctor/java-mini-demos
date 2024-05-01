//We need to write that BalanceInsufficentException is extended from Exception class.
public class BalanceInsufficentException extends Exception {
    String message;
    public BalanceInsufficentException(String message) {
        this.message = message;
    }
    @Override
    public String getMessage() {
        return this.message;
    }
}
