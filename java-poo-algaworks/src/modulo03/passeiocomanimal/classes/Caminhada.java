package modulo03.passeiocomanimal.classes;

public class Caminhada {
	
	public void caminhar(Pessoa pessoa) {
		System.out.println(pessoa.nome + " está passeando com um cão da raça " + pessoa.cachorro.raca 
				+ " que se chama " + pessoa.cachorro.nome);
	}

}
