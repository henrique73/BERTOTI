public class ComprarLivro {
    private ProcurarLivro procurarLivro;
    private ProcessarPagamento processarPagamento;
    private EntregarLivro entregarLivro;


    public ComprarLivro() {
        this.procurarLivro = new ProcurarLivro();
        this.processarPagamento = new ProcessarPagamento();
        this.entregarLivro = new EntregarLivro();
    }

    public void comprarLivro(String nomeLivro, String valor, String usuario ,String endereco) {
        procurarLivro.buscarLivroEstoque(nomeLivro);
        processarPagamento.processarPagamento(valor, usuario);
        entregarLivro.entregarLivro(endereco);
    }
}
