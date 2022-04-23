package br.com.curso.aula10;

public class Aluno extends Pessoa {

	// ATRIBUTOS

	private Integer matricula;
	private String Curso;

	// METODOS
	public void cancelarMatricula() {
		System.out.println("Matrícula Cancelada");
	}

//	@Override
//	public void fazerAniversario() {
//		super.fazerAniversario();
//	}

	// GETTERS AND SETTERS

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return Curso;
	}

	public void setCurso(String curso) {
		Curso = curso;
	}
}
