package br.com.curso.aula04;

public class Aula004 {

	public static void main(String[] args) {
		
		Caneta004 c1 = new Caneta004("NIC", "Amarela", 0.4);
		c1.status();
		
		System.out.println();
		
		Caneta004 c2 = new Caneta004("XXX", "Preta", 1.0);
		c2.status();
	}

}
