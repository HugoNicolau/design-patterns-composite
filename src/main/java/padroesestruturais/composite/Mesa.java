package padroesestruturais.composite;

public class Mesa {

    private ItemCardapio pedido;

    public void setPedido(ItemCardapio pedido) {
        this.pedido = pedido;
    }

    public float getTotal() {
        if (this.pedido == null) {
            throw new IllegalStateException("Mesa sem pedido");
        }
        return this.pedido.getPreco();
    }
}
