//2.	O “Programa de fidelidade” aumentou o sistema, criando o botão “Multiplique seus pontos”. 
//O cliente irá digitar quantos cupons tem, e o sistema irá triplicar o valor.
package br.com.residencia;

import java.util.Scanner;

public class Lista03TreinarJava02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);	
		int pontos, cupons;
			
			System.out.println("\t===Programa de fidelidade 2.0===\n");
			
			System.out.println("Veja seus pontos!\n");
			System.out.println("Digite seus pontos: ");
			cupons = leia.nextInt();
			leia.close();
			
			pontos = cupons * 3;
			
			System.out.println("Agora cada cupon vale 3 pontos!!");
			System.out.println("Seu total de pontos: " + pontos);

	}

}
