package br.com.teste.classe.interfaces;

public class Moto implements Veiculo {

	public String cor;
	public String placa;

	@Override
	public void andar() {
		System.out.println("A moto andou");

	}
	@Override
	public void desligar() {
		System.out.println("A moto desligou");
	}
	// N�o tem Override, se refere a classe;
	public void descanso() {
		System.out.println("A moto tem descanso ");
	}
	
	
}