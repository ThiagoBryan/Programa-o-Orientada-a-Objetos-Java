package br.com.residencia;

import java.util.Scanner;

public class Betmais {

	public static void main(String[] args) {
		int valor, contador, totalPar = 0, totalImpar = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print(" Bem vindo ao sistema Betmais \n\n");
        System.out.print("Por favor, insira dez valores aleatórios entre 1 e 10 para que o sistema separe\na soma dos números pares e a subtração dos números ímpares.\n");

        for(contador = 1; contador <= 10; contador ++) {

            do {
                System.out.print("\nInsira o " + contador + "º valor: ");
                valor = scanner.nextInt();

                if(valor > 0 && valor < 11) {

                    if(valor % 2 == 0) {
                        totalPar += valor;
                    }else totalImpar -= valor;
                }
            }while(valor < 0 || valor > 10);
            scanner.close();
        }

        System.out.println("\nO total da soma de números pares é: " + totalPar);
        System.out.println("O total da subtração dos números ímpares é: " + totalImpar);

	}

}
