package br.com.banco.main;

import br.com.banco.ContaJuridica;
import br.com.banco.PessoaFisica;

public class TesteConta {

	public static void main(String[] args) {

		PessoaFisica contaPf = new PessoaFisica("Thiago ", 200, " 99887", " 12345678999");
		ContaJuridica contaPj = new ContaJuridica("Tata ", 250, " 55668", " 98765432100");
		PessoaFisica contaPf2 = contaPf;
		ContaJuridica contaPj2 = new ContaJuridica("Tata ", 250, " 55668", " 98765432100");

		System.out.println(contaPf);
		System.out.println(contaPj);
		System.out.println(contaPf2);
		System.out.println(contaPj2);

		//System.out.println(contaPf == contaPf2);// comparando referência memória
		//System.out.println(contaPj == contaPj2);// comparando referência memória
		//System.out.println(contaPj.getCnpj() == contaPj2.getCnpj());// comparando os valores

		//System.out.println("Titlular: " + contaPf.getCpf() + " Saldo: " + contaPf.getSaldo());
//		contaPf.deposita(100);
//		System.out.println("Saldo: " + contaPf.getSaldo());

//		contaPf.saca(50);
//		System.out.println("Saldo: " + contaPf.getSaldo());

//		contaPf.saca(400);
//		System.out.println("Saldo: " + contaPf.getSaldo());

	}

}
