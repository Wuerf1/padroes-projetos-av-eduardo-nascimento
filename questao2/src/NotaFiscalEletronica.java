public class NotaFiscalEletronica implements DocumentoFiscal {

    @Override
    public String gerar(double valorPedido) {
        return String.format("NF-e | ICMS (18%%): R$ %.2f", valorPedido * 0.18);
    }
}
