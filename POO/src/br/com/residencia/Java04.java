//Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.
package br.com.residencia;

import java.util.Scanner;

public class Java04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um n�mero inteiro: ");
		numero = leia.nextInt();
		leia.close();
		if(numero % 2 == 0) { // numero par
			System.out.println("N�mero par");
		}else {
			System.out.println("N�mero �mpar");
		}

	}

}
