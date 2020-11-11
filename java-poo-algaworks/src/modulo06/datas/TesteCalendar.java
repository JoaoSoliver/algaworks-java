package modulo06.datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TesteCalendar {

	public static void main(String[] args) {

		Date dataHoje = new Date();
		
		Calendar dataAnterior = Calendar.getInstance();
		
		Calendar c = new GregorianCalendar();

		c.set(Calendar.DAY_OF_MONTH, 15);
		c.set(Calendar.MONTH, 3);
		c.set(Calendar.YEAR, 1800);
		c.set(Calendar.HOUR_OF_DAY, 9);
		c.set(Calendar.MINUTE, 15);

//		System.out.println("Data de hoje " + dataHoje);

		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm");

//		System.out.println("Data de hoje (formatada) " + formatador.format(dataHoje));

		System.out.println("Data inserida " + formatador.format(c.getTime()));

		c.add(Calendar.DAY_OF_MONTH, 5); // o método add é como se estivessemos passando a folinha.

		System.out.println("5 dias depois " + formatador.format(c.getTime()));
		
		c.roll(Calendar.DAY_OF_MONTH, -20); // nesse método a alteração ocorre somente no campo que está sendo acessado.
		
		System.out.println("Voltando 20 dias " + formatador.format(c.getTime()));
		
		System.out.println("Hoje " + dataAnterior.ERA);
		
		

	}

}
