package br.com.curso.aula12;

public class Goldfish extends Peixe {

	

	//TO STRING
	@Override
	public String toString() {
		return "Goldfish [Cor da Escama: " + getCorEscama() + ", Peso: " + getPeso()
				+ ", Idade: " + getIdade() + ", Membros: " + getMembros() + "]";
	}
	
}
