
public class Main {
    public static void main(String[] args) {
        Component produto1 = new Produto("Latas");
        Component produto2 = new Produto("Celular");
        Component produto3 = new Produto("Copos");

        Caixa caixa = new Caixa();

        caixa.adicionarProduto(produto1);
        caixa.adicionarProduto(produto2);

        Caixa caixaMenor = new Caixa();
        caixaMenor.adicionarProduto(produto3);

        caixa.adicionarProduto(caixaMenor);

        caixa.print();
    }
}