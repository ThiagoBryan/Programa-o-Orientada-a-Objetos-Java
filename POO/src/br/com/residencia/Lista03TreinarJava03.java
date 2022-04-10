//O restaurante "Self-Service" precisa de um programa para imprimir as etiquetas 
//de "comanda" na pesagem dos pratos. O operador da balança irá digitar o preço do quilo 
//e o total em gramas da refeição, considerando que o prato vazio pesa 465 gramas (tara). A etiqueta irá conter o nome do restaurante, 
//o tara do prato, o preço de 100 gramas, o peso consumido e o valor total.
package br.com.residencia;

import java.util.Scanner;

public class Lista03TreinarJava03 {
	public static void main(String[] args) {
	
			Scanner leia = new Scanner(System.in);
		
			// 465 gramas = preço 
		int tara = 465;
		double precoQuilo, gramas, valorTotal, peso, valorConvertidoParaQuilo, preco100Gramas;
		
			System.out.println("Digite o preço do Quilo: ");
			precoQuilo = leia.nextDouble();
			System.out.println("Peso: ");
			gramas = leia.nextDouble();
			leia.close();
			
			peso = gramas + tara;
			
			System.out.println("Peso Total " + peso + "\n");
			
			valorConvertidoParaQuilo = gramas/1000;
			valorTotal = precoQuilo * valorConvertidoParaQuilo;
			preco100Gramas = precoQuilo * 0.1; // ou 100/1000
			
			System.out.println("\t\t===Restaurante Self-Service===\n\n");
			System.out.println("\t===Comanda===\n");
			System.out.println("Tara = " + tara);
			System.out.println("Peso = " + gramas);
			
			System.out.println("Preço de 100 gramas = R$" + preco100Gramas);
			System.out.println("Valor Total: R$ " + valorTotal);
			
			
	}
}
