package br.com.residencia;

public class ExemploCasting {

	public static void main(String[] args) {
		
		int a = 5, b = 8 ;
		// implicíto, nao precisa de cast;
		double soma;
		
		soma = a + b;
		System.out.println("Soma: " + soma);
		
		double div;
		// cast int a e b para double;
		div = (double) a / b;
		
		System.out.println("Soma: " + div);
		
		
		char carac = 'A';
		char carac2 = 'Z';
		//Ver Tabela conversao de letras para numero;
		int num = carac + carac2;
		System.out.println(carac + " " + carac2 + " " + num);
		
		
		
		
		

	}

}
