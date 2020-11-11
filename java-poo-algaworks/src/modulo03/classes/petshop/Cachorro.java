package modulo03.classes.petshop;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Um pet shop te chamou para ajudar no controle dos animais que eles cuidam. 
 * Eles irï¿½o precisar de muitos serviï¿½os, o primeiro ï¿½ mapear qual o nome, raï¿½a, sexo (macho ou fï¿½mea) e idade.
 */

public class Cachorro {
	
	private String nome;
	private String raca; 
	private Sexo sexo; 
	private int idade;
	private Date idadeAnimal;
	

	public Cachorro() {
		// TODO Auto-generated constructor stub
	}

	public Cachorro(String nome, String raca, Sexo sexo, int idade) {
		this.nome = nome;
		this.raca = raca;
		this.sexo = sexo;
		this.idade = idade;
	}
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	@Override
	public String toString() {
		return "Cachorro [nome=" + nome + ", raça=" + raca + ", sexo=" + sexo.getSexo() + ", idade=" + idade + ", idadeAnimal="
				+ sdf.format(idadeAnimal) + "]";
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Date getIdadeAnimal() {
		return idadeAnimal;
	}

	public void setIdadeAnimal(Date idadeAnimal) {
		this.idadeAnimal = idadeAnimal;
	}
	
	

}
