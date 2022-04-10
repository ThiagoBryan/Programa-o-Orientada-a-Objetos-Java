package br.com.teste.classe.interfaces;

public class Carro implements Veiculo{
	//Atributos
	public  String cor;
	public  String placa;
	
	@Override //subscrevendo o metodo, se refere a Interface
	public void andar() {
		System.out.println("O carro andou");
		
	}

	@Override
	public void desligar() {
		System.out.println("O carro desligou");
		
	}
	
}
