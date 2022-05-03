package br.com.residencia.banco.menus;

import java.util.Scanner;
import br.com.residencia.banco.logins.Login;
import br.com.residencia.banco.contas.ContaCorrente;

public class MenuConta {

	Scanner sc = new Scanner(System.in);

	public static void menuOpcoes() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n");
		System.out.println("===================================================");
		System.out.println("          S I S T E M A   B A N C A R I O          ");
		System.out.println("===================================================");
		System.out.println("[1] Movimenta��o da Conta");
		System.out.println("[2] Relat�rios");
		System.out.println("[3] Sair");
		System.out.print("Opera��o: ");
		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
		//	Scanner sc = new Scanner(System.in);
			System.out.println("\n");
			System.out.println("===================================================");
			System.out.println("          S I S T E M A   B A N C A R I O          ");
			System.out.println("===================================================");
			System.out.println("[1] Saque");
			System.out.println("[2] Dep�sito");
			System.out.println("[3] Transfer�ncia");
			System.out.println("[4] Voltar");
			System.out.print("Digite a op��o desejada: ");
			int oper = sc.nextInt();

			if (oper == 1) {
				System.out.println("Digite o valor de saque: ");
				double valor = sc.nextDouble();
				//ContaCorrente.sacar(valor);
				System.out.println("Saque de R$" + valor +" realizado com Sucesso\n\n");
				menuOpcoes();
				
				break;
			} else if (oper == 2) {

				System.out.println("Digite o valor do deposito: ");
				double valor = sc.nextDouble();
//				ContaCorrente.depositar(valor);
				System.out.println("Dep�sito de R$" + valor +" realizado com Sucesso\n\n");
				menuOpcoes();
				break;
			} else if (oper == 3) {
				System.out.println("Digite o valor da transfer�ncia: ");
				double valor = sc.nextDouble();
				System.out.println("Digite o n�mero da conta destino: ");
				String numContaDestino = sc.next();
//				for (int i = 0; i < 2; i++) {
//					if(minhasContas[i].numConta.equals(numContaDestino)) {
//					Conta contaDestino = minhasContas[i];
				// c1.transferir(100.0, c2);
				// c1.transferir(valor, minhasContas, contaDestino);
				System.out.println("Transfer�ncia realizado com Sucesso");
				menuOpcoes();
				break;
			} else if (oper == 4) {
				menuOpcoes();
				break;
			}

		case 2:
			System.out.println("\n");
			System.out.println("===================================================");
			System.out.println("             R E L A T � R I O S                   ");
			System.out.println("===================================================");
			System.out.println("[1] Saldo");
			System.out.println("[2] Tributa��o da Conta Corrente");
			System.out.println("[3] Rendimento da Poupan�a");
			System.out.println("[4] Voltar");
			System.out.print("Escolha uma op��o: ");
			int rel = sc.nextInt();

			switch (rel) {
			case 1:
				// saldo
				break;
			case 2:
				// tributa��o conta corrente
				break;
			case 3:
				// rendimento poupan�a
				break;
			case 4:
				MenuConta.menuOpcoes();
				break;
			default:
				System.out.println("Op��o Inv�lida!");
			}

		case 3:
			//fazer o limpa
			Login.login();

			break;

		default:
			System.out.println("Op��o inv�lida.");

		}

		sc.close();

	}
}