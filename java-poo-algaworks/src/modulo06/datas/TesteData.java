package modulo06.datas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/*
 * A Classe Date já busca no sistema a data/hora atuais.
 */

import java.util.Date;

public class TesteData {

	public static void main(String[] args) {
		
		Date dataHoje = new Date();
		
		System.out.print("Data e hora de hoje, do sistema: ");
		System.out.println(dataHoje);
		
		System.out.println("Hoje com formatação ");
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy | HH:mm");
		System.out.println(formatador.format(dataHoje));
		
		String dataAniversario = "09/09/1985";
		DateFormat formatador2 = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			Date aniversario = formatador2.parse(dataAniversario);
			System.out.println(formatador.format(aniversario));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("Formato de data inválido");;
		}
	}

}
