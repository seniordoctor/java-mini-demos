public class AccountManager {
    private double balance;

    public void deposit(double amount) {
        balance = getBalance() + amount;
    }

    //We have an exception we wrote called BalanceInsufficentException and we want to return it as a throw.
    public void withdraw(double amount) throws BalanceInsufficentException {
        if (balance >= amount) {
            balance = getBalance() - amount;
        }else {
            throw new BalanceInsufficentException("Bakiye yetersiz");
        }

    }

    public double getBalance() {
        return balance;
    }
}