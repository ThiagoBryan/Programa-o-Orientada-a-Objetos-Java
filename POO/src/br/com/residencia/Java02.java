//Faça um programa para ler o valor do raio de um círculo, 
//e depois mostrar o valor da área deste círculo com quatro casas decimais. 
//Fórmula da área: area = pi . raio². Considere o valor de pi = 3.14159.
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
		
		System.out.printf("A área é = %.4f", area);
		
		

	}

}
