package modulo03.clinica_nutricao.classes;

public class IMC {
	
	 public double indice;
	 public boolean abaixoDoPesoIdeal;
	 public boolean pesoIdeal;
	 public boolean obeso;
	 public String grauObesidade;
	 
	@Override
	public String toString() {
		return "IMC [indice=" + indice + ", abaixoDoPesoIdeal=" + abaixoDoPesoIdeal + ", pesoIdeal=" + pesoIdeal
				+ ", obeso=" + obeso + ", grauObesidade=" + grauObesidade + "]";
	}
	 
	 
	
}
