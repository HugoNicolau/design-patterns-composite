package padroesestruturais.composite;

// Folha: tem o próprio preço e nenhum filho.
public class Produto extends ItemCardapio {

    private float preco;

    public Produto(String nome, float preco) {
        super(nome);
        this.preco = preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return this.preco;
    }

}
