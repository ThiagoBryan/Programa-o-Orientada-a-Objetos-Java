package br.com.curso.aula03;

public class Aula03 {
	
	public static void main(String[] args) {
		Caneta03 c1 = new Caneta03();
		c1.modelo = "Bic Crystal";
		c1.cor = "Azul";
		//c1.ponta = 0.5; esta privado na classe Caneta02;
		c1.carga = 50;
		c1.status();
		c1.rabiscar();
		//c1.tampada = esta privado na classe Caneta02;
		c1.tampar();
		
		System.out.println();
		
		VideoGame03 ps = new VideoGame03();
		
		ps.modelo = "Ps4";
		ps.cor = "Preto";
		//ps.ligado = true;// esta privado na classe VideoGame02
		ps.ligar();
		ps.status();
		ps.jogar();
		
	}
	

}
