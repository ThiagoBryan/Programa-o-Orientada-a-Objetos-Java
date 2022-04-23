package br.com.curso.aula12;

public class Arara extends Ave {

	
	// TO STRING

			@Override
			public String toString() {
				return "Arara [Cor da Pena: " + getCorPena() + ", Peso: " + getPeso() + ", Idade: " + getIdade()
						+ ", Membros: " + getMembros() + "]";
			}
}
