package modulo03.classes.concessionaria;

public class Proprietario {
	
	private String nome;
	private String cpf;
	private int idade;
	private Logradouro logradouro;
	
	public Proprietario(String nome, String cpf, int idade, Logradouro logradouro) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.logradouro = logradouro;
	}
	
	public Proprietario(String nome, String cpf, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}
	
	public Proprietario() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		
		return "Proprietario [nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", logradouro=" + logradouro + "]";
	}

	public Logradouro getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(Logradouro logradouro) {
		this.logradouro = logradouro;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

}
