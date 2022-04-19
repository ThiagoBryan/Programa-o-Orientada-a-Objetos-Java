//USANDO METODO CONTRUTOR
package br.com.curso.aula04;

public class Caneta004 {
	private String modelo;
	private double ponta;
	private boolean tampada;
	private String cor;

	// Metodo Construtor
	public Caneta004(String m, String c, double p) {
		this.modelo = m;
		this.cor = "Azul";
		this.ponta = p;  
		this.tampar();
	}
	
	

	public void status() {
		System.out.println("Sobre a Caneta:");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta: " + this.getPonta());
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String m) {
		this.modelo = m;
	}
	
	public double getPonta() {
		return this.ponta;
	}
	
	public void setPonta(double p) {
		this.ponta = p;
	}
	public void tampar() {
		tampada = true;
	}

	public void destampar() {
		tampada = false;
	}
}
