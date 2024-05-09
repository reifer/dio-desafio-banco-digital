
public class ContaConjunta extends Conta{

	@Override
	public void imprimirExtrato() {
		System.out.println(" === Extrato da Conta Conjunta ===");
		super.imprimirInfoComuns();
	}
}
