//1 - Faça um programa para ler dois valores inteiros, e depois mostrar no console a soma desses números.
package br.com.residencia;

import java.util.Scanner;

public class Java01 {

	public static void main(String[] args) {
		
		int numero1, numero2;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva dois valores inteiros: ");
		numero1 = leia.nextInt();
		numero2 = leia.nextInt();
		leia.close();
		
		int soma = numero1 + numero2; 
		System.out.println("A soma é: " + soma);

	}

}
