		// 4.O programa �term�metro� l� uma temperatura em graus celsius, e devolve sua
		// equival�ncia na escala fahrenheit.
		// (Use: F = C * 1, 8 + 32);
package br.com.residencia;

import java.util.Scanner;

public class Lista01treinarjava04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		double temperaturaC;

		System.out.println("\t===T�rmometro===\n");

		System.out.print("Digite uma temperatura em Celsius: ");
		temperaturaC = leia.nextDouble();

		double temperaturaF = temperaturaC * 1.8 + 32;

		System.out.println("A temperatura em F� �: " + temperaturaF);

		leia.close();

	}

}
