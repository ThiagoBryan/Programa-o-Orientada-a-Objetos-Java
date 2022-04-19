package br.com.trabalhoBanco;

import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws IOException {

		
		//Como chamar o metodo leitor da classe LeituraEscrita
		LeituraEscrita.leitor("objetoscriados.txt");
		
		//Como chamar o metodo escritor da classe LeituraEscrita
		LeituraEscrita.escritor("./");
		
		
		
		
		
		
		
		
		
		
//		 ContaCorrente contaCorrentes[] = new ContaCorrente[6];
//		 contaCorrentes[0] = new ContaCorrente("4569", "55699");
//		 contaCorrentes[1] = new ContaCorrente("8742", "45698");
//		 contaCorrentes[2] = new ContaCorrente("1256", "23658");
//		 contaCorrentes[3] = new ContaCorrente("9852", "36985");
//		 contaCorrentes[4] = new ContaCorrente("3658", "45896");
//		 contaCorrentes[5] = new ContaCorrente("7854", "36589");
//		 
//		 System.out.println("\t\t\t===Informações Conta Corrente===\n ");
//			for (Integer i = 0; i < contaCorrentes.length; i++) {
//				System.out.println(contaCorrentes[i].toString());
//			}
		
		 
//		Cliente clientes[] = new Cliente[6];
//		clientes[0] = new Cliente("Thiago", "12345678900", "Rua 1", "2292365698");
//		clientes[1] = new Cliente("Andrea", "98765432155", "Rua 2", "2269583236");
//		clientes[2] = new Cliente("Ariane", "65432198711", "Rua 3", "22992684596");
//		clientes[3] = new Cliente("Ricardo", "32198765433", "Rua 4", "2298569874");
//		clientes[4] = new Cliente("Douglas", "98732165422", "Rua 5", "2298136598");
//		clientes[5] = new Cliente("Vanessa", "65498732133", "Rua 6", "22991365987");
		
		
//		System.out.println("\t\t\t===Informações Clientes===\n ");
//		for (Integer i = 0; i < clientes.length; i++) {
//			System.out.println(clientes[i].toString());
//		}
//		
//		System.out.println();
//
//		Gerente gerente01 = new Gerente("Debora", "96385274100");
//		Gerente gerente02 = new Gerente("Nathan", "74185296355");
//
//		System.out.println();
//
//		System.out.println("\t\t\t===Informações Gerentes===\n ");
//		System.out.println(gerente01.toString());
//		System.out.println(gerente02.toString());
//
//		System.out.println();
//
//		Diretor diretor01 = new Diretor("Zeca Pagodinho", "85296317756");
//		Diretor diretor02 = new Diretor("Goku", "96325874155");
//		System.out.println("\t\t\t===Informações Diretores===\n ");
//		System.out.println(diretor01.toString());
//		System.out.println(diretor02.toString());
//
//		System.out.println();
//
//		Presidente presidente = new Presidente("Miranha", "55500011155");
//
//		System.out.println("\t\t\t===Informações Presidente===\n ");
//		System.out.println(presidente.toString());
//
//		System.out.println();

//		System.out.println("\n\n");
//		Conta cliente01 = new Conta();
//		cliente01.titular = "Thiago Thurler";
//		cliente01.numeroConta = "12345";
//		cliente01.saldo = 1000;
//		cliente01.tipoDeConta = "Física";
//
//		Conta cliente02 = new Conta();
//		cliente02.titular = "Ariane Viana";
//		cliente02.numeroConta = "98765";
//		cliente02.saldo = 2500;
//		cliente02.tipoDeConta = "Jurídica";
//
//		System.out.println(cliente01.titular + " Seu saldo atual é de: R$ " + cliente01.saldo);
//		System.out.println(cliente02.titular + " Seu saldo atual é de: R$ " + cliente02.saldo);
//		System.out.println("\n");
//		if (cliente01.sacar(800)) {
//			System.out.println("Saque concluído!");
//		} else {
//			System.out.println("Saldo Insuficiente...");
//		}
//		System.out.println(cliente01.titular + " Seu saldo atual após o saque é de: R$ " + cliente01.saldo);
//
//// TRANFERIR
//
//		if (cliente02.transferir(100, cliente01)) {
//			System.out.println("Transferência realizada com sucesso!");
//		} else
//			System.out.println("Saldo insuficiente!");
//
//		System.out.println(cliente01.titular + " Saldo atual após transferência: " + cliente01.saldo);
//		System.out.println(cliente02.titular + " Seu saldo atual é: " + cliente02.saldo);
//
//		System.out.println(cliente01.titular + "Seu saldo atual é de: R$ " + cliente01.saldo);
//		// cliente01.depositar(100);
//		System.out.println(cliente01.titular + "Seu saldo após o depósito é de: R$ " + cliente01.saldo);

	}
}
