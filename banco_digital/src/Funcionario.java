import lombok.Getter;

@Getter
public abstract class Funcionario {
	
	private String nome;
    private String cargo;
    private double salario;

}

class Gerente extends Funcionario {
	
}

class Analista extends Funcionario {
	
}

class Diretor extends Funcionario {
	
}

class Administrativo extends Funcionario {
	
}