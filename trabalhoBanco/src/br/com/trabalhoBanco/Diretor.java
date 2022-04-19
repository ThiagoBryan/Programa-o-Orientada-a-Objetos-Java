package br.com.trabalhoBanco;

public class Diretor {

	private String nome;
	private String cpf;

	//GETTERS AND SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	//CONSTRUTOR
	public Diretor(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	
	//MÉTODOS
	
	

	//TO STRING
	@Override
	public String toString() {
		return "Diretor [Nome: " + nome + ", Cpf: " + cpf + "]";
	}

}
