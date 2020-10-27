package modulo03.classes.clinica_nutricao;

public class Paciente {
	
	public double peso;
	public double altura;
	
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

	@Override
	public String toString() {
		return "Paciente [peso=" + peso + ", altura=" + altura + ",\ncalcularIndiceMassaCorporal()="
				+ calcularIndiceMassaCorporal() + "]";
	}
	
	

}
