package br.com.curso.aula03;

public class VideoGame03 {

	public String modelo;
	public String cor;
	private boolean ligado;
	
	
	public void status() {
		System.out.println("Ps: " + this.modelo + "\n" + "Cor: " + this.cor + "\n" + "Está ligado? " + this.ligado);
	}
	
	public void jogar() {
		if(this.ligado) {
			System.out.println("BORA JOGAR!!!");
		}else {
			System.out.println("GAME OVER...");
		}
	}
	
	public void ligar() {
		this.ligado = true;
	}
	
	public void desligar() {
		this.ligado = false;
	}
	
}
