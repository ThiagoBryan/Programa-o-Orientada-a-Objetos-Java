package br.com.curso.aula09;

public class Pessoa {
		//ATRIBUTOS
		private String nome;
		private Integer idade;
		private String sexo;
		
		//MÉTODOS
		 public void fazerAniversario() {
			 if(this.idade > 0) {
				 this.idade ++; 
				 System.out.println("Parabéns!!!");
			 }
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
		
		//CONSTRUTOR

		public Pessoa(String nome, Integer idade, String sexo) {
			super();
			this.nome = nome;
			this.idade = idade;
			this.sexo = sexo;
		}

			//TO STRING
		@Override
		public String toString() {
			return "Pessoa [Nome: " + nome + ", Idade: " + idade + ", Sexo: " + sexo + "]";
		}
		
		
		 
		 
		
		
}
