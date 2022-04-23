package br.com.curso.aula12;

public class Ave extends Animal{
		//ATRIBUTOS
		private String corPena;
		
		//GETTERS AND SETTERS
		
		public String getCorPena() {
			return corPena;
		}

		public void setCorPena(String corPena) {
			this.corPena = corPena;
		}

		//METODOS
		public void fazerNinho() {
			System.out.println("Ninho!!!");
		}
		
		@Override
		public void locomover() {
			System.out.println("Voando!!!");
		}

		@Override
		public void alimentar() {
			System.out.println("Comendo Frutas!!!");
		}

		@Override
		public void emitirSom() {
			System.out.println("Som da Ave!!!");
		}
		
		// TO STRING

		@Override
		public String toString() {
			return "Ave [Cor da Pena: " + corPena + ", Peso: " + getPeso() + ", Idade: " + getIdade()
					+ ", Membros: " + getMembros() + "]";
		}
		
		
		
}
