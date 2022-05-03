package br.com.residencia.banco.contas;

import br.com.residencia.banco.enums.TipoConta;

public class ContaPoupanca extends Conta {
	
	private Integer idContaPoupanca;
	private Integer idCliente;
	
	
	//GETTERS AND SETTERS
	
	public Integer getIdContaPoupanca() {
		return idContaPoupanca;
	}
	
	public Integer getIdCliente() {
		return this.idCliente;
	}

	//CONSTRUTOR
	public ContaPoupanca(Integer idConta, TipoConta tipoConta, String numeroAgencia, String numeroConta, Double saldo,
			Integer idContaPoupanca, Integer idCliente) {
		super(idConta, tipoConta, numeroAgencia, numeroConta, saldo);
		this.idContaPoupanca = idContaPoupanca;
		this.idCliente = idCliente;
	}

	//METODOS
	
	@Override
	public boolean sacar(double valor) {
		if (this.saldo < valor || valor < 0) {
			System.out.println("N�o � poss�vel sacar esse valor");
			return false;
		} else {
			System.out.println("Valor Retirado: " + valor);
			double novoSaldo = this.saldo - valor;
			this.saldo = novoSaldo;
			return true;
		}

	}

	
	@Override
	public void depositar(double valor) {
		if(valor < 0) {
			System.out.println("S� � possivel fazer dep�sitos com valores acima de R$0,00");		
		}else {
			this .saldo += valor;
		}
	}
			
	
	@Override
	public boolean transferir(double valor, Conta contaDestino) {
		if (this.saldo > valor) {
			this.sacar(valor);
			super.depositarPorTransferencia(valor, contaDestino);
			return true;
		} else {
			System.out.println("Saldo Insuficiente.");
			return false;
		}
	}
	// RENDIMENTO POUPAN�A

	public String calculaRendimentos(double valor, Integer dias) {
		if (dias < 15) {
			return "Rendimentos s� podem ser calculados acima de 14 dias.";
		} else {
			double valorFinal = dias * 0.001 * valor;
			return"Valor informado: R$" + valor + " [Seu rendimento ser� de: R$" + valorFinal + " em " 
					+ dias + " dias.]";
		}

	}
	
}
