package modulo03.passeiocomanimal.test;

import modulo03.passeiocomanimal.classes.Cachorro;
import modulo03.passeiocomanimal.classes.Caminhada;
import modulo03.passeiocomanimal.classes.Pessoa;

public class PasseioComAnimal {

	public static void main(String[] args) {
		
//		Cachorro cachorro1 = new Cachorro("Dayo", "Chiuaua");
		Pessoa pessoa1 = new Pessoa("Yusuke Huramesh",new Cachorro("Bubaa", "Vira-Lata") );
		Caminhada caminhada1 = new Caminhada();
		caminhada1.caminhar(pessoa1);				

	}

}
