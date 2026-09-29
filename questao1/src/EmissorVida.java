public class EmissorVida extends EmissorApolice {

    @Override
    protected Apolice criarApolice(String segurado, double capitalSegurado) {
        return new ApoliceVida(segurado, capitalSegurado);
    }
}
