//Fa�a um programa para ler o valor do raio de um c�rculo, 
//e depois mostrar o valor da �rea deste c�rculo com quatro casas decimais. 
//F�rmula da �rea: area = pi . raio�. Considere o valor de pi = 3.14159.
package br.com.residencia;

import java.util.Scanner;

public class Java02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double raio;
		double pi = 3.14159;
		
		System.out.println("Digite um raio: ");
		raio = leia.nextDouble();
		leia.close();
		
		double area = pi * (raio*raio);
		
		System.out.printf("A �rea � = %.4f", area);
		
		

	}

}
