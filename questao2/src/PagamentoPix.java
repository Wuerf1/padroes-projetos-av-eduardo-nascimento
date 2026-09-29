public class PagamentoPix implements Pagamento {

    @Override
    public String processar(double valorPedido) {
        return String.format("Pagamento via Pix: R$ %.2f", valorPedido);
    }
}
