public class DadosConta {
    private int numConta;
    private int numAgencia;
    private String gerente;

    public DadosConta(int numConta, int numAgencia, String gerente) {
        this.numConta = numConta;
        this.numAgencia = numAgencia;
        this.gerente = gerente;
    }

    public int getNumConta() {
        return numConta;
    }

    public int getNumAgencia() {
        return numAgencia;
    }

    public String getGerente() {
        return gerente;
    }
}
