package algorithmscount.bankaccounts;

import java.util.List;

public class BankAccountConditionCounter {

    public int countWithBalanceGreaterThan(List<BankAccount> bankAccounts, int level) {
        int counter = 0;
        for (BankAccount bankAccount : bankAccounts) {
            if (level < bankAccount.getBalance()) {
                counter++;
            }
        }
        return counter;
    }
}
