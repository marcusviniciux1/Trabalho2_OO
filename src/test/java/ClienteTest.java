
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void verificaCpfNulo(){
        try{
            Cliente cliente = new Cliente("Vinícius", null);
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("CPF não informado.", e.getMessage());
        }
    }

}