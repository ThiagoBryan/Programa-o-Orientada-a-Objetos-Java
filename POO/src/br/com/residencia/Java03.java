// 03- Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
package br.com.residencia;

import java.util.Scanner;

public class Java03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int numero;

		System.out.println("Escreva um número: ");
		numero = leia.nextInt();

		if (numero < 0) {
			System.out.println("Número Negativo");
		}
		else if (numero > 0) {
			System.out.println("Número Positivo");
		}
		else {
			System.out.println("Número Neutro ");
		}

		leia.close();

	}

}
