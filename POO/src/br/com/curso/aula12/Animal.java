package br.com.curso.aula12;

public abstract class Animal {
		//ATRIBUTOS
		private double peso;
		private Integer idade;
		private Integer membros;
		
		//GETTERS AND SETTERS
		
		public double getPeso() {
			return peso;
		}

		public void setPeso(double peso) {
			this.peso = peso;
		}

		public Integer getIdade() {
			return idade;
		}

		public void setIdade(Integer idade) {
			this.idade = idade;
		}

		public Integer getMembros() {
			return membros;
		}

		public void setMembros(Integer membros) {
			this.membros = membros;
		}

		//METODOS
		public abstract void locomover();
		
		public abstract void alimentar();
		
		public abstract void emitirSom();
}
