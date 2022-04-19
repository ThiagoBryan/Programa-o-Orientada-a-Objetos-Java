package br.com.curso.aula05.banco;

public class ContaBanco {
	// ATRIBUTOS

	public Integer numeroConta;
	protected String tipoConta;
	private String dono;
	private double saldo;
	private boolean status;

	// MÉTODOS
	public void abrirConta() {
		this.setTipoConta(tipoConta);
		this.setStatus(true);
		if (tipoConta == "C.C") {
			this.setSaldo(50.00);
		} else if (tipoConta == "C.P") {
			this.setSaldo(150.00);
		}
		System.out.println("Conta Aberta!");
	}

	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Para fechar sua conta saldo deve ser 0.");
		} else if (this.getSaldo() < 0) {
			System.out.println("Regularize seus débitos.");
		} else {
			this.setStatus(false); // VERIFICA SE A CONTA EXISTE
			System.out.println("Conta Inativa.");
		}
	}

	public void depositar(double valor) {
		if (this.getStatus() == true) { // VERIFICA SE A CONTA EXISTE
			// this.saldo = this.saldo + valor; ou;
			this.setSaldo(this.getSaldo() + valor);
			System.out.println("Depósito Concluído na conta de: " + this.getDono());
		} else {
			System.out.println("Impossível depositar em uma conta Inativa.");
		}
	}

	public void sacar(double valor) {
		if (this.getStatus() == true) { // VERIFICA SE A CONTA EXISTE
			if (this.getSaldo() >= valor) {
				// this.saldo -= valor;ou
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Saque Concluído da conta de: " + this.getDono());
			} else {
				System.out.println("Saldo Insuficiente.");
			}
		} else {
			System.out.println("Impossível sacar de uma conta Inativa.");
		}
	}

	public void pagarMensal() {
		double valor = 0;
		if (this.getTipoConta() == "C.C") {
			valor = 12.00;
			System.out.println("Pagamento de R$ 12,00");
		} else if (this.getTipoConta() == "C.P") {
			valor = 20.00;
			System.out.println("Pagamento de R$ 20,00");
		}
		if (this.getStatus() == true) {
			// this.saldo -= valor;ou
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Mensalidade paga por: " + this.getDono());
		} else {
			System.out.println("Não é possível pagar uma conta inativa.");
		}
	}

	// METODOS ESPECIAIS//
		// CONSTRUTOR

	public ContaBanco(Integer numeroConta, String tipoConta, String dono, double saldo, boolean status) {
		super();
		this.numeroConta = numeroConta;
		this.tipoConta = tipoConta;
		this.dono = dono;
		this.saldo = saldo;
		this.status = status;
	}

	// GETTERS AND SETTERS

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	// TO STRING
	@Override
	public String toString() {
		return "ContaBanco [Número da Conta: " + this.getNumeroConta() + ", Tipo de Conta: " + this.getTipoConta() + ", Dono: " +this.getDono()
				+ ", Saldo: " + this.getSaldo() + ", Status: " + status + "]";
	}

}
