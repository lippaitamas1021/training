package inheritancemethods.bankaccount;

public class DebitAccount {

    private String accountNumber;
    private long balance;

    private static final double COST = 3.0;
    private static final long MIN_COST = 200;

    public DebitAccount(String accountNumber, long balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public long costOfTransaction(int amount) {
        if (MIN_COST < amount / 100.0 * COST) {
            return (long) (amount / 100.0 * COST);
        }
            return MIN_COST;
    }

    public boolean transaction(int amount) {
        if (0 <= (balance - amount - costOfTransaction(amount))) {
            this.balance -= amount + costOfTransaction(amount);
            return true;
        }
        return false;
    }

    public void balanceToZero() {
        if (0 < balance) {
            balance = 0;
        }
    }
}
