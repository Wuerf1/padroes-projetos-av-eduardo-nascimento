public abstract class EmissorApolice {

    protected abstract Apolice criarApolice(String segurado, double valorSegurado);

    public final void emitir(String segurado, double valorSegurado) {
        Apolice apolice = criarApolice(segurado, valorSegurado);
        double premioMensal = apolice.calcularPremioMensal();
        System.out.println(apolice.gerarResumo(premioMensal));
        System.out.println();
    }
}
