//O laborat�rio fabricante de �lcool em gel precisa saber se o produto est� atingindo a 
//concentra��o ideal para desinfec��o, que � de 70%. Para a ajudar o laborat�rio, 
//crie um programa onde ser� preenchida a capacidade da garrafa em mililitros, 
//e o resultado ser�o os volumes de �lcool e de gel que precisam ser misturados
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
				
				System.out.println("Total de �lcool ser�: " + totalAlcool);
				System.out.println("Total de gel ser�: " + totalGel);
				
	}

}
