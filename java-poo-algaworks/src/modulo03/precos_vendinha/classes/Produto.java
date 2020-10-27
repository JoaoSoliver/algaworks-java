package modulo03.precos_vendinha.classes;

public class Produto {

	public void definirPreco(Preco preco, double percentualImpostos, double margemLucro) {
		
		preco.valorImpostos = preco.valorCustos * (percentualImpostos / 100);
		preco.valorLucro = preco.valorCustos * (margemLucro / 100);
		preco.valorVenda = preco.valorCustos + preco.valorImpostos + preco.valorLucro;
		
	}
	
//	public double valorDeVenda;
//	public void definirPreco(double precoCusto) {
//		valorDeVenda  = precoCusto * 1.2;
//	}
	
	

}
