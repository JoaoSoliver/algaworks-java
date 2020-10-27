package modulo03.test.clinica_nutricao;

import modulo03.classes.clinica_nutricao.IMC;
import modulo03.classes.clinica_nutricao.Paciente;

public class PrincipalClinica {

	public static void main(String[] args) {
		
		Paciente paciente1 = new Paciente();
		paciente1.peso = 112.5;
		paciente1.altura = 1.77;
		
//		double imcCalculado = paciente1.calcularIndeceMassaCorporal();
//		
//		System.out.println(imcCalculado);
		
		IMC imc = paciente1.calcularIndiceMassaCorporal();
		
		System.out.println(paciente1);

	}

}
