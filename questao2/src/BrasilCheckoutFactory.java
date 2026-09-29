public class BrasilCheckoutFactory implements CheckoutFactory {

    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new NotaFiscalEletronica();
    }

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoPix();
    }

    // TODO: criarEtiquetaEnvio
}
