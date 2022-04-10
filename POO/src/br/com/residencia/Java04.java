//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
package br.com.residencia;

import java.util.Scanner;

public class Java04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um número inteiro: ");
		numero = leia.nextInt();
		leia.close();
		if(numero % 2 == 0) { // numero par
			System.out.println("Número par");
		}else {
			System.out.println("Número Ímpar");
		}

	}

}
