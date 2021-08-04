import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompraTest {

    @Test
    void verificaPrecoUnitMenorOuIgualAZero() {
        try {
            Produto produto = new Produto("Mesa", 10, -1.00f, 10, 100);
            Fornecedor fornecedor = new Fornecedor("Nicolas", "0987654321");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Preço unitário menor ou igual a zero.", e.getMessage());
        }
    }

    @Test
    void verificaFornecedorNulo() {
        try {
            Produto produto = new Produto("Mesa", 10, 300.00f, 10, 100);
            Compra compra = new Compra("07/05/2021", produto, null, 1, 300.00f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Fornecedor não informado.", e.getMessage());
        }
    }

    @Test
    void verificaMetodoCompraTrue() {
        Produto produto = new Produto("Mouse", 20, 140.00f, 10, 300);
        Fornecedor fornecedor = new Fornecedor("Marcus", "0987654321");
        Compra compra = new Compra("20/07/2021", produto, fornecedor, 1, 140.00f);
        assertTrue(compra.comprar(produto, 2));
    }

    @Test
    void verificaMetodoCompraFalse() {
        Produto produto = new Produto("Mouse", 289, 140.00f, 10, 300);
        Fornecedor fornecedor = new Fornecedor("Marcus", "0987654321");
        Compra compra = new Compra("20/07/2021", produto, fornecedor, 1, 140.00f);
        assertFalse(compra.comprar(produto, 22));
    }
}