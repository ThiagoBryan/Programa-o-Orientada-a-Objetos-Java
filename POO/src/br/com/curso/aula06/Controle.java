package br.com.curso.aula06;

public class Controle implements Controlador {
	//ATRIBUTOS
	private Integer volume;
	private boolean ligado;
	private boolean tocando;
	
	
	//GETTERS AND SETTERS
	public Integer getVolume() {
		return volume;
	}
	public void setVolume(Integer volume) {
		this.volume = volume;
	}
	public boolean getLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public boolean getTocando() {
		return tocando;
	}
	public void setTocando(boolean desligado) {
		this.tocando = desligado;
	}
	//CONSTRUTOR
	public Controle(Integer volume, boolean ligado, boolean tocando) {
		super();
		this.volume = 30;
		this.ligado = false;
		this.tocando = false;
	}
	
	//INTERFACE
	
	@Override
	public void ligar() {
		this.setLigado(true);
		
	}
	@Override
	public void desligar() {
		this.setLigado(false);
		
	}
	@Override
	public void abrirMenu() {
		System.out.println("Está ligado? " + this.getLigado()); // para saber se esta ligado;
		System.out.println("Está tocando? " + this.getTocando());
		System.out.println("Volume: " + this.getVolume());
		for(Integer i=0; i <= this.getVolume(); i+=10);
		System.out.println("|");
		//System.out.println(getTocando());
	}
	
	@Override
	public void fecharMenu() {
		System.out.println("Fechando Menu");
		
	}
	@Override
	public void maisVolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume() + 1);
		}
		
	}
	@Override
	public void menosVolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume() - 1);
		}
		
	}
	@Override
	public void ligarMudo() {
		if(this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
		
	}
	@Override
	public void desligarMudo() {
		if(this.getLigado() && this.getVolume() == 0) {
			this.setVolume(30);
		}
		
	}
	@Override
	public void play() {
		if(this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		}
		
	}
	@Override
	public void pause() {
		if(this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		}
		
	}
	@Override
	public String toString() {
		return "Controle [Volume: " + volume + ", Ligado: " + ligado + ", tocando: " + tocando + "]";
	}	
	
	
}
