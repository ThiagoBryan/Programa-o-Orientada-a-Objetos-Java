//Quando declaramos estes dois m�todos, estamos fazendo umas sobrecarga de m�todos,
//ou method overloading em Java.
//Quando invocamos o m�todo com um inteiro como um argumento, o Java � inteligente o suficiente para invocar corretamente o m�todo que foi declarado com inteiro como par�metro.
//Caso invoquemos o m�todo usando um double como um argumento, 
//o method a ser executado ser� aquele que foi declarado com o tipo double em seu par�metro.
package br.com.residencia.polimorfismo.overload;

public class Main {

	public static void main(String[] args) {
		System.out.println("Inteiro 2 ao quadrado: " + Quadrado.quadrado(2));
        System.out.printf("Double PI ao quadrado: %.2f ", Quadrado.quadrado(3.14));

	}

}
