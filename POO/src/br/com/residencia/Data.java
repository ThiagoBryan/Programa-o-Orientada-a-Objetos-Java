package br.com.residencia;

import java.time.LocalDate;
import java.time.Period;

public class Data {

	public static void main(String[] args) {
										//diminui os dias
		LocalDate data = LocalDate.now().minusDays(0);
		System.out.println("Data: " + data);
		System.out.println("Dia da Semana: " + data.getDayOfWeek().name()); // dia da semana
		System.out.println("Dia da Semana: " + data.getDayOfWeek().getValue());// numero do dia da semana
		System.out.println("Mês: " + data.getMonth().name());// mês do ano
		System.out.println("Mês: " + data.getMonth().getValue()); // numero do mês
		System.out.println("Ano: " + data.getYear());// Ano
		System.out.println("Ano: " + data.getDayOfYear()); // dia do ano
		
		System.out.println();
		
		LocalDate dataAniversario = LocalDate.of(1992, 8, 21);
		System.out.println("Aniversario: " + dataAniversario);
		
		Period periodo = Period.between(dataAniversario, data);
		System.out.println(periodo); //29 years; 8 months; 6 dias
		System.out.println(periodo.getYears());
		
		

	}

}
