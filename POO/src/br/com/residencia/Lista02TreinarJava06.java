//O sistema “Mais que mil” irá apresentar o resultado da soma dos
//4 primeiros múltiplos de 4 acima de mil, 
//subtraindo dos 4 primeiros números primos a partir de um.
package br.com.residencia;

public class Lista02TreinarJava06 {

	public static void main(String[] args) {

		int multiplo1 = 1004, multiplo2 = 1008, multiplo3 = 1008, multiplo4 = 1012;
		int primo1 = 2, primo2 = 3, primo3 = 5, primo4 = 7;
		int soma;

		System.out.println("\t===MAIS QUE MIL===\n");
		System.out.println("Os 4 primeiros múltiplos de 4 acima de mil são: 1004, 1008, 1012, 1016 \\n");
		System.out.println("Os 4 primeiros números primos a partir de 1 são: 2, 3, 5, 7 \n");
		soma = (multiplo1 + multiplo2 + multiplo3 + multiplo4) - (primo1 + primo2 + primo3 + primo4);
		
		System.out.println("O resultado da soma dos 4 primeiros múltiplos de 4 acima de mil, \n"
				+ "subtraido dos 4 primeiros números primos: " + soma);

	}

}
