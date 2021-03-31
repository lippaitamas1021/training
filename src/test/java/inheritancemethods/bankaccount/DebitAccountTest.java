package inheritancemethods.bankaccount;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DebitAccountTest {

    @Test
    public void constructorTest() {
        DebitAccount debitAccount = new DebitAccount("111111-2222222", 50000);
        assertEquals("111111-2222222", debitAccount.getAccountNumber());
        assertEquals(50000L, debitAccount.getBalance());
    }

    @Test
    public void costOfTransaction() {
        DebitAccount debitAccount = new DebitAccount("111111-2222222", 50000);
        assertEquals(450L, debitAccount.costOfTransaction(15027));
    }

    @Test
    public void costOfTransactionLow() {
        DebitAccount debitAccount = new DebitAccount("111111-2222222", 50000);
        assertEquals(200L, debitAccount.costOfTransaction(6000));
    }

    @Test
    public void transactionSuccess() {
        DebitAccount debitAccount = new DebitAccount("111111-2222222", 50000);
        assertTrue(debitAccount.transaction(40000));
        assertEquals(8800L, debitAccount.getBalance());
    }

    @Test
    public void transactionFail() {
        DebitAccount debitAccount = new DebitAccount("111111-2222222", 50000);
        assertFalse(debitAccount.transaction(60000));
        assertEquals(50000L, debitAccount.getBalance());
    }
}
