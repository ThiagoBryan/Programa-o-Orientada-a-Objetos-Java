		// 2.O programa “Tempo de vida” irá imprimir a soma das idades de todos os
		// colegas da sua equipe (6 pessoas).
		// Pergunte a cada um a idade e não esqueça a sua!
		// Depois faça a atribuição direta da expressão em uma variável inteira.

package br.com.residencia;

import java.util.Scanner;

public class Lista01treinarjava02 {

	public static void main(String[] args) {

		int idade1, idade2, idade3, idade4, idade5, idade6;
		Scanner leia = new Scanner(System.in);

		System.out.println("\t====Tempo de Vida====\n");
		System.out.println("Informe as idades de seus amigos!");
		System.out.print("Informe idade 1: ");
		idade1 = leia.nextInt();
		System.out.print("Informe idade 2: ");
		idade2 = leia.nextInt();
		System.out.print("Informe idade 3: ");
		idade3 = leia.nextInt();
		System.out.print("Informe idade 4: ");
		idade4 = leia.nextInt();
		System.out.print("Informe idade 5: ");
		idade5 = leia.nextInt();
		System.out.print("Informe idade 6: ");
		idade6 = leia.nextInt();

		int soma = idade1 + idade2 + idade3 + idade4 + idade5 + idade6;

		System.out.println("O tempo de vida dos meus amigos é: " + soma);

		leia.close();

	}

}
