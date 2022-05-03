package br.com.residencia.banco.principal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.residencia.banco.agencias.Agencia;
import br.com.residencia.banco.contas.ContaCorrente;
import br.com.residencia.banco.contas.ContaPoupanca;
import br.com.residencia.banco.enums.TipoConta;
import br.com.residencia.banco.enums.TipoPessoa;
import br.com.residencia.banco.io.EscritaCorrente;
import br.com.residencia.banco.io.EscritaPoupanca;
import br.com.residencia.banco.io.EscritaSaldo;
import br.com.residencia.banco.io.Leitura;
import br.com.residencia.banco.logins.Login;
import br.com.residencia.banco.menus.MenuConta;
import br.com.residencia.banco.pessoas.Cliente;
import br.com.residencia.banco.pessoas.Gerente;
import br.com.residencia.banco.pessoas.Presidente;

public class Principal {

	public static void main(String[] args) throws IOException {


//		Leitura.leitor("arquivo.txt");
//		Login.login();

		List<Agencia> agencias = new ArrayList<>();

		Agencia ag1 = new Agencia(1, "Rua 12", "8256", 1111, 11111);
		Agencia ag2 = new Agencia(2, "Rua 13", "5236", 2222, 22222);
		Agencia ag3 = new Agencia(3, "Rua 14", "4125", 3333, 33333);
		Agencia ag4 = new Agencia(4, "Rua 15", "8974", 4444, 44444);
		agencias.add(ag1);
		agencias.add(ag2);
		agencias.add(ag3);
		agencias.add(ag4);

		List<Presidente> presidente = new ArrayList<>();
		Presidente p01 = new Presidente("Astolfo", "456.693.987-55", "Rua 15", "99236-6589", 001, 15.000, "Presidente",
				999, "55555", TipoPessoa.PRESIDENTE);

		presidente.add(p01);

//		List<Diretor> diretores = new ArrayList<>();
//		
//		Diretor d01 = new Diretor("Mario", "569.698.789.88", "Rua 10", "99816-9869", LocalDate.of(1965, 05, 8), 8000.00,111,1,ag1);
//		Diretor d02 = new Diretor("Marcos", "569.874.856-88", "Rua 11", "92365-2569", LocalDate.of(1975, 8, 05), 7000.00,222,1,ag2);
//		diretores.add(d01);
//		diretores.add(d02);

		List<Gerente> gerentes = new ArrayList<>();

		Gerente g01 = new Gerente("Antonio", "456.987.321-66", "Rua 6", "99969-9856", 999999, 5000.00, "Gerente", 1,
				"12345", TipoPessoa.GERENTE);
		Gerente g02 = new Gerente("Severino", "789.236.852-77", "Rua 7", "98123-7896", 888888, 2500.00, "Gerente", 2,
				"45678", TipoPessoa.GERENTE);
		Gerente g03 = new Gerente("Maria", "456.987.321-66", "Rua 8", "99969-9856", 777777, 3000.00, "Gerente", 3,
				"78965", TipoPessoa.GERENTE);
		Gerente g04 = new Gerente("João", "459.698.789-55", "Rua 9", "99236-7896", 666666, 4000.00, "Gerente", 4,
				"52365", TipoPessoa.GERENTE);
		gerentes.add(g01);
		gerentes.add(g02);
		gerentes.add(g03);
		gerentes.add(g04);

		List<Cliente> clientes = new ArrayList<>();
		Cliente c01 = new Cliente("Thiago", "123.456.789-55", "Rua 1", "99856-6965", 00002, g01.getIdGerente(), "th123",
				TipoPessoa.CLIENTE);
		Cliente c02 = new Cliente("Ariane", "987.654.321-55", "Rua 2", "98123-6589", 00001, g02.getIdGerente(), "ar123",
				TipoPessoa.CLIENTE);
		Cliente c03 = new Cliente("Ricardo", "789.654.123-33", "Rua 3", "99236-5698", 00003, g03.getIdGerente(),
				"ri123", TipoPessoa.CLIENTE);
		Cliente c04 = new Cliente("Andrea", "654.789.321-66", "Rua 4", "99136-5698", 00004, g04.getIdGerente(), "an123",
				TipoPessoa.CLIENTE);
		Cliente c05 = new Cliente("Vanessa", "654.987.123-55", "Rua 5", "99263-6987", 00005, g02.getIdGerente(),
				"va123", TipoPessoa.CLIENTE);
		Cliente c06 = new Cliente("Douglas", "98765432155", "Rua 2", "98136-6569", 00006, g01.getIdGerente(),
				"lucas123", TipoPessoa.CLIENTE);
		clientes.add(c01);
		clientes.add(c02);
		clientes.add(c03);
		clientes.add(c04);
		clientes.add(c05);
		clientes.add(c06);

		// clientes.sort(Comparator.comparing(Cliente::getNome)); //ORDENAR por ordem
		// alfabetica
		// clientes.forEach(cliente -> System.out.println(cliente));

		List<ContaPoupanca> contasPoupancas = new ArrayList<>();

		ContaPoupanca cp1 = new ContaPoupanca(1, TipoConta.POUPANCA, ag1.getNumeroAgencia(), "1234", 0.00, 1,
				c01.getIdCliente());
		ContaPoupanca cp2 = new ContaPoupanca(2, TipoConta.POUPANCA, ag2.getNumeroAgencia(), "4569", 0.00, 2,
				c02.getIdCliente());
		ContaPoupanca cp3 = new ContaPoupanca(3, TipoConta.POUPANCA, ag3.getNumeroAgencia(), "98745", 0.00, 3,
				c03.getIdCliente());
		ContaPoupanca cp4 = new ContaPoupanca(4, TipoConta.POUPANCA, ag4.getNumeroAgencia(), "56987", 0.00, 4,
				c04.getIdCliente());
		ContaPoupanca cp5 = new ContaPoupanca(5, TipoConta.POUPANCA, ag2.getNumeroAgencia(), "85478", 0.00, 5,
				c05.getIdCliente());
		ContaPoupanca cp6 = new ContaPoupanca(6, TipoConta.POUPANCA, ag3.getNumeroAgencia(), "96623", 0.00, 6,
				c06.getIdCliente());
		contasPoupancas.add(cp1);
		contasPoupancas.add(cp2);
		contasPoupancas.add(cp3);
		contasPoupancas.add(cp4);
		contasPoupancas.add(cp5);
		contasPoupancas.add(cp6);

		List<ContaCorrente> contasCorrentes = new ArrayList<>();

		ContaCorrente cc1 = new ContaCorrente(1, TipoConta.CORRENTE, ag1.getNumeroAgencia(), "223365", 0.00, 1,
				c01.getIdCliente());
		ContaCorrente cc2 = new ContaCorrente(2, TipoConta.CORRENTE, ag2.getNumeroAgencia(), "889654", 0.00, 2,
				c02.getIdCliente());
		ContaCorrente cc3 = new ContaCorrente(3, TipoConta.CORRENTE, ag3.getNumeroAgencia(), "698541", 0.00, 3,
				c03.getIdCliente());
		ContaCorrente cc4 = new ContaCorrente(4, TipoConta.CORRENTE, ag4.getNumeroAgencia(), "69854", 0.00, 4,
				c04.getIdCliente());
		ContaCorrente cc5 = new ContaCorrente(5, TipoConta.CORRENTE, ag2.getNumeroAgencia(), "36589", 0.00, 5,
				c05.getIdGerente());
		ContaCorrente cc6 = new ContaCorrente(6, TipoConta.CORRENTE, ag1.getNumeroAgencia(), "63259", 0.00, 6,
				c06.getIdGerente());
		contasCorrentes.add(cc1);
		contasCorrentes.add(cc2);
		contasCorrentes.add(cc3);
		contasCorrentes.add(cc4);
		contasCorrentes.add(cc5);
		contasCorrentes.add(cc6);
		
							//EXEMPLOS
		System.out.println("\t===Contas Correntes===\n");
		System.out.println("\t===Exemplo 01===\n");
		System.out.println("\t===DEPÓSITOS===\n");
		
		System.out.printf("Saldo C.C1: R$ %.2f\n",cc1.getSaldo());
		cc1.depositar(-50);
		System.out.printf("Saldo C.C1: R$ %.2f\n",cc1.getSaldo());
		
		cc1.depositar(500);
		System.out.printf("Saldo após depósito C.C1: R$ %.2f\n",cc1.getSaldo());
		
		System.out.println("\n\t===Saques===\n");
		System.out.printf("Saldo C.C1: R$ %.2f\n",cc1.getSaldo());
		cc1.sacar(0);
		
		System.out.printf("Saldo C.C1: R$ %.2f\n",cc1.getSaldo());
		cc1.sacar(100);
		System.out.printf("Saldo após Saque C.C1: R$ %.2f\n",cc1.getSaldo());
		
		System.out.println("\n\t===Transferência===\n");
		System.out.printf("Saldo C.C1: R$ %.2f\n",cc1.getSaldo());
		System.out.printf("Saldo C.C1: R$ %.2f\n",cc3.getSaldo());
		cc1.transferir(100, cc2);
		System.out.printf("\nSaldo C.C1: R$ %.2f\n",cc1.getSaldo());
		System.out.printf("Saldo C.C2: R$ %.2f\n",cc2.getSaldo());
		
		
		System.out.println("\t===Exemplo 02===\n");
		System.out.println("\t===DEPÓSITOS===\n");
		System.out.printf("\nSaldo C.C2: R$ %.2f\n",cc3.getSaldo());
		cc3.depositar(1000);
		System.out.printf("Saldo após depósito C.P1: R$ %.2f\n",cc3.getSaldo());
		
		System.out.println("\n\t===Saques===\n");
		System.out.printf("Saldo C.C2: R$ %.2f\n",cc3.getSaldo());
		cc3.sacar(200);
		System.out.printf("Saldo após Saque C.C2: R$ %.2f\n",cc3.getSaldo());
		
		System.out.println("\n\t===Transferência===\n");
		System.out.printf("Saldo C.C2: R$ %.2f\n",cc3.getSaldo());
		System.out.printf("Saldo C.P2: R$ %.2f\n",cp2.getSaldo());
		cc3.transferir(150, cp2);
		System.out.printf("\nSaldo C.P1: R$ %.2f\n",cc3.getSaldo());
		System.out.printf("Saldo C.P2: R$ %.2f\n",cp2.getSaldo());
		
		System.out.println("\t===Conta Poupança===\n");
		System.out.println("\t===DEPÓSITOS===\n");
		System.out.printf("\nSaldo C.P1: R$ %.2f\n",cp1.getSaldo());
		cp1.depositar(1000);
		System.out.printf("Saldo após depósito C.P1: R$ %.2f\n",cp1.getSaldo());
		
		System.out.println("\n\t===Saques===\n");
		System.out.printf("Saldo C.P1: R$ %.2f\n",cp1.getSaldo());
		cp1.sacar(200);
		System.out.printf("Saldo após Saque C.P1: R$ %.2f\n",cp1.getSaldo());
		
		System.out.println("\n\t===Transferência===\n");
		System.out.printf("Saldo C.P1: R$ %.2f\n",cp1.getSaldo());
		System.out.printf("Saldo C.P2: R$ %.2f\n",cp3.getSaldo());
		cp1.transferir(150, cp3);
		System.out.printf("\nSaldo C.P1: R$ %.2f\n",cp1.getSaldo());
		System.out.printf("Saldo C.P2: R$ %.2f\n",cp3.getSaldo());
		
		System.out.println("\n\t===Rendimentos Poupança===");
		
		System.out.printf("\nSaldo C.P1: R$ %.2f\n",cp4.getSaldo());
		cp4.depositar(1500);
		System.out.printf("Saldo após depósito C.P1: R$ %.2f\n",cp4.getSaldo());
		
		System.out.println(cp4.calculaRendimentos(1500, 20));
		
	

		// MENU CONTA CLIENTE

//		MenuConta m = new MenuConta();
//		m.menuOpcoes();

		// Escrita
		EscritaCorrente.comprovanteTransacoes(cc1);
		EscritaPoupanca.comprovanteRendimento(cp4, 1500.00, 20);
		EscritaSaldo.saldo(cc1);
		
		
		
		
		

//		LocalDate data = LocalDate.now();
//		System.out.println(data);
//		LocalDateTime dataTime = LocalDateTime.now();
//		System.out.println(dataTime);

	}
}
