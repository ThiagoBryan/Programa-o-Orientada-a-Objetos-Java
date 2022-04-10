
		// Em nossa empresa, há tabelas com o quanto foi gasto em cada mês.
		// Para fechar o balanço do primeiro trimestre, precisamos somar o gasto total.
		// Sabendo que, em janeiro, foram gastos R$ 15000, em fevereiro, R$ 23000, e em
		// março, R$ 17000,
		// faça um programa que calcule e imprima o gasto total no trimestre.
		// Passos:
		// *Crie uma classe chamada BalançoTrimestral com um bloco main;
		// *Dentro do main, declare uma variável inteira chamada gastosJaneiro e
		// inicialize-a com 15000;
		// * Crie também as variáveis gastoFevereiro e gastoMarço, inicializando-as com
		// 23000 e 17000,
		// respectivamente, e utilize uma linha para cada declaração;
		// *Crie uma variável chamada gastosTrimestre e inicialize-a com a soma das
		// outras 3 variáveis;
		// *Imprima a Variável gastosTrimestre;

package br.com.residencia;

public class BalançoTrimestralExercicio003 {

	public static void main(String[] args) {


		System.out.println("\t===BALANÇO TRIMESTRAL===\n");

		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarço = 17000;

		System.out.println("Gastos em Janeiro: " + gastosJaneiro);
		System.out.println("Gastos em Fevereiro: " + gastosFevereiro);
		System.out.println("Gastos em Março: " + gastosMarço);

		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarço;
		System.out.println("O balanço trimestral é de: " + gastosTrimestre);
		
		float media = gastosTrimestre / 3;
		
		System.out.println("Média Trimestral: " + media);

	}

}
