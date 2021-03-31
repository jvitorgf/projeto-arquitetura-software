
import com.mycompany.sacorrecaosolo.CorrecaoSolo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteCorrecaoSolo {
    CorrecaoSolo ca = new CorrecaoSolo();
    
    @Test
    public void testaValoresIdeaisArgiloso(){
        assertArrayEquals(new double[]{9,0.35,6,1.5,9,0},ca.calcIdeal(1));
    }
    @Test
    public void testaValoresIdeaisTextMedia(){
        assertArrayEquals(new double[]{12,0.25,4,1,6,0},ca.calcIdeal(2));
    }
    @Test
    public void testaCorrecaoFosforoSuperfosfatoSimples(){
        assertEquals(233,ca.correcaoFosforo(8.59, 1, 15, 70));
    }
    @Test
    public void testaCorrecaoFosforoDAP(){
        assertEquals(93.2,ca.correcaoFosforo(8.59, 4, 15, 70));
    }
    @Test
    public void testaCorrecaoFosforoDaoui(){
        assertEquals(131.06,ca.correcaoFosforo(8.59, 8, 15, 70));
    }
}
    

