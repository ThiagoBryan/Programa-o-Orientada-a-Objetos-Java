package br.com.curso.aula07e08;

public class Aula07 {

	public static void main(String[] args) {


		Lutador lutadores[] = new Lutador[6];
		Lutador lutador01 = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 2, 1);
		Lutador lutador02 = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
		Lutador lutador03 = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
		Lutador lutador04 = new Lutador("Dead Code", "Austrália", 28, 1.93, 81.6, 13, 0, 2);
		Lutador lutador05 = new Lutador("UFOCobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3);
		Lutador lutador06 = new Lutador("Nerdart", "EUA", 30, 1.81, 105.7, 12, 2, 4);
		lutadores[0] = lutador01;
		lutadores[1] = lutador02;
		lutadores[2] = lutador03;
		lutadores[3] = lutador04;
		lutadores[4] = lutador05;
		lutadores[5] = lutador06;

		System.out.println("\t\t\t\t\t\t\t===Apresentaçao===\n");
		// i = index // tamanho do array
		for (int i = 0; i < lutadores.length; i++) {
		System.out.println(lutadores[i].toString());
		}
		
		System.out.println();
//		System.out.println();
//		System.out.println(lutadores[3].getNome() + " " + lutadores[3].getPeso());
//		lutadores[3].ganharLuta();
//		lutadores[3].status();
		System.out.println();
		
		Luta UEC01 = new Luta();
		UEC01.marcarLuta(lutadores[2], lutadores[3]);
		UEC01.lutar();
		lutadores[2].status();
		lutadores[3].status();
		
	}

}
