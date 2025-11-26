public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    // Refatoração: Extract Class (Classe DadosConta) & Move Field (Associação DadosConta movida para Cliente)
    private DadosConta dadosConta;

    private Cliente(String nome, String cpf, String telefone, DadosConta dadosConta) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dadosConta = dadosConta;
    }

    // Refatoração: Replace Constructor with Factory Method
    public static Cliente criarClienteComConta(String nome, String cpf, String telefone, int numConta, int numAgencia, String gerente) {
        DadosConta dadosConta = new DadosConta(numConta, numAgencia, gerente);
        return new Cliente(nome, cpf, telefone, dadosConta);
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public DadosConta getDadosConta() {
        return dadosConta;
    }

    @Override
    public String toString() {
        return String.format("CPF: %s\nNome: %s\nTelefone: %s",
                this.cpf, this.nome, this.telefone);
    }
}
