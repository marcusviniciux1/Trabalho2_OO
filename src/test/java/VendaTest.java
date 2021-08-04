import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendaTest {

    @Test
    void verificaClienteNulo() {
        try {
            Produto produto = new Produto("Tênis", 20, 1200.00f, 5, 50);
            Venda venda = new Venda("12/06/2021", null, produto, 1);
        } catch (IllegalArgumentException e) {
            assertEquals("Cliente não informado.", e.getMessage());
        }
    }

}