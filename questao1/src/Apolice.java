import java.util.List;

public abstract class Apolice {

    protected final String segurado;
    protected final double valorSegurado;

    protected Apolice(String segurado, double valorSegurado) {
        this.segurado = segurado;
        this.valorSegurado = valorSegurado;
    }

    public abstract String getLinhaProduto();

    public abstract double calcularPremioMensal();

    public abstract List<String> getDocumentos();

    public String gerarResumo(double premioMensal) {
        return "Linha de produto: " + getLinhaProduto() + "\n"
            + "Segurado: " + segurado + "\n"
            + String.format("Prêmio mensal: R$ %.2f%n", premioMensal)
            + "Documentos exigidos: " + String.join(", ", getDocumentos());
    }
}
