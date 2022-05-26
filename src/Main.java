
public class Main {

	public static void main(String[] args) {
		Cliente carlos = new Cliente();
		carlos.setNome("Carlos");

		Conta cc = new ContaCorrente(carlos);
		Conta poupanca = new ContaPoupanca(carlos);

		cc.depositar(1000);
		cc.transferir(1000, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}