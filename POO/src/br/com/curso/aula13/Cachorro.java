package br.com.curso.aula13;

//SOBRECARGA varios metodos com assinaturas diferentes dentro da mesma classe
// ou seja têm diferentes quantidades e tipos de atributos; 
public class Cachorro extends Lobo {

	// METODOS

	@Override
	public void emitirSom() {
		System.out.println("Au Au Au Au!");
	}

	public void reagir(String frase) {
		if (frase.equals("Toma comida") || frase.equals("Olá!")) {
			System.out.println("Abanar e latir");
		} else {
			System.out.println("Rosnar");
		}
	}

	public void reagir(Integer hora, Integer min) {
		if (hora < 12) {
			System.out.println("Abanar");
		} else if (hora >= 18) {
			System.out.println("Ignorar");
		} else {
			System.out.println("Abanar e latir");
		}
	}

	public void reagir(boolean dono) {
		if (dono) {
			System.out.println("Abanar");
		} else {
			System.out.println("Rosnar e latir");
		}
	}

	public void reagir(Integer idade, Double peso) {
		if (idade < 5) {
			if (peso < 10) {
				System.out.println("Abanar");
			} else {
				System.out.println("Latir");
			}
			if (peso < 10) {
				System.out.println("Rosnar");
			} else {
				System.out.println("Ignorar");
			}

		}
	}
}
