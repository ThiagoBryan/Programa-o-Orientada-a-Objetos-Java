//- Escreva um programa que repita a leitura de uma senha até que ela seja válida. 
//Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida".
//Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. 
//Considere que a senha correta é o valor 2002.
package br.com.residencia;

import java.util.Scanner;

public class Java05 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int senha = 12345;
		System.out.println("Digite a senha correta: ");
		senha = leia.nextInt();
		while (senha != 12345) {
			System.out.println("Senha Inválida");
			System.out.println("Digite a senha correta: ");
			senha = leia.nextInt();
		}
		System.out.println("Senha correta");
		leia.close();

	}
}
