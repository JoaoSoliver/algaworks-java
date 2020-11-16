package modulo06.datas.devmedia;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Utils {
	
	public int calculaIdade(java.util.Date dataNascimento) {
		
		Calendar dataAniversario = new GregorianCalendar();
		dataAniversario.setTime(dataNascimento);
		
		Calendar hoje = Calendar.getInstance();
		
		int idade = hoje.get(Calendar.YEAR) - dataAniversario.get(Calendar.YEAR);
		
		dataAniversario.add(Calendar.YEAR, idade);
		
		if(hoje.before(dataAniversario)) {
			idade--;
		}
		
		return idade;
	}
	
	public int calculaIdade(String dataDeNascimento, String pattern) {
		
		DateFormat sdf = new SimpleDateFormat(pattern);
		Date dataNascimentoInput = null;
		
		try {
			dataNascimentoInput = sdf.parse(dataDeNascimento);
		} catch (ParseException e) {
			System.out.println("[ " + dataDeNascimento + " ]" + " - Data inválida");
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
