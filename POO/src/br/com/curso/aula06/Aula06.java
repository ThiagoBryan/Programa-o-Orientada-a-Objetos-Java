package br.com.curso.aula06;

public class Aula06  {

	public static void main(String[] args) {
		
		Controle controle01 = new Controle(30,false,false);
	
		
		
		controle01.ligar();
		System.out.println(controle01.toString());
		controle01.setTocando(true);
		System.out.println(controle01.toString());
		controle01.abrirMenu();
		System.out.println(controle01.toString());
		controle01.fecharMenu();
		System.out.println(controle01.toString());
		controle01.maisVolume();
		System.out.println(controle01.toString());
		controle01.menosVolume();
		System.out.println(controle01.toString());
		controle01.play();
		System.out.println(controle01.toString());
		controle01.pause();
		System.out.println(controle01.toString());		
		controle01.desligar();
		System.out.println(controle01.toString());
	}
	
	}


