package modulo03.test.concessionaria;

import modulo03.classes.concessionaria.Carro;
import modulo03.classes.concessionaria.Proprietario;

public class CarroTest {

	public static void main(String[] args) {
		
		
		Carro carro1 = new Carro("GM", "GM_1001", "Dark Blue", "03/05/2000", new Proprietario("João da Silva Sauros", "123.456.789-89", 35));
		Carro carro2 = new Carro("VW", "VW_0202", "Shell Pink", "03/05/2010");
		
		System.out.println(carro1);
		 carro1.ligar();
		System.out.println( "----------------------------------------------------------------------------------");
		System.out.println(carro2);
		carro2.ligar();
		System.out.println( "----------------------------------------------------------------------------------");		

	}

}
