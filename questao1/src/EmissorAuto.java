public class EmissorAuto extends EmissorApolice {

    @Override
    protected Apolice criarApolice(String segurado, double valorVeiculo) {
        return new ApoliceAuto(segurado, valorVeiculo);
    }
}
