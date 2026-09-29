import java.util.List;

public class ApoliceAuto extends Apolice {

    public ApoliceAuto(String segurado, double valorVeiculo) {
        super(segurado, valorVeiculo);
    }

    @Override
    public String getLinhaProduto() {
        return "Auto";
    }

    @Override
    public double calcularPremioMensal() {
        return valorSegurado * 0.08 / 12;
    }

    @Override
    public List<String> getDocumentos() {
        return List.of("CNH", "CRLV");
    }
}
