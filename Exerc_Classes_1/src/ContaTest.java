import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContaTest {
 
    @Test
    public void TesteSaque(){
        Conta conta = new Conta("1234" , "123.456.789-00", 200 , 100);
        assertEquals(100, conta.saque(100));
    }

    @Test
    public void testeSaqueExcedenteDoLimite(){
        Conta conta = new Conta("1234" , "123.456.789-00", 200 , 100);
        assertEquals(200, conta.saque(400));
    }

    @Test
    public void testeComSaqueNegativo(){
        Conta conta = new Conta("1234" , "123.456.789-00", 200 , 100);
        assertEquals(200, conta.saque(-1));
    }

    @Test
    public void testeDepositoSemTaxa(){
        Conta conta = new Conta("1234" , "123.456.789-00", 200 , 100);
        assertEquals(400, conta.deposito(200));
    }

    @Test
    public void testeDepositoComTaxa(){
        Conta conta = new Conta("1234" , "123.456.789-00", -10 , 100);
        assertEquals(89.7, conta.deposito(100));
    }

}
