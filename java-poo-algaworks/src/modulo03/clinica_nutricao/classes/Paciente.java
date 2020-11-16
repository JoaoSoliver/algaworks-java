package modulo03.clinica_nutricao.classes;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Paciente {
	
	public double peso;
	public double altura;
	public String dataNascimento;
	private int idade;
	
//	public double calcularIndeceMassaCorporal() {
//		double imc = peso / (altura * altura);		
//		return imc;
//	}
	
	public IMC calcularIndiceMassaCorporal() {

		IMC imc = new IMC();

		double indice = peso / (altura * altura);
		imc.indice = indice;

		if(indice < 18.5) {
			imc.abaixoDoPesoIdeal = true;
		} else if(indice < 25 ) {
			imc.pesoIdeal = true;			
		} else {
			imc.obeso = true;

			if(indice < 30) {
				imc.grauObesidade = "ACIMA DO PESO";
			} else if (indice < 35) {
				imc.grauObesidade = "GRAU I";
			} else if (indice < 40){
				imc.grauObesidade = "GRAU II";
			} else {
				imc.grauObesidade = "GRAU III";
			}
		}

		return imc;
	}
	
	public int calcularIdade() {
		
		DateFormat formatoData =  new SimpleDateFormat("dd/MM/yyyy");
		Date dataNascimentoEntrada = null;
		
		try {
			dataNascimentoEntrada = formatoData.parse(dataNascimento);
		} catch (ParseException e) {
			System.out.println("[ " + dataNascimento + " ]" + " - Data inválida");
		}
		
		Calendar dataAniversario = new GregorianCalendar();
		dataAniversario.setTime(dataNascimentoEntrada);
		
		Calendar hoje = Calendar.getInstance();
		
		idade = hoje.get(Calendar.YEAR) - dataAniversario.get(Calendar.YEAR);
		
		dataAniversario.add(Calendar.YEAR, idade);
		
		if(hoje.before(dataAniversario)) {
			idade--;
		}
		return idade;
	}

	@Override
	public String toString() {
		return "Paciente [peso=" + peso + ", altura=" + altura + " idade= " + idade + " anos"  + ",\ncalcularIndiceMassaCorporal()="
				+ calcularIndiceMassaCorporal() + "]";
	}
	
	

}
