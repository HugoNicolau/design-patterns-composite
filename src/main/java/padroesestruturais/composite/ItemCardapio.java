package padroesestruturais.composite;

// Componente: produto avulso e combo são tratados do mesmo jeito.
public abstract class ItemCardapio {

    private String nome;

    public ItemCardapio(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract float getPreco();
}
