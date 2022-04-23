package br.com.curso.aula12;

public class Canguru extends Mamifero{

	///METODOS
	public void usarBolsa() {
		System.out.println("Usando Bolsa");
	}

	@Override
	public void locomover() {
		System.out.println("Saltando");
		
	}	

	@Override
	public void emitirSom() {
		System.out.println("Som Canguru");
	}

	//TO STRING
	@Override
	public String toString() {
		return "Canguru [Cor do Pelo: " + getCorPelo() + ", Peso: " + getPeso() + ", Idade: " + getIdade()
				+ ", Membros: " + getMembros() + "]";
	}
	
	
	
	
}
