package modulo03.precos_vendinha.test;

import modulo03.precos_vendinha.classes.Preco;
import modulo03.precos_vendinha.classes.Produto;

public class ProdutoTest {

	public static void main(String[] args) {
		
		Preco preco = new Preco();
		preco.valorCustos = 140;
		
//		O trecho de código abaixo seria para realizar uma operação que alteraria o valor da variável "preco".
//		Mas como se trata de uma variável de tipo primitivo isso se torna inviável da forma como está sendo feito.
//		Pois na chamada do método definirPreco uma cópia do valor que está na variável é passado para ele.
//		E o método realiza a operação nessa cópia não alterando a variável que está nessa classe.
//		Para que isso funcione corretamente, temos algumas alternativas, ou declaramos um método com retorno ou então passamos uma variável de
//		referência como está sendo feito no código que não está comentado.
//		double preco = 140;		
//		Produto produto1 = new Produto();
//		produto1.definirPreco(preco);
//		
//		System.out.println(produto1.valorDeVenda);
		
		Produto produto = new Produto();
		produto.definirPreco(preco, 20, 15);
		
		System.out.println("Custo: " + preco.valorCustos);
		System.out.println("Impostos: " + preco.valorImpostos);
		System.out.println("Lucro: " + preco.valorLucro);
		System.out.println("Venda: " + preco.valorVenda);
		

	}

}
