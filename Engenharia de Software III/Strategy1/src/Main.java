public class Main {
    public static void main(String[] args) {
        ContaBancaria cliente = new ContaBancaria();

        cliente.setPagamento(new PagamentoCredito());
        cliente.realizarPagamento();

        cliente.setPagamento(new PagamentoDebito());
        cliente.realizarPagamento();
    }
}