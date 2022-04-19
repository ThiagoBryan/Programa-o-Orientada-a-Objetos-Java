//Leia um valor inteiro X (1 <= X <= 1000).
//Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.
package br.com.residencia;

import java.util.Scanner;

//import java.util.Scanner;

public class Java06 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int numero;

		System.out.print("Escreva um numero entre 1 e 1000: ");
		numero = leia.nextInt();
		leia.close();
		System.out.println("");

		if (numero < 1 || numero >= 1000) {
			System.out.println("Erro!! Escreva um numero entre 1 e 1000");
		} else {
			for (int i = 1; i <= numero ; i++) {
				if (i % 2 != 0) {
					System.out.println(i);
				

				}
			}
		}
//		   Scanner scanner = new Scanner(System.in);
//
//	        System.out.print("Digite o número 1: ");
//	        int numero1 = Integer.parseInt(scanner.nextLine()); // ao ler do teclado, utilize somente o método nextLine()
//
//	        System.out.print("Digite o número 2: ");
//	        int numero2 = Integer.parseInt(scanner.nextLine()); // ao ler do teclado, utilize somente o método nextLine()
//
//	        System.out.print("Os números ímpares entre " + numero1 + " e " + numero2 + " são:");
//	        for (int numero = numero1; numero <= numero2; numero++) {
//	            if (numero % 2 != 0) {
//	                System.out.print(" " + numero);
//	            }
//	        }
//	        scanner.close();
	}

}
