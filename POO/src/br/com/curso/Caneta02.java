package br.com.curso;

//classe
public class Caneta02 {

	String modelo;
	String cor;
	double ponta;
	double carga;
	boolean tampada;

	// Definindo o estado do objeto;
	void status() {
		System.out.println("Uma caneta: " + this.modelo + "\n" + "Cor: " + this.cor + "\n" + "De ponta: " + this.ponta
				+ "\n" + "Com carga: " + this.carga + " %" + "\n" + "Est� tampada? " + this.tampada);
	}

	void rabiscar() {
		if (this.tampada) {
			System.out.println("Erro, a caneta est� tampada");
		} else {
			System.out.println("rabiscando");
		}
	}

	void tampar() {
		// this= refer�ncia ao objeto que esta chamando;
		this.tampada = true;
	}

	void destampar() {
		this.tampada = false;
	}
}
