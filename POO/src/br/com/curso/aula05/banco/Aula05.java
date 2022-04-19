package br.com.curso.aula05.banco;

public class Aula05 {

	public static void main(String[] args) {
		//C.P
		ContaBanco conta01 = new ContaBanco(2365, "C.P", "Jubileu", 00.00, true);
		System.out.println(conta01.toString());
		
		conta01.abrirConta();
		System.out.println(conta01.toString());
		conta01.depositar(300.00);
		System.out.println(conta01.toString());
		conta01.sacar(10);
		System.out.println(conta01.toString());
		conta01.pagarMensal();
		System.out.println(conta01.toString());
		conta01.fecharConta();
		System.out.println(conta01.toString());
		conta01.sacar(450.00);
		System.out.println(conta01.toString());
		conta01.sacar(420.00);
		System.out.println(conta01.toString());
		conta01.fecharConta();
		System.out.println(conta01.toString());
		conta01.depositar(50);
		System.out.println(conta01.toString());
	
		System.out.println("\n\n");
		//C.C
		
		ContaBanco conta02 = new ContaBanco(8965, "C.C", "Creusa", 00.00, true);
		System.out.println(conta02.toString());
		
		conta02.abrirConta();
		System.out.println(conta02.toString());
		conta02.depositar(500.00);
		System.out.println(conta02.toString());
		conta02.sacar(30);
		System.out.println(conta02.toString());
		conta02.pagarMensal();
		System.out.println(conta02.toString());
		conta02.fecharConta();
		System.out.println(conta02.toString());
		conta02.sacar(808.00);
		System.out.println(conta02.toString());
		conta02.sacar(508.00);
		System.out.println(conta02.toString());
		conta02.fecharConta();
		System.out.println(conta02.toString());
		conta02.depositar(50);
		System.out.println(conta02.toString());
	
	
	
	}

}
