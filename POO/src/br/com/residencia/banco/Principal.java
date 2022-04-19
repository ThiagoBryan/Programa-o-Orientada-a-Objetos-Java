package br.com.residencia.banco;

public class Principal {

	public static void main(String[] args) {

		Conta cliente01 = new Conta();
		cliente01.titular = "Thiago Thurler";
		cliente01.numeroConta = "12345";
		cliente01.saldo = 1000;
		cliente01.tipoDeConta = "F�sica";

		Conta cliente02 = new Conta();
		cliente02.titular = "Ariane Viana";
		cliente02.numeroConta = "98765";
		cliente02.saldo = 2500;
		cliente02.tipoDeConta = "Jur�dica";
	
		

		System.out.println(cliente01.titular + " Seu saldo atual � de: R$ " + cliente01.saldo);
		System.out.println(cliente02.titular + " Seu saldo atual � de: R$ " + cliente02.saldo);
		System.out.println("\n");
		if(cliente01.sacar(800)) {
			System.out.println("Saque conclu�do!");
		}else {
			System.out.println("Saldo Insuficiente...");
		}
		System.out.println(cliente01.titular + " Seu saldo atual ap�s o saque � de: R$ " + cliente01.saldo);

		cliente01.transferirValores(200, cliente02);
		System.out.println(cliente01.titular + " Saldo atual ap�s transfer�ncia: " + cliente01.saldo);
		System.out.println(cliente02.titular + " Seu saldo atual �: " + cliente02.saldo);

		
		System.out.println("Seu saldo atual � de: R$ " + cliente01.saldo);
		cliente01.depositar(100);
		System.out.println("Seu saldo ap�s o dep�sito � de: R$ " + cliente01.saldo);
	}

}
