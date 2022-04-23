package br.com.curso.aula12;

public class Peixe extends Animal {

	
	//ATRIBUTOS
		private String corEscama;
		
	// GETTERS AND SETTERS
		
	public String getCorEscama() {
			return corEscama;
		}
	
		public void setCorEscama(String corEscama) {
			this.corEscama = corEscama;
		}


	//METODOS
		
		public void soltarBolha() {
			System.out.println("Bolha!!!");
		}
		
		
	@Override
		public void locomover() {
		System.out.println("Nadando!!!");
		}


		@Override
		public void alimentar() {
			System.out.println("Comendo algas!!!");
		}


		@Override
		public void emitirSom() {
			System.out.println("Peixe não faz som!!!");
		
		}


		//TO STRING
		@Override
		public String toString() {
			return "Peixe [Cor da Escama: " + getCorEscama() + ", Peso: " + getPeso()
					+ ", Idade: " + getIdade() + ", Membros: " + getMembros() + "]";
		}
		
}
