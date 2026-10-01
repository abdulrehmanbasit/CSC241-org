public class DigitalWallet {

    private double balance;

    public boolean deposit(double amount) {
        if (amount <= 0) {
            return false;
        }

        balance += amount;
        return true;
    }

    public boolean spend(double amount) {
        if (amount <= 0 || amount > balance) {
            return false;
        }

        balance -= amount;
        return true;
    }

    public double getBalance() {
        return balance;
    }

    public boolean canAfford(double amount) {
        return amount > 0 && amount <= balance;
    }
}
