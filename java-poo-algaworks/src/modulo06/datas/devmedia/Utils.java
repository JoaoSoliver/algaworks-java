package modulo06.datas.devmedia;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Utils {
	
	public static int calculaIdade(String dataDeNascimento, String pattern) {
		
		DateFormat sdf = new SimpleDateFormat(pattern);
		Date dataNascimentoInput = null;
		
		try {
			dataNascimentoInput = sdf.parse(dataDeNascimento);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("[ " + dataDeNascimento + " ]" + " - Data inválida");;
		}
		
		Calendar dateOfBirth = new GregorianCalendar();
		dateOfBirth.setTime(dataNascimentoInput);
		
		Calendar today = Calendar.getInstance();
		
		int age = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);
		
		dateOfBirth.add(Calendar.YEAR, age);
		
		if(today.before(dateOfBirth)) {
			age--;
		}
		
		return age;
	}

}
