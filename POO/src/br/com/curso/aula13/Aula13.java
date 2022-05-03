package br.com.curso.aula13;

public class Aula13 {
	// POLIMORFISMO SOBRECARGA
	public static void main(String[] args) {
		
		
		Cachorro cachorro01 = new Cachorro();
		
		cachorro01.emitirSom();
		cachorro01.reagir("Olá!");
		cachorro01.reagir(false);
		cachorro01.reagir(true);
		cachorro01.reagir(11, 45);
		cachorro01.reagir(19, 00);
		
	}

}
