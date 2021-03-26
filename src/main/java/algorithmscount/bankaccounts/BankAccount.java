package algorithmscount.bankaccounts;

public class BankAccount {

    private String nameOfOwner;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, double balance) {
        this.nameOfOwner = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
