package br.com.curso.aula11;

public class Bolsista extends Aluno {

			//ATRIBUTOS
		private double bolsa;
		
		//GETTERS AND SETTERS
		
		public double getBolsa() {
			return bolsa;
		}

		public void setBolsa(double bolsa) {
			this.bolsa = bolsa;
		}

		//METODOS
		public void renovarBolsa() {
			System.out.println("Renovando bolsa de: " + this.getNome());
		}
		
		@Override
		public void pagarMensalidade() {
			System.out.println(this.getNome() + " é bolsista. Pagamneto facilitado.");
			super.pagarMensalidade();
		}


		//TO STRING
		@Override
		public String toString() {
			return "Bolsista [Bolsa: " + getBolsa() + ", Matricula: " + getMatricula()
					+ ", Curso: " + getCurso() +  ", Nome: " + getNome()
					+ ", Idade: " + getIdade() + ", Sexo: " + getSexo() + "]";
		}	
}
