package br.com.teste.classe.interfaces;

public class Main {

	public static void main(String[] args) {
		
				Carro gol = new Carro();
				Moto crosser = new Moto();
				
				gol.cor = "verde";
				gol.placa = "AAA1A23";
				gol.andar();
				gol.desligar();
				//Carro.desligar();
				
				crosser.cor = "azul";
				crosser.placa = "BBB1B23";
				crosser.andar();
				crosser.desligar();
				crosser.descanso();
				
				
				
				System.out.println("O carro da cor: " + gol.cor + " Com a placa: " + gol.placa);
				System.out.println("A moto da cor: " + crosser.cor + " Com a placa: " + crosser.placa);


	}

}
