package br.com.curso.aula07;

import java.util.Random;

public class Luta {
		// ATRIBUTOS
	private Lutador desafiado; //SAO INSTANCIAS  DA CLASSE LUTADOR
	private Lutador desafiante;
	private Integer rounds;
	private boolean aprovada;
	
	//GETTERS E SETTERS
	
	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiente() {
		return desafiante;
	}

	public void setDesafiente(Lutador desafiente) {
		this.desafiante = desafiente;
	}

	public Integer getRounds() {
		return rounds;
	}

	public void setRounds(Integer rounds) {
		this.rounds = rounds;
	}

	public boolean getAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	//MÉTODOS
	
		public void marcarLuta(Lutador lutador01,Lutador lutador02) {
			if(lutador01.getCategoria().equals(lutador02.getCategoria()) && lutador01 != lutador02){// São da mesma categoria && sao lutadores diferentes;
				this.aprovada = true;
				this.setDesafiado(lutador01);
				this.setDesafiente(lutador02);
			}else {
				this.aprovada = false;
				this.setDesafiado(null);
				this.setDesafiente(null);
			}
		}

	public void lutar() {
		if(this.aprovada) {
			System.out.println("### DESAFIADO ###\n");
			this.desafiado.apresentar(); //PERGUNTAR PQ toString(); NÃO FUNCIONA;
			System.out.println("### DESAFIANTE ###\n");
			this.desafiante.apresentar(); //PERGUNTAR PQ toString(); NÃO FUNCIONA;
			
			Random aleatorio = new Random();
			Integer vencedor = aleatorio.nextInt(3);// Gera 3 resultados 0 , 1 ou 2;
			
			System.out.println("\t\t==== RESULTADO DA LUTA ===\n");
			switch (vencedor) {
			case 0: //Empate
				System.out.println("Empate");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
			case 1: // Ganhou desafiado
				System.out.println("Vitória do: " + this.desafiado.getNome());
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
			case 2: //Ganhou desafiante
				System.out.println("Vitória do: " + this.desafiante.getNome());
				this.desafiante.ganharLuta();
				this.desafiado.perderLuta();
				break;
			}
			
			System.out.println("\t\t  === FIM RESULTADO ===\n");
		}else {
			System.out.println("A luta não pode acontecer!");
		}
		
	}
}
