package entidade;

public class Pessoa {

	private String nome;
	private int idade;
	private double salario;
	
	
	
	public Pessoa(String nome, int idade, double salario)
	
	
	{
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}



	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", salario=" + salario + "]";
	}
	
	
	
}
