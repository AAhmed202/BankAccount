import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.security.PublicKey;

public class BankAccountTest {
    @Test
    public void testDeposit(){
        BankAccount Acc1 = new BankAccount(500,50,"Azan");
        Assertions.assertEquals(600, Acc1.deposit(100));
    }
    @Test
    public void testWithdraw(){
        BankAccount Acc1 = new BankAccount(500,50,"Azan");
        Assertions.assertEquals(400, Acc1.withdraw(100));
    }

}
