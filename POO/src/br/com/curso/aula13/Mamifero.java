package br.com.curso.aula13;

public class Mamifero extends Animal {

	
	//ATRIBUTOS
		private String corPelo;

		//GETTERS AND SETTERS
		
		public String getCorPelo() {
			return corPelo;
		}

		public void setCorPelo(String corPelo) {
			this.corPelo = corPelo;
		}
		
		
		//METODOS
		@Override
		public void locomover() {
			System.out.println("Correndo!!!");
		}

		@Override
		public void alimentar() {
			System.out.println("Comendo!!!");
		}

		@Override
		public void emitirSom() {
			System.out.println("Som mamífero!!!");
		}

		//TO STRING
		@Override
		public String toString() {
			return "Mamifero [Cor do Pelo: " + getCorPelo() + ", Peso: " + getPeso()
					+ ", Idade: " + getIdade() + ", Membros: " + getMembros() + "]";
		}
		
}
