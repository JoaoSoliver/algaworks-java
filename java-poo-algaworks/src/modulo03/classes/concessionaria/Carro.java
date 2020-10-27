package modulo03.classes.concessionaria;

import java.util.Date;

public class Carro {
	
	private String fabricante;
	private String modelo;
	private String cor;
	private String dataFabricacao;	
	private Proprietario proprietario;
	
	public Carro(String fabricante, String modelo, String cor, String dataFabricacao, Proprietario proprietario) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.cor = cor;
		this.dataFabricacao = dataFabricacao;
		this.proprietario = proprietario;
	}
	
	public Carro(String fabricante, String modelo, String cor, String dataFabricacao) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.cor = cor;
		this.dataFabricacao = dataFabricacao;
	}
	public Carro() {
		// TODO Auto-generated constructor stub
	}
	
	public void ligar() {
		System.out.println("Ligando o " + modelo);
	}
	
	@Override
	public String toString() {
		if (proprietario == (null)) {
			return "Carro [fabricante=" + fabricante + ", modelo=" + modelo + ", cor=" + cor + ", dataFabricacao="
					+ dataFabricacao  + "| Disponível para compra]";
		} else {			
			return "Carro [fabricante=" + fabricante + ", modelo=" + modelo + ", cor=" + cor + ", dataFabricacao="
					+ dataFabricacao + "\nProprietario " + proprietario.getNome() + " - " + proprietario.getIdade() + " anos" + " CPF:  " + proprietario.getCpf()  
					+ "]";
		}
	}
	
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAnoFabricacao() {
		return dataFabricacao;
	}
	public void setAnoFabricacao(String anoFabricacao) {
		this.dataFabricacao = anoFabricacao;
	}
	
}
