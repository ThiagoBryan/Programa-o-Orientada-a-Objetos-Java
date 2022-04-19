package br.com.trabalhoBanco;

public class ContaPoupanca {

	private String numeroAgencia;
	private String numeroConta;
	private boolean statusConta; 
	private Cliente titular;
	private double saldo;
	
	//GETTERS AND SETTERS
	public String getNumeroAgencia() {
		return numeroAgencia;
	}
	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public boolean getStatusConta() {
		return statusConta;
	}
	public void setStatusConta(boolean statusConta) {
		this.statusConta = statusConta;
	}
	
	//CONSTRUTOR
	public ContaPoupanca(String numeroAgencia, String numeroConta) {
		super();
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
	}
	
	//MÉTODOS
	
	public boolean sacar(double valor) {
		if (this.saldo < valor) {
			return false;
		} else {
			double novoSaldo = this.saldo - valor;
			this.saldo = novoSaldo;
			return true;
		}
	}
	
	public void depositar(double valor) {
		this.saldo += valor;

	}
	
	public boolean transferir(double valor, Conta contaDestino) {
		if (this.saldo > valor) {
			this.sacar(valor);
			contaDestino.depositar(valor);
			return true;
		} else {
			return false;
		}
	}
	
	
	public void exibirExtrato() {
		System.out.println(this.titular + " " + this.numeroConta + " " + this.saldo);
	}

	
	
	public void pagarContas() {

	}

	public void investir() {

	}

	public void pegarEmprestimo() {

	}

	public void fecharConta() {

	}

	
	
	
	//TO STRING
	@Override
	public String toString() {
		return "ContaPoupança [numeroAgencia=" + numeroAgencia + ", numeroConta=" + numeroConta + "]";
	}
	
	
	
	
	
}
