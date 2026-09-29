import java.util.List;

public class ApoliceVida extends Apolice {

    public ApoliceVida(String segurado, double capitalSegurado) {
        super(segurado, capitalSegurado);
    }

    @Override
    public String getLinhaProduto() {
        return "Vida";
    }

    @Override
    public double calcularPremioMensal() {
        return valorSegurado * 0.03 / 12;
    }

    @Override
    public List<String> getDocumentos() {
        return List.of("Documento de identidade", "CPF");
    }
}
