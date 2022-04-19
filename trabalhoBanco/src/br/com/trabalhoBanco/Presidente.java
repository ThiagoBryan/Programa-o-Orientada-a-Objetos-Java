package br.com.trabalhoBanco;

public class Presidente {

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
	public Presidente(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	
	//TO STRING
	@Override
	public String toString() {
		return "Presidente [Nome: " + nome + ", CPF: " + cpf + "]";
	}
	
	
	
	
}
