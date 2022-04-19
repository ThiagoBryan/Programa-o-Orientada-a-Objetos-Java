/*O programa “mini departamento pessoal” lê a quantidade de horas trabalhadas por um 
funcionário em um mês, o valor que ele recebe por hora e o percentual de desconto 
para o INSS, e calcula:
a.O salário bruto (horas trabalhadas * valor hora)
b.O valor do desconto para o INSS
c.O salário líquido (adicionais menos descontos).
d.Após os cálculos, será impresso o contra cheque (Salário bruto, valor do desconto do INSS,
e o salário líquido do funcionário).*/
package br.com.residencia;

import java.util.Scanner;

public class Lista03TreinarJava05 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		double horasTrabalhadas, salarioBruto, valorHora, inss, salarioLiquido, descontoInss;

		System.out.println("\t===Mini Departamento Pessoal===\n\n");
		System.out.println("Horas trabalhadas no mês: ");
		horasTrabalhadas = leia.nextDouble();
		System.out.println("Valor recebido por hora: ");
		valorHora = leia.nextDouble();
		System.out.println("% INSS: ");
		inss = leia.nextDouble();
		System.out.println("Desconto INSS = 7,5%\n");
		leia.close();

		// saida
		salarioBruto = horasTrabalhadas * valorHora;
		descontoInss = salarioBruto * inss * 0.01;
		salarioLiquido = salarioBruto - descontoInss;

		System.out.println("\n\n****Contra-Cheque****\n\n");
		System.out.println("Salário Bruto: " + salarioBruto);
		System.out.println("Desconto Inss: " + descontoInss);
		System.out.println("Salário Líquido: " + salarioLiquido);

	}

}
