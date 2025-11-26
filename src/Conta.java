import java.util.ArrayList;
import java.util.List;

public class Conta {

    // Refatoração: Extract Class (Classe Cliente)
    private Cliente cliente;

    // Refatoração: Rename Field (valor para saldo)
    private double saldo;

    private List<Operacao> operacoes;

    public Conta(Cliente cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;

        this.operacoes = new ArrayList<>();
    }

    public Conta() {
        this(null, 0);
    }

    // Refatoração: Replace Parameter with Explicit Methods (depositar/sacar)
    public void depositar(double valor) {
        Operacao op = new Deposito(valor);
        this.operacoes.add(op);
        this.saldo += valor;
    }

    public void sacar(double valor) {
        Operacao op = new Saque(valor);
        this.operacoes.add(op);
        this.saldo -= valor;
    }

    // Refatoração: Extract Method (gerarExtrato)
    public String gerarExtrato() {
        StringBuilder sb = new StringBuilder();
        for(Operacao op : this.operacoes) {
            sb.append(op.toString()).append("\n");
        }
        return sb.toString();
    }

    public String toString() {
        return "-----CLIENTE-----\n" +
                // Refatoração: Move Method (Formatação delegada para Cliente)
                this.cliente.toString() +
                "\n\n" +
                "-----CONTA-----\n" +
                String.format("Ag.: %d\nConta: %d\nGerente: %s\nSaldo: %.2f",
                        this.cliente.getDadosConta().getNumAgencia(),
                        this.cliente.getDadosConta().getNumConta(),
                        this.cliente.getDadosConta().getGerente(),
                        this.saldo) +
                "\n\n" +
                "-----EXTRATO-----\n" +
                // Refatoração: Extract Method (gerarExtrato)
                this.gerarExtrato() +
                "\n";
    }
}
