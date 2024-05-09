
public class Main {
	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		cc.depositar(1000);
		cp.depositar(400);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		
		cp.imprimirExtrato();
		
		cc.transferir(500, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}
}