//O �Programa de fidelidade� solicitou a cria��o do sistema �Ver os seus pontos�,
//onde o cliente poder� consultar seu saldo de pontos. O cliente ir� digitar um n�mero
//inteiro correspondente aos seus cupons. 
//Cada cupom corresponde a 1 ponto.
package br.com.residencia;

import java.util.Scanner;

public class Lista03TreinarJava01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);	
		int pontos, cupons;
			
			System.out.println("\t===Programa de fidelidade===\n");
			
			System.out.println("Veja seus pontos!\n");
			System.out.println("Digite seus pontos: ");
			cupons = leia.nextInt();
			leia.close();
			
			pontos = cupons * 1;
			
			System.out.println("Seu total de pontos: " + pontos);
			
			
	}		

}
