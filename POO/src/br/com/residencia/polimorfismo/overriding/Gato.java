package br.com.residencia.polimorfismo.overriding;

//Gato herda de Animal
public class Gato extends Animal {

	@Override
	public void andar() {
		System.out.println("Gato andando");
	}
	@Override
	public void pular() {

		System.out.println("Gato pulando");
	}
	
	public void miar() {

		System.out.println("Gato miando");
	}
}
