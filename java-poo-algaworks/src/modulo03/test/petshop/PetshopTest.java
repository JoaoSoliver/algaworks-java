package modulo03.test.petshop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import modulo03.classes.petshop.Cachorro;
import modulo03.classes.petshop.Sexo;

public class PetshopTest {

	public static void main(String[] args) throws ParseException {
		
		Cachorro cao1 = new Cachorro("Bidu", "Pastor Alemão",Sexo.MACHO , 12);
		
//		String dataNascimentoAnimal = "12/10/2015";
		
		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataInformada = formatoData.parse("12/10/2015");
		
		cao1.setIdadeAnimal(dataInformada);
		
		
		System.out.println(cao1);

	}

}
