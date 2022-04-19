package br.com.banco;

					//filha
public class PessoaFisica extends Conta {

	private String cpf;

	public PessoaFisica(String titular, double saldo, String numeroConta, String cpf) {
		super(titular, saldo, numeroConta);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	@Override
	public String toString() {
		return super.toString() + " CPF: " + cpf;
	}
						// Interface

	@Override
	public void deposita(double valor) {
		super.saldo += valor;

	}

	@Override
	public void saca(double valor) {
		if (super.saldo < valor) {
			System.out.println("Saldo Insuficiente!");
		} else {
			super.saldo -= valor;
		}

	}

}
