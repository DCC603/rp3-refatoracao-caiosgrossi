public abstract class Operacao {

    protected double valor;

    public Operacao(double valor) {
        this.valor = valor;
    }

    // Refatoração: Replace Conditional with Polymorphism (Subclasses Deposito/Saque)
    public abstract String getTipo();

    public String toString() {
        return this.getTipo() + ":\t" + this.valor;
    }
}
