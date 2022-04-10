//O laboratório fabricante de álcool em gel precisa saber se o produto está atingindo a 
//concentração ideal para desinfecção, que é de 70%. Para a ajudar o laboratório, 
//crie um programa onde será preenchida a capacidade da garrafa em mililitros, 
//e o resultado serão os volumes de álcool e de gel que precisam ser misturados
//para preenchimento do vasilhame.
package br.com.residencia;

import java.util.Scanner;

public class Lista03TreinarJava04 {

	public static void main(String[] args) {
		
				Scanner leia = new Scanner(System.in);
				
				System.out.println("\t===ALCOOL 70%===\n");
				
				double alcool = 0.7, gel = 0.3, garrafa, totalAlcool, totalGel;
				
				System.out.println("Digite a quantidade mililitros: ");
				garrafa = leia.nextInt();
				leia.close();
				
				totalAlcool = garrafa * alcool;
				totalGel = garrafa * gel;
				
				System.out.println("Total de álcool será: " + totalAlcool);
				System.out.println("Total de gel será: " + totalGel);
				
	}

}
