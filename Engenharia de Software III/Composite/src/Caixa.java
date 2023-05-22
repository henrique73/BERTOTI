import java.util.ArrayList;
import java.util.List;

class Caixa implements Component {
    private List<Component> produtos = new ArrayList<>();

    public void adicionarProduto(Component produto) {
        produtos.add(produto);
    }

    public void removerProduto(Component produto) {
        produtos.remove(produto);
    }

    public void print() {
        for (Component produtos : produtos) {
            produtos.print();
        }
    }
}