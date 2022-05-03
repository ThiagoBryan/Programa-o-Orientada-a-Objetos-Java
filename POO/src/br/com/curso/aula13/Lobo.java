package br.com.curso.aula13;

public class Lobo extends Mamifero{

	@Override
	public void emitirSom() {
		System.out.println("Auuuuuuuuuuuuuuu!");
	}

	@Override
	public String toString() {
		return "Lobo [Cor do Pelo: " + getCorPelo() + ", Peso: " + getPeso() + ", Idade: " + getIdade()
				+ ", Membros: " + getMembros() + "]";
	}

	

}
