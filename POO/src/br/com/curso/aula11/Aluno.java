package br.com.curso.aula11;
						// Aluno é Herança para implementação 
						// ou seja ela herda atributos da 
                        //mãe mas também tem atibutos exclusivos;
	

//se colocar Final quer dizer que essa classe e final
//vai da erro em Bolsista e Tecnico pois são filhas;
public class Aluno extends Pessoa {

	
		//ATRIBUTOS
	
		private Integer matricula;
		private String curso;
		
		//GETTERS AND SETTERS
		
		public Integer getMatricula() {
			return matricula;
		}

		public void setMatricula(Integer matricula) {
			this.matricula = matricula;
		}
		
		public String getCurso() {
			return curso;
		}

		public void setCurso(String curso) {
			this.curso = curso;
		}

		//METODOS
		
		public void pagarMensalidade() {
			System.out.println("Pagando mensalidade do Aluno: " + this.getNome());
		}

		@Override
		public String toString() {
			return "Aluno [Matricula: " + matricula + ", Curso: " + curso + ", Matricula: " + getMatricula()
					+ ", Curso: " + getCurso() + ", Nome: " + getNome() + ", Idade: " + getIdade()
					+ ", Sexo: " + getSexo() + "]";
		}

	
		
		
		
}
