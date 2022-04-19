//Quando declaramos estes dois métodos, estamos fazendo umas sobrecarga de métodos,
//ou method overloading em Java.
//Quando invocamos o método com um inteiro como um argumento, o Java é inteligente o suficiente para invocar corretamente o método que foi declarado com inteiro como parâmetro.
//Caso invoquemos o método usando um double como um argumento, 
//o method a ser executado será aquele que foi declarado com o tipo double em seu parâmetro.
package br.com.residencia.polimorfismo.overload;

public class Main {

	public static void main(String[] args) {
		System.out.println("Inteiro 2 ao quadrado: " + Quadrado.quadrado(2));
        System.out.printf("Double PI ao quadrado: %.2f ", Quadrado.quadrado(3.14));

	}

}
