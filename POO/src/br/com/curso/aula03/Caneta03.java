package br.com.curso.aula03;

//classe
public class Caneta03 {

	public String modelo;
	public String cor;
	private double ponta;
	protected double carga;
	private boolean tampada;
	// Definindo o estado do objeto;
	void status() {
		System.out.println("Uma caneta: " + this.modelo + "\n" + "Cor: " + this.cor + "\n" + "De ponta: " + this.ponta
				+ "\n" + "Com carga: " + this.carga  + " %" + "\n" + "Está tampada? " + this.tampada);
	}

	public void rabiscar() {
		if(this.tampada) {
			System.out.println("Erro, a caneta está tampada");
		}else {
			System.out.println("rabiscando");
		}
	}

	public void tampar() {
		//this= referência ao objeto que esta chamando;
		this.tampada = true;
	}

	public void destampar() {
		this.tampada = false;
	}
}
