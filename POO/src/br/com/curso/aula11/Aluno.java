package br.com.curso.aula11;
						// Aluno � Heran�a para implementa��o 
						// ou seja ela herda atributos da 
                        //m�e mas tamb�m tem atibutos exclusivos;
	

//se colocar Final quer dizer que essa classe e final
//vai da erro em Bolsista e Tecnico pois s�o filhas;
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
