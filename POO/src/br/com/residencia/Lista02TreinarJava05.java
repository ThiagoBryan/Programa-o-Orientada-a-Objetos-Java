//5.	O sistema “Faço parte” vai te mostrar um histórico da trajetória de nossa cidade. 
//O resultado apresentado na tela será: “Teresópolis tem X anos. Desses, Y foram antes de mim.
//Mas os últimos Z anos contaram comigo!”. Cada letra maiúscula do texto será uma variável, 
//sendo que “x” e “z” são valores fixos, e “y” irá conter uma expressão.
package br.com.residencia;

import java.util.Scanner;

public class Lista02TreinarJava05 {

	public static void main(String[] args) {
	
			int x = 204, z, y;
			Scanner leia = new Scanner(System.in);
			System.out.println("\t====FAÇO PARTE====\n");
			
			System.out.println("Digite sua idade: ");
			z = leia.nextInt();
			leia.close();
			
			y = x - z;
			System.out.println("Nova Firburgo tem " + x + " Desses " + y + " foram antes de mim.\n");
			System.out.println("Mas os últimos " + z + " anos, contaram comigo!");
			
	}

}
