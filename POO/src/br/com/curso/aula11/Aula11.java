package br.com.curso.aula11;

public class Aula11 {

	public static void main(String[] args) {
		
		//Pessoa pessoa01 = new Pessoa(); Nao funciona pois Pessoa é abstract;

		  Visitante visitante01 = new Visitante();
		  visitante01.setNome("Miranha");
		  visitante01.setIdade(22);
		  visitante01.setSexo("Masculino");
		  System.out.println(visitante01.toString());
		  
		  
		  Aluno aluno01 = new Aluno();
		  aluno01.setNome("Goku");
		  aluno01.setIdade(55);
		  aluno01.setSexo("Masculino");
		  aluno01.setMatricula(2255);
		  aluno01.setCurso("DBZ");
		  System.out.println(aluno01.toString());
		  aluno01.pagarMensalidade();
		  
		  Bolsista bolsista01 = new Bolsista();
		  bolsista01.setNome("Claire");
		  bolsista01.setIdade(22);
		  bolsista01.setSexo("Feminino");
		  bolsista01.setMatricula(3366);
		  bolsista01.setBolsa(12.5);
		  bolsista01.setCurso("FORBIBEN-WEST");
		  System.out.println(bolsista01.toString());
		  bolsista01.pagarMensalidade();
		  

		  
		  
	}

}
