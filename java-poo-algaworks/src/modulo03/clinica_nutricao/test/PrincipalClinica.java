package modulo03.clinica_nutricao.test;

import modulo03.clinica_nutricao.classes.IMC;
import modulo03.clinica_nutricao.classes.Paciente;

public class PrincipalClinica {

	public static void main(String[] args) {
		
		Paciente paciente1 = new Paciente();
		paciente1.peso = 112.5;
		paciente1.altura = 1.77;
		paciente1.dataNascimento = "13/11/1985";
		
		paciente1.calcularIdade();
		
//		double imcCalculado = paciente1.calcularIndeceMassaCorporal();
//		
//		System.out.println(imcCalculado);
		
		IMC imc = paciente1.calcularIndiceMassaCorporal();
		
		System.out.println(paciente1);

	}

}
