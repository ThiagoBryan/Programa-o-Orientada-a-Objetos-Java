package br.com.curso.aula12;

public class Tartaruga extends Reptil {

	@Override
	public void locomover() {
		System.out.println("Andando beeemmm devaaagaarrr");
	}

	@Override
	public String toString() {
		return "Tartaruga [Cor da Escama: " + getCorEscama() + ", Peso: " + getPeso() + ", Idade: " + getIdade()
				+ ", Membros: " + getMembros() + "]";
	}
	
	
	
	
	
	

	
	
}
