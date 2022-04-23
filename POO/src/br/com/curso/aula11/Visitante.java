package br.com.curso.aula11;
				// Visitante é uma Herança pobre ou seja
				// recebe os atributos da mãe porém
				// não tem atributos exclusivos;
public class Visitante extends Pessoa {

	//TO STRING
	@Override
	public String toString() {
		return "Visitante [Nome: " + getNome() + ", Idade: " + getIdade() + ", Sexo: " + getSexo() + "]";
	}
	 
}
