
		// 1. O programa �bem-vindo� pergunta seu nome e sobrenome, e depois gentilmente
		// te cumprimenta.
package br.com.residencia;

import java.util.Scanner;

public class Lista01treinarjava01 {

	public static void main(String[] args) {

		String nome, sobrenome;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		nome = leia.next();
		System.out.println("Digite seu sobrenome: ");
		sobrenome = leia.next();
		System.out.println("Ol� " + nome + " " + sobrenome + " bem-vindo(a) ao universo da programa��o.");

		leia.close();
	}

}
