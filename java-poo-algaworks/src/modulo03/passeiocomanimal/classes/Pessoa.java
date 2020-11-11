package modulo03.passeiocomanimal.classes;

public class Pessoa {
	
	String nome;
	Cachorro cachorro;
	
	public Pessoa(){		
	}
	
	public Pessoa(String nome){
		this.nome = nome;
	}
	
	public Pessoa(String nome, Cachorro cachorro) {
		this.nome = nome;
		this.cachorro = cachorro;
	}
	

}
