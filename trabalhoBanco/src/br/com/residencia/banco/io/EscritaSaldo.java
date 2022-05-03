package br.com.residencia.banco.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import br.com.residencia.banco.contas.ContaCorrente;

public class EscritaSaldo {

	final static String PATH_BASICO = "./temp/";
	final static String EXTENSAO = ".txt";

	public static void saldo(ContaCorrente contaCorrente) throws IOException {

		String nomeArquivo = "Saldo";

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nomeArquivo + EXTENSAO));

		String linha = " ";

		linha = "Conta: " + contaCorrente.getIdConta();
		buffWrite.append(linha + "\n");
		
		linha = "Saldo: R$" + contaCorrente.getSaldo();
		buffWrite.append(linha + "\n");

		
		buffWrite.close();

	}
}
