package br.com.curso.aula12;

//POLIMORFISMO
public class Aula12 {

	public static void main(String[] args) {

		System.out.println("\t\t\t----ANIMAIS----\n");

		Mamifero m01 = new Mamifero();
		m01.setCorPelo(null);
		m01.setPeso(0);
		m01.setIdade(null);
		m01.setMembros(null);

		System.out.println(m01.toString());

		m01.locomover();
		m01.alimentar();
		m01.emitirSom();

		System.out.println();

		Cachorro cachorro01 = new Cachorro();
		cachorro01.setCorPelo("Marrom");
		cachorro01.setPeso(8);
		cachorro01.setIdade(2);
		cachorro01.setMembros(4);

		System.out.println(cachorro01.toString());

		cachorro01.locomover();
		cachorro01.alimentar();
		cachorro01.emitirSom();

		System.out.println();

		Canguru canguru01 = new Canguru();
		canguru01.setCorPelo("Beje");
		canguru01.setPeso(70);
		canguru01.setIdade(8);
		canguru01.setMembros(4);

		System.out.println(canguru01.toString());

		canguru01.locomover();
		canguru01.alimentar();
		canguru01.emitirSom();
		canguru01.usarBolsa();

		System.out.println();

		Reptil r01 = new Reptil();
		r01.setCorEscama(null);
		r01.setPeso(0);
		r01.setIdade(null);
		r01.setMembros(null);

		System.out.println(r01.toString());

		r01.locomover();
		r01.alimentar();
		r01.emitirSom();

		System.out.println();

		Cobra cobra01 = new Cobra();
		cobra01.setCorEscama("Vermelha");
		cobra01.setPeso(25);
		cobra01.setIdade(36);
		cobra01.setMembros(0);

		System.out.println(cobra01.toString());

		cobra01.locomover();
		cobra01.alimentar();
		cobra01.emitirSom();

		System.out.println();

		Tartaruga tartaruga01 = new Tartaruga();
		tartaruga01.setCorEscama("Verde");
		tartaruga01.setPeso(15);
		tartaruga01.setIdade(103);
		tartaruga01.setMembros(4);

		System.out.println(tartaruga01.toString());

		tartaruga01.locomover();
		tartaruga01.alimentar();
		tartaruga01.emitirSom();

		System.out.println();

		Peixe p01 = new Peixe();
		p01.setCorEscama(null);
		p01.setIdade(null);
		p01.setMembros(null);

		System.out.println(p01.toString());

		p01.locomover();
		p01.alimentar();
		p01.emitirSom();
		p01.soltarBolha();
		
		System.out.println();

		Goldfish goldfish01 = new Goldfish();
		goldfish01.setCorEscama("Golden");
		goldfish01.setIdade(2);
		goldfish01.setMembros(0);

		System.out.println(goldfish01.toString());

		goldfish01.locomover();
		goldfish01.alimentar();
		goldfish01.emitirSom();
		goldfish01.soltarBolha();

		System.out.println();

		Ave a01 = new Ave();
		a01.setCorPena(null);
		a01.setPeso(0);
		a01.setIdade(null);
		a01.setMembros(null);

		System.out.println(a01.toString());

		a01.locomover();
		a01.alimentar();
		a01.emitirSom();
		a01.fazerNinho();
		
		System.out.println();

		Arara arara01 = new Arara();
		arara01.setCorPena("Verde e Azul");
		arara01.setPeso(7.2);
		arara01.setIdade(3);
		arara01.setMembros(2);

		System.out.println(arara01.toString());

		arara01.locomover();
		arara01.alimentar();
		arara01.emitirSom();
		arara01.fazerNinho();


	}

}
