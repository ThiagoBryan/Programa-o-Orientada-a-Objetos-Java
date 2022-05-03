package br.com.residencia.banco.contas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.residencia.banco.enums.TipoConta;

public class ContaCorrente extends Conta {

	// Atributos
		
	private Integer idContaCorrente;
	private Integer idCliente;
	private List<Double> taxaTotalDeOperacoes = new ArrayList<>(); 
	private Map<String, Double> tipoTransacaoValor = new HashMap<>();
	
	//private Integer quantSaques = 0, quantDepositos = 0, quantTransferencia = 0;
	
	//GETTERS AND SETTERS
	
	public Integer getIdContaCorrente() {
		return idContaCorrente;
	}

	public Integer getIdCliente() {
		return this.idCliente; 
	}


	public double getTotalTaxas() {
		return taxaTotalDeOperacoes.stream().mapToDouble(Double::doubleValue).sum();
							    
	}

	public Map<String, Double> getTipoTransacaoValor() {
		return tipoTransacaoValor;
	}

//	public Integer getQuantSaques() {
//		return quantSaques;
//	}
//
//	public Integer getQuantDepositos() {
//		return quantDepositos;
//	}
//
//	public Integer getQuantTransferencia() {
//		return quantTransferencia;
//	}

	//CONSTRUTOR
	public ContaCorrente(Integer idConta, TipoConta tipoConta, String numeroAgencia, String numeroConta, Double saldo,
			Integer idContaCorrente, Integer idCliente) {
		super(idConta, tipoConta, numeroAgencia, numeroConta, saldo);
		this.idContaCorrente = idContaCorrente;
		this.idCliente = idCliente;
		
		
	}
	

		//METODOS
	@Override
	public boolean sacar(double valor) {
		if (this.saldo < valor || valor == 0) {
			System.out.println("Não é possível sacar esse valor");
			return false;
		} else {

			double novoSaldo = this.saldo - valor - super.getTaxaSaque();
			this.saldo = novoSaldo;
			this.taxaTotalDeOperacoes.add(super.getTaxaSaque());
			this.tipoTransacaoValor.put("Saque", valor);
			//quantSaques++;
			return true;
		}
	}

	
	@Override
	public void depositar(double valor) {
		if (valor < 0) {
			System.out.println("Só é possivel fazer depósitos com valores acima de R$0,00");
		} else {
			this.saldo += valor - super.getTaxaDeposito();
			this.taxaTotalDeOperacoes.add(super.getTaxaDeposito());
			this.tipoTransacaoValor.put("Depósito", valor);
			//quantDepositos++;
			
		}
	}

	@Override
	public boolean transferir(double valor, Conta contaDestino) {
		if (this.saldo > valor) {
			this.sacar(valor); // DESCONTA 0.1
			this.saldo -= super.getTaxaDeposito(); // DESCONTA 0.1
			contaDestino.depositarPorTransferencia(valor, contaDestino);
			this.taxaTotalDeOperacoes.add(super.getTaxaDeposito());
			this.tipoTransacaoValor.put("Transferência", valor);
			//quantTransferencia++;
			return true;
			
		} else {
			System.out.println("Saldo Insuficiente.");
			return false;
		}
	}

}
