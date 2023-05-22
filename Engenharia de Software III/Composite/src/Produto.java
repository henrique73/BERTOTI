class Produto implements Component {
    private String nome;

    public Produto(String nome) {
        this.nome = nome;
    }

    public void print() {
        System.out.println("Produtos: " + nome);
    }
}
