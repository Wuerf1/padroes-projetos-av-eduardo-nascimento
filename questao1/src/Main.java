public class Main {

    public static void main(String[] args) {
        new EmissorAuto().emitir("João Silva", 60_000.0);
        new EmissorResidencial().emitir("Maria Souza", 400_000.0);
        new EmissorVida().emitir("Carlos Pereira", 600_000.0);
    }
}
