package br.com.residencia;

import java.util.Scanner;

public class Execicios01E02 {

	public static void main(String[] args) {

		// EXEMPLO 001
		/*
		 * System.out.println("HELLO WORLD!"); System.out.println("\tHELLO AGAIN!");
		 * System.out.println("\nHELLO AGAIN AGAIN!");
		 * System.out.println("\\HELLO AGAIN AGAIN AGAIN!");
		 * System.out.println("\'HELLO AGAIN AGAIN AGAIN AGAIN!");
		 * System.out.println("\"HELLO\" AGAIN AGAIN AGAIN AGAIN AGAIN!");
		 */

		/*
		 * String nome, sobrenome; Scanner leia = new Scanner(System.in);
		 * 
		 * System.out.println("Digite seu nome: "); nome = leia.next();
		 * System.out.println("Escreva seu sobrenome: "); sobrenome = leia.next(); for
		 * (int i = 0; i <= 20; i++) { System.out.println(); };
		 * System.out.println("Meu nome �: " + nome + " " + sobrenome);
		 * 
		 * leia.close();
		 */

		// EXEMPLO 002

		int numero1, numero2;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um n�mero: ");
		numero1 = leia.nextInt();
		System.out.println("Digite outro n�mero: ");
		numero2 = leia.nextInt();

		int soma = numero1 + numero2;
		int multiplicacao = numero1 * numero2;
		int subtracao = numero1 - numero2;
		System.out.println("Soma = " + soma);
		System.out.println("Multiplica��o = " + multiplicacao);
		System.out.println("Subtra��o = " + subtracao);
		if (numero2 > 0) {
			 int divisao = numero1 / numero2;
			 System.out.println("Divis�o = " + divisao);		
		} else {
			System.out.println("N�o � poss�vel divis�o por 0 ");
		}
		
		
		leia.close();

	}

}
