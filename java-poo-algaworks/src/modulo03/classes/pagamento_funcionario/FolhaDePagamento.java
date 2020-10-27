package modulo03.classes.pagamento_funcionario;

public class FolhaDePagamento {
	
	public double calcularSalario(int horasNormais, int horasExtra, double valorHoraNormal, double valorHoraExtra) {
		
		double valorHorasNormais = horasNormais * valorHoraNormal;
		double valorHorasExtra = horasExtra * valorHoraExtra;
		
		return valorHorasNormais + valorHorasExtra;
	}

}
