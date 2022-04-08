
		// Em nossa empresa, h� tabelas com o quanto foi gasto em cada m�s.
		// Para fechar o balan�o do primeiro trimestre, precisamos somar o gasto total.
		// Sabendo que, em janeiro, foram gastos R$ 15000, em fevereiro, R$ 23000, e em
		// mar�o, R$ 17000,
		// fa�a um programa que calcule e imprima o gasto total no trimestre.
		// Passos:
		// *Crie uma classe chamada Balan�oTrimestral com um bloco main;
		// *Dentro do main, declare uma vari�vel inteira chamada gastosJaneiro e
		// inicialize-a com 15000;
		// * Crie tamb�m as vari�veis gastoFevereiro e gastoMar�o, inicializando-as com
		// 23000 e 17000,
		// respectivamente, e utilize uma linha para cada declara��o;
		// *Crie uma vari�vel chamada gastosTrimestre e inicialize-a com a soma das
		// outras 3 vari�veis;
		// *Imprima a Vari�vel gastosTrimestre;

package br.com.residencia;

public class Balan�oTrimestralExercicio003 {

	public static void main(String[] args) {


		System.out.println("\t===BALAN�O TRIMESTRAL===\n");

		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMar�o = 17000;

		System.out.println("Gastos em Janeiro: " + gastosJaneiro);
		System.out.println("Gastos em Fevereiro: " + gastosFevereiro);
		System.out.println("Gastos em Mar�o: " + gastosMar�o);

		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMar�o;
		System.out.println("O balan�o trimestral � de: " + gastosTrimestre);
		
		float media = gastosTrimestre / 3;
		
		System.out.println("M�dia Trimestral: " + media);

	}

}
