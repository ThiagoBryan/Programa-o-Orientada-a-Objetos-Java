package br.com.curso.aula09;

public class Aula09 {

	public static void main(String[] args) {
		
			Pessoa pessoa01 = new Pessoa("Thiago",29, "Masculino");
			
			System.out.println(pessoa01.getIdade());
			pessoa01.fazerAniversario();
			System.out.println(pessoa01.toString());
			
			Livro livro01 = new Livro("Assassins Creed", "Sei não", 200, 0, true, pessoa01.getNome());
			
			livro01.abrir();
			System.out.println(livro01.toString());
			livro01.folhear(50);
			System.out.println(livro01.toString());
			livro01.avancarPagina();
			System.out.println(livro01.getPaginaAtual());
			livro01.avancarPagina();
			System.out.println(livro01.getPaginaAtual());
			livro01.avancarPagina();
			System.out.println(livro01.getPaginaAtual());
			livro01.voltarPagina();
			System.out.println(livro01.getPaginaAtual());			
			livro01.fechar();
			System.out.println(livro01.toString());
			livro01.avancarPagina();
			System.out.println(livro01.toString());

			
			System.out.println("\n\n\n");
			
			Livro livro02 = new Livro("Assassins Creed", "Sei não", 200, 201, true, pessoa01.getNome());
			
			System.out.println(livro02.toString());
			livro02.avancarPagina();
			System.out.println(livro02.getPaginaAtual());
			
			
			
	}

}
