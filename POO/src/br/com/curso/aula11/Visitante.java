package br.com.curso.aula11;
				// Visitante � uma Heran�a pobre ou seja
				// recebe os atributos da m�e por�m
				// n�o tem atributos exclusivos;
public class Visitante extends Pessoa {

	//TO STRING
	@Override
	public String toString() {
		return "Visitante [Nome: " + getNome() + ", Idade: " + getIdade() + ", Sexo: " + getSexo() + "]";
	}
	 
}
