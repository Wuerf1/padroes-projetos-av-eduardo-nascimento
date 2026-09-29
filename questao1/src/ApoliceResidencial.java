import java.util.List;

public class ApoliceResidencial extends Apolice {

    public ApoliceResidencial(String segurado, double valorImovel) {
        super(segurado, valorImovel);
    }

    @Override
    public String getLinhaProduto() {
        return "Residencial";
    }

    @Override
    public double calcularPremioMensal() {
        return valorSegurado * 0.015 / 12;
    }

    @Override
    public List<String> getDocumentos() {
        return List.of("Escritura ou contrato de locação");
    }
}
