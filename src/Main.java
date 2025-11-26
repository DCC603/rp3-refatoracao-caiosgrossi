public class Main {


    public static void main(String[] args) {

        Cliente cliente = Cliente.criarClienteComConta("João", "111.111.111-11", "31 1111-1111", 222222, 111, "Gil");
        Conta minhaConta = new Conta(cliente, 0.00);

        minhaConta.depositar(450);
        minhaConta.sacar(50);
        minhaConta.sacar(50);
        minhaConta.sacar(50);

        System.out.println(minhaConta);
    }
}
