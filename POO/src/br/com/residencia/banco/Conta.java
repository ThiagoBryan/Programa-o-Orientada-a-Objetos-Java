package br.com.residencia.banco;
		// EDI��ES AQUI
public class Conta {
	// Atributos
	String titular;
	String numeroConta;
	double saldo;
	String tipoDeConta;

	// M�todos Propriedades da conta

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

	// M�todos Tipos de Opera��es

	public boolean transferirValores(double valor, Conta cliente02) {
		if (this.saldo < valor) {
			return false;
		} else {
			double novoSaldo = this.saldo - valor;
			this.saldo = novoSaldo;
			cliente02.saldo = cliente02.saldo + valor;
			return true;
			
		}
	}
}
