
public class Main {

	public static void main(String[] args) {
		Cliente jorge = new Cliente();
		jorge.setNome("Jorge");
		
		
		Conta cc = new ContaCorrente(jorge);
		Conta poupanca = new ContaPoupanca(jorge);
		
		cc.depositar(100);
		cc.transferir(50, poupanca);
		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	
	}

}
