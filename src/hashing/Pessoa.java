package hashing;


public class Pessoa {
	private String nome;
	private String cpf;
	private int idade;	
	
	public Pessoa(String cpf, String nome, int idade) {
		this.cpf = cpf;
		this.nome = nome;		
		this.idade = idade;
	}
	
	
	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}
		
}
