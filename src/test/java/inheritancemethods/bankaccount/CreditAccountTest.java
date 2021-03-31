package inheritancemethods.bankaccount;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditAccountTest {

    @Test
    public void constructorTest() {
        CreditAccount creditAccount = new CreditAccount("11111111-22222222", 100000, 50000);
        assertEquals("11111111-22222222", creditAccount.getAccountNumber());
        assertEquals(100000L, creditAccount.getBalance());
        assertEquals(50000L, creditAccount.getOverdraftLimit());
    }

    @Test
    public void transactionSuccess() {
        CreditAccount creditAccount = new CreditAccount("11111111-22222222", 100000, 50000);
        assertTrue(creditAccount.transaction(40000));
        assertEquals(58800L, creditAccount.getBalance());
        assertEquals(50000L, creditAccount.getOverdraftLimit());
    }

    @Test
    public void transactionSuccessWithOverdraf() {
        CreditAccount creditAccount = new CreditAccount("11111111-22222222", 100000, 50000);
        assertTrue(creditAccount.transaction(140000));
        assertEquals(0L, creditAccount.getBalance());
        assertEquals(5800L, creditAccount.getOverdraftLimit());
    }

    @Test
    public void transactionSuccessWithLowAmount() {
        CreditAccount creditAccount = new CreditAccount("11111111-22222222", 100000, 50000);
        assertTrue(creditAccount.transaction(1000));
        assertEquals(98800L, creditAccount.getBalance());
        assertEquals(50000L, creditAccount.getOverdraftLimit());
    }


    @Test
    public void transactionFail() {
        CreditAccount creditAccount = new CreditAccount("11111111-22222222", 100000, 50000);
        assertFalse(creditAccount.transaction(160000));
        assertEquals(100000L, creditAccount.getBalance());
        assertEquals(50000L, creditAccount.getOverdraftLimit());
    }
}
