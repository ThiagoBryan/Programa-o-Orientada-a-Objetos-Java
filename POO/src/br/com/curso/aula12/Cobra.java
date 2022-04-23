package br.com.curso.aula12;

public class Cobra extends Reptil {

	//TO STRING
	@Override
	public String toString() {
		return "Cobra [Cor da Escama: " + getCorEscama() + ", Peso: " + getPeso() + ", Idade: " + getIdade()
				+ ", Membros: " + getMembros() + "]";
	}

	
}
