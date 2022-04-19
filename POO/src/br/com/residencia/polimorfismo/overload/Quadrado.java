//Por exemplo, vamos declarar, num mesmo aplicativo, dois métodos quadrados: um que recebe e 
//retorna inteiros: 
package br.com.residencia.polimorfismo.overload;

public class Quadrado {
	
	public static int quadrado(int num) {
		//int quadrado;
		return num * num;
		//return quadrado;
	}
	
	public static double quadrado(double num) {
		double quadrado;
		quadrado = num * num;
		return quadrado;
	}

}
