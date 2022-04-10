//4.	O programa "Educado" irá perguntar seu nome, e também como você gostaria de ser chamado. 
//Depois disso uma saudação para você aparece na tela.
package br.com.residencia;

import java.util.Scanner;

public class Lista02TreinarJava04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); 
		String nome, apelido, resposta;
		
		System.out.println("\t===EDUCADO===\n");
		
		System.out.println("Digite o seu nome? ");
		nome = leia.next(); 
		
		System.out.println("Digite seu apelido: ");
		apelido = leia.next();
		System.out.println("Digite como gostaria de ser chamado: ");
		resposta = leia.next();
		leia.close();
		if(resposta == nome) {
			System.out.println("Seja bem vindo " + nome + ".");
		}else if(resposta == apelido) {
			System.out.println("Seja bem vindo " + apelido + ".");
		}else {
			System.out.println("Seja bem vindo " + resposta + ".");
		}
	}

}
