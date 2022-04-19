package br.com.curso;

public class VideoGame02 {

	String modelo;
	String cor;
	boolean ligado;

	void status() {
		System.out.println("Ps: " + this.modelo + "\n" + "Cor: " + this.cor + "\n" + "Está ligado? " + this.ligado);
	}

	void jogar() {
		if (this.ligado) {
			System.out.println("BORA JOGAR!!!");
		} else {
			System.out.println("GAME OVER...");
		}
	}

	void ligar() {
		this.ligado = true;
	}

	void desligar() {
		this.ligado = false;
	}

}
