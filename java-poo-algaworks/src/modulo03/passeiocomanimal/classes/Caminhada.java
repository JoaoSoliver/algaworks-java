package modulo03.passeiocomanimal.classes;

public class Caminhada {
	
	public void caminhar(Pessoa pessoa) {
		System.out.println(pessoa.nome + " est� passeando com um c�o da ra�a " + pessoa.cachorro.raca 
				+ " que se chama " + pessoa.cachorro.nome);
	}

}
