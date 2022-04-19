package br.com.banco;

						//filha
public class ContaJuridica extends Conta {

	private String cnpj;

	public ContaJuridica(String titular, double saldo, String numeroConta, String cnpj) {
		super(titular, saldo, numeroConta); // super = pai;
		this.cnpj = cnpj;

	}

	public String getCnpj() {
		return cnpj;
	}

	@Override
	public String toString() {
		return super.toString() + " CNPJ: " + cnpj;
	}

					// Interface
	@Override
	public void deposita(double valor) {
		super.saldo += valor;

	}

	@Override
	public void saca(double valor) {
		if (super.saldo < valor) {
			System.out.println("Saldo Insuficiente");
		} else {
			super.saldo -= valor;
		}

	}

}
