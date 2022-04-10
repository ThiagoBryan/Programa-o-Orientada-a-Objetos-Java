package br.com.residencia;

import java.util.Scanner;

public class Lista02TreinarJava01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String respostaCerta = "42";
		String resposta1;
		System.out.println("\t===Qual o siginificado da vida, do universo e tudo mais?===\n");

		
		System.out.println("Você sabe qual é? [s]Sim [n]Não ");
		String resposta = leia.next();
		if (resposta.equalsIgnoreCase("s")) {
			System.out.println("Escreva seu palpite: ");
			resposta1 = leia.next();
			if (resposta1.equalsIgnoreCase(respostaCerta)) {
				System.out.println("Parabéns, a resposta está certa!");
			} else {
				System.out.println("A resposta certa é: 42");
			}
		} else if (resposta.equalsIgnoreCase("n")) {
			System.out.println("A resposta certa é: 42");
		}else {
			System.out.println("Entrada inválida");
		}
		leia.close();
	}
}
