package classstructureintegrate;

public class Bank {

    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("12345678-87654321-00000000", "Mila Kunis", 1_500_000);
        BankAccount bankAccount2 = new BankAccount("98765432-87654321-00000000", "Trey Parker", 1_000_000);
        System.out.println(bankAccount1.getInfo());
        System.out.println(bankAccount2.getInfo());
        System.out.println(bankAccount1.getBalance());
        System.out.println(bankAccount2.getBalance());
        bankAccount1.deposit(1_100_000);
        bankAccount2.withdraw(700_000);
        System.out.println(bankAccount1.getBalance());
        System.out.println(bankAccount2.getBalance());
        bankAccount1.transfer(bankAccount2, 600_000);
        System.out.println(bankAccount1.getBalance());
        System.out.println(bankAccount2.getBalance());
    }
}
