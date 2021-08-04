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

    @Test
    void verificaMetodoVenderDebitarEstoque() {
        Cliente cliente = new Cliente("Nicolas", "0987654321");
        Produto produto = new Produto("Mouse", 20, 140.00f, 10, 200);
        Venda venda = new Venda("02/02/2021", cliente, produto, 1);
        assertTrue(venda.vender(produto, 1));
    }

    @Test
    void verificaMetodoVenderEstoqueInsuficiente() {
        Cliente cliente = new Cliente("Marcus", "0987654321");
        Produto produto = new Produto("Mouse", 20, 140.00f, 10, 200);
        Venda venda = new Venda("02/02/2021", cliente, produto, 1);
        assertFalse(venda.vender(produto, 21));
    }
}