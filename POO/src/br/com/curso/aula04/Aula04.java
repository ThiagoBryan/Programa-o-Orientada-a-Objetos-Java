//	USANDO SET E GET
package br.com.curso.aula04;

public class Aula04 {

	public static void main(String[] args) {
		
		Caneta04 c1 = new Caneta04();
		
		c1.setModelo("BIC");
		//c1.modelo = "BIC";nao funcona pois esta privado em Caneta04;
		
		c1.setPonta(0.7);
		//c1.ponta = 0.7; nao funcona pois esta privado em Caneta04;
		
		//c1.status(); //tirar o status para fazer o sysout; 
		System.out.println("Uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
	}

}
