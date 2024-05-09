
public class Main {
	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		Conta ccjConta = new ContaConjunta();
		
		cc.depositar(2000);
		cp.depositar(500);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		
		cp.imprimirExtrato();
		
		cc.transferir(700, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}
}