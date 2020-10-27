package modulo03.precos_vendinha.test;

import modulo03.precos_vendinha.classes.Preco;
import modulo03.precos_vendinha.classes.Produto;

public class ProdutoTest {

	public static void main(String[] args) {
		
		Preco preco = new Preco();
		preco.valorCustos = 140;
		
//		O trecho de c�digo abaixo seria para realizar uma opera��o que alteraria o valor da vari�vel "preco".
//		Mas como se trata de uma vari�vel de tipo primitivo isso se torna invi�vel da forma como est� sendo feito.
//		Pois na chamada do m�todo definirPreco uma c�pia do valor que est� na vari�vel � passado para ele.
//		E o m�todo realiza a opera��o nessa c�pia n�o alterando a vari�vel que est� nessa classe.
//		Para que isso funcione corretamente, temos algumas alternativas, ou declaramos um m�todo com retorno ou ent�o passamos uma vari�vel de
//		refer�ncia como est� sendo feito no c�digo que n�o est� comentado.
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
