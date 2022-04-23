package br.com.curso.aula12;

public class Reptil extends Animal {

	//ATRIBUTOS
	private String corEscama;

	//GETTERS AND SETTERS
	
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	//METODOS

	@Override
	public void locomover() {
		System.out.println("Rastejando!!!");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo Vegetais!!!");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som do Réptil!!!");
	}
	
	//TO STRING

	@Override
	public String toString() {
		return "Reptil [Cor da Escama: =" + getCorEscama() + ", Peso: " + getPeso()
				+ ", Idade: " + getIdade() + ", Membros: " + getMembros() + "]";
	}
	
	
	
	
}
