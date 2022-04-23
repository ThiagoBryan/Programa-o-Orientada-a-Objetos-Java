package br.com.curso.aula12;

public class Cachorro extends Mamifero {

	//METODOS
		public void enterrarOsso() {
			System.out.println("Enterrando osso");
		}
		
		public void abanarRabo() {
			System.out.println("Abanando o rabo");
		}

		@Override
		public void emitirSom() {
			System.out.println("Latindo");
			
		}

		@Override
		public String toString() {
			return "Cachorro [CorPelo: " + getCorPelo() + ", Peso: " + getPeso() + ", Idade: " + getIdade()
					+ "]";
		}
		
		
		
		
		
}
