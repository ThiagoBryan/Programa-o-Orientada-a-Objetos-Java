//USANDO SET E GET
package br.com.curso.aula04;

public class Caneta04 {

	private String modelo;
	private double ponta;
	private boolean tampada;
	private String cor;

	
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
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
	// Nao usou status(), esta na main;
//	public void status() {
//		System.out.println("Sobre a Caneta:");
//		System.out.println("Modelo: " + this.getModelo());
//		System.out.println("Ponta: " + this.getPonta());
//	}
	
}

