package padroesestruturais.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MesaTest {

    @Test
    void deveRetornarPrecoProdutoAvulso() {
        Produto sorvete = new Produto("Sorvete", 9.0f);

        Mesa mesa = new Mesa();
        mesa.setPedido(sorvete);

        assertEquals(9.0f, mesa.getTotal(), 0.01f);
    }

    @Test
    void deveRetornarPrecoComboSimples() {
        Combo comboClassico = new Combo("Combo Clássico");
        comboClassico.adicionarItem(new Produto("X-Burguer", 25.0f));
        comboClassico.adicionarItem(new Produto("Refrigerante", 7.0f));

        Mesa mesa = new Mesa();
        mesa.setPedido(comboClassico);

        assertEquals(32.0f, mesa.getTotal(), 0.01f);
    }

    @Test
    void deveRetornarTotalPedidoComCombosDentroDeCombo() {
        Combo comboClassico = new Combo("Combo Clássico");
        comboClassico.adicionarItem(new Produto("X-Burguer", 25.0f));
        comboClassico.adicionarItem(new Produto("Refrigerante", 7.0f));

        Combo comboKids = new Combo("Combo Kids");
        comboKids.adicionarItem(new Produto("Mini Burguer", 15.0f));
        comboKids.adicionarItem(new Produto("Suco", 6.0f));
        comboKids.adicionarItem(new Produto("Batata Pequena", 5.0f));

        Combo pedido = new Combo("Pedido Mesa 3");
        pedido.adicionarItem(comboClassico);
        pedido.adicionarItem(comboKids);
        pedido.adicionarItem(new Produto("Sorvete", 9.0f));

        Mesa mesa = new Mesa();
        mesa.setPedido(pedido);

        assertEquals(67.0f, mesa.getTotal(), 0.01f);
    }

    @Test
    void deveRetornarPrecoZeroComboVazio() {
        Combo combo = new Combo("Combo Vazio");

        Mesa mesa = new Mesa();
        mesa.setPedido(combo);

        assertEquals(0.0f, mesa.getTotal(), 0.01f);
    }

    @Test
    void deveRetornarExcecaoMesaSemPedido() {
        try {
            Mesa mesa = new Mesa();
            mesa.getTotal();
            fail();
        }
        catch (IllegalStateException e) {
            assertEquals("Mesa sem pedido", e.getMessage());
        }
    }
}
