package modulo06.datas;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteCalculoData {

	public static void main(String[] args) {
		
		Calendar dataAnterior = Calendar.getInstance();
		dataAnterior.set(Calendar.DAY_OF_MONTH, 1);
		dataAnterior.set(Calendar.MONTH, 0);
		dataAnterior.set(Calendar.YEAR, 1900);
		dataAnterior.set(Calendar.HOUR_OF_DAY, 0);
		dataAnterior.set(Calendar.MINUTE, 0);
		dataAnterior.set(Calendar.SECOND, 0);
		dataAnterior.set(Calendar.MILLISECOND, 0);
		
		Calendar dataPosterior = Calendar.getInstance();
		dataPosterior.set(Calendar.MILLISECOND, 0);
		
		System.out.println(dataAnterior.getTime());
		System.out.println(dataPosterior.getTime());
		
		long diferenca = dataPosterior.getTimeInMillis() - dataAnterior.getTimeInMillis();		
		
		Calendar calendarDaDiferenca = Calendar.getInstance();
		calendarDaDiferenca.setTimeInMillis(diferenca);
		
		System.out.println(calendarDaDiferenca.get(Calendar.YEAR) );
		
		

	}

}
