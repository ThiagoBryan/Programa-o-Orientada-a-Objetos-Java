package br.com.residencia.polimorfismo.overriding;

public class Main {

	public static void main(String[] args) {

		Animal a = new Animal();

	
		a.andar();
		a.pular();

		Galinha g = new Galinha();
		g.dormir();
		g.sonhar();
		
		Gato ga = new Gato();
		ga.andar();
		ga.pular();
		ga.miar();
		
		
		
		

	}

}
