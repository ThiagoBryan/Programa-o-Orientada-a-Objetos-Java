package br.com.curso.aula10;

public class Funcionario extends Pessoa{

		//ATRIBUTOS
	
	private String setor;
	private boolean trabalhando;
	
	//METODOS
	
	public void mudarTrabalho() {
		this.trabalhando =! this.trabalhando;
	}
	
//	@Override
//	public void fazerAniversario() {
//		super.fazerAniversario();
//	}	
	
	//GETTERS AND SETTERS


	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public boolean getTrabalhando() {
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
	
	
	
}
