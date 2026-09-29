public class EmissorResidencial extends EmissorApolice {

    @Override
    protected Apolice criarApolice(String segurado, double valorImovel) {
        return new ApoliceResidencial(segurado, valorImovel);
    }
}
