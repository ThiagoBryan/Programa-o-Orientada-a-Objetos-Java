// 03- Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.
package br.com.residencia;

import java.util.Scanner;

public class Java03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int numero;

		System.out.println("Escreva um n�mero: ");
		numero = leia.nextInt();

		if (numero < 0) {
			System.out.println("N�mero Negativo");
		}
		else if (numero > 0) {
			System.out.println("N�mero Positivo");
		}
		else {
			System.out.println("N�mero Neutro ");
		}

		leia.close();

	}

}
