package br.com.residencia;

import java.util.Scanner;

public class Lista03TreinarJava06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double extra, valorHora, valorHorasExtra, inss, salarioBase, descontoInss, salarioLiquido,
		horasTotais, horasExtras;
		double horasNormais = 160.0, aumentoHoraExtra = 1.5;

		
		System.out.println("\t===Mini Departamento Pessoal 2.0===\n\n");
		System.out.println("Horas trabalhadas no mês: " + horasNormais);
		System.out.println("Valor recebido por hora: ");
		valorHora = leia.nextDouble();
		System.out.println("Horas extras no mês: ");
		horasExtras = leia.nextDouble();
		System.out.println("% INSS: ");
		inss = leia.nextDouble();	
		leia.close();
		
		//saida
		salarioBase = horasNormais * valorHora;
				horasTotais = horasNormais + horasExtras;
				valorHorasExtra = valorHora * aumentoHoraExtra * horasExtras;
				descontoInss = (salarioBase + valorHorasExtra) * inss * 0.01;
				salarioLiquido = (salarioBase + valorHorasExtra) - descontoInss;
				
				System.out.println("\n\n****Contra-Cheque****\n\n");
				System.out.println("Salário base: " + salarioBase);
				System.out.println("Valor das horas extras:" + horasExtras);
				System.out.println("Desconto Inss: " + descontoInss);
				System.out.println("Salário Líquido: " + salarioLiquido);
				
			
				
		

	}

}
