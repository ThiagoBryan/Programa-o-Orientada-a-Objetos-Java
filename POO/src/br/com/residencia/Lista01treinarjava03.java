		// 3. Crie o programa �mini calculadora�, que ap�s ler dois n�meros inteiros
		// apresenta as opera��es de
		// soma, subtra��o, multiplica��o e divis�o com eles.
		// Obs.: Trate o maior n�mero poss�vel de erros (ex: opera��es com n�meros
		// negativos, divis�o por zero, uso de letras, etc).
package br.com.residencia;

import java.util.Scanner;

public class Lista01treinarjava03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		double numero1, numero2;

		System.out.println("\t===Mini-Calculadora===\n");
		System.out.println("Escreva dois n�mero inteiros: ");
		numero1 = leia.nextDouble();
		numero2 = leia.nextDouble();
		leia.close();

		double soma = numero1 + numero2;
		double subtracao = numero1 - numero2;
		double multiplicacao = numero1 * numero2;

		System.out.println("Soma: " + soma);
		System.out.println("Subtra��o: " + subtracao);
		System.out.println("Multiplica��o: " + multiplicacao);
		if (numero2 == 0) {
			System.out.println("N�o � poss�vel divis�o por 0.");
		} else {
			double divisao = numero1 / numero2;
			System.out.format("Divisao: %.1f", divisao); // para arredondar as casas decimais.
		}

		
	}

}
