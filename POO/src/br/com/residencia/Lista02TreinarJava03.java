//3.	Um programa "Total de produtos" irá solicitar que o cliente digite quantos produtos irá comprar. 
//Depois, exibe a mensagem: 
//"Parabéns por comprar x produtos!", substituindo x pela quantidade.
package br.com.residencia;

import java.util.Scanner;

public class Lista02TreinarJava03 {

	public static void main(String[] args) {
		
				Scanner leia = new Scanner(System.in);
				
				System.out.println("\t===Total de Produtos===\n");
				
				int x;
				
				System.out.println("Digite quantos produtos deseja comprar: ");
				x = leia.nextInt();
				leia.close();
				
				System.out.println("Parabéns por comprar " + x + " produtos!");
	}

}
