import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ProdutoTest {
    
    @Test
    public void calculaPrecoDeVendaCorretamente(){
        Produto cha = new Produto("Cha com gas", 10,10);
        assertEquals(11.0, cha.valorVenda(), 0.01);
    }

    @Test
    public void naoAceitaPrecoNegativo(){
        Produto cha = new Produto("Cha com gas", -10,10);
        assertEquals(0d, cha.valorVenda(), 0.01);
    }

    @Test
    public void naoAceitaMargemAbusiva(){
        Produto cha = new Produto("Cha com gas", 100,100);
        assertEquals(110d, cha.valorVenda(), 0.01);
    }

    @Test
    public void naoAceitaMargemMiseravel(){
        Produto cha = new Produto("Cha com gas", 100,1);
        assertEquals(110d, cha.valorVenda(), 0.01);
    }
}
