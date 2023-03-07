public class Main {
    public static void main(String[] args) {
        ContaBancaria banco = new ContaBancaria();

        banco.setPagamento(new PagamentoCredito());
        banco.realizarPagamento();

        banco.setPagamento(new PagamentoDebito());
        banco.realizarPagamento();
    }
}