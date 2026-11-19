package padroesestruturais.composite;

import java.util.ArrayList;
import java.util.List;

// Composto: contém produtos e/ou outros combos, e soma o preço de todos.
public class Combo extends ItemCardapio {

    private List<ItemCardapio> itens;

    public Combo(String nome) {
        super(nome);
        this.itens = new ArrayList<ItemCardapio>();
    }

    public void adicionarItem(ItemCardapio item) {
        this.itens.add(item);
    }

    public float getPreco() {
        float total = 0;
        for (ItemCardapio item : itens) {
            total += item.getPreco();
        }
        return total;
    }
}
