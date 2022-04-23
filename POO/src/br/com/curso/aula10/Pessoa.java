package br.com.curso.aula10;

public class Pessoa {

		//ATRIBUTOS
	
		private String nome;
		private Integer idade;
		private String sexo;
		
		//METODOS
		
		public void fazerAniversario() {
			this.idade ++;
		}
		
		//GETTERS AND SETTERS

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Integer getIdade() {
			return idade;
		}

		public void setIdade(Integer idade) {
			this.idade = idade;
		}

		public String getSexo() {
			return sexo;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		
		
		
		//TO STRING

		@Override
		public String toString() {
			return "Pessoa [Nome: " + nome + ",\nIdade: " + idade + ",\nSexo: " + sexo + "]";
		}
		
		
		
		
		
		
		
		
		
		
		
		
}
