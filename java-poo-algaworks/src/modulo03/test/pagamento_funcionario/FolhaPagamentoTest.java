package modulo03.test.pagamento_funcionario;

import modulo03.classes.pagamento_funcionario.FolhaDePagamento;

public class FolhaPagamentoTest {

	public static void main(String[] args) {
		 
		FolhaDePagamento fdp = new FolhaDePagamento();
		System.out.println (fdp.calcularSalario(220, 0, 8.5, 9.7));
		

	}

}
