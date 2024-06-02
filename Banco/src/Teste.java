public class Teste {

	public static void main(String[] args) {
		Cliente Alan = new Cliente();
		Alan.setNome("Alan");
		
		Conta cc = new ContaCorrente(Alan);
		Conta poupanca = new ContaPoupanca(Alan);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirInfosComuns();
		poupanca.imprimirInfosComuns();
	}

}

