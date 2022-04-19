package br.com.trabalhoBanco;

public class Gerente {

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
	public Gerente(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	//TO STRING
	@Override
	public String toString() {
		return "Gerente [Nome: " + nome + ", CPF: " + cpf + "]";
	}

}
