package br.com.banco;

//Abstract: N�o pode ser inst�nciada    //Interface
public abstract class Conta implements AlteraSaldo { // pai

	// private: somente a classe tem acesso;
	
	protected String titular;
	protected String numeroConta;
	protected double saldo;

	public Conta(String titular, double saldo, String numeroConta) {
		this.titular = titular;
		this.saldo = saldo;
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	
 
	@Override // sobreescrever o m�todo da classe;
	public String toString() {

		return "Titular: " + this.titular + " Saldo: " + this.saldo + "N�mero da conta: " + this.numeroConta;
	}

}
