package br.com.curso.aula10;

public class Principal {

	public static void main(String[] args) {
	
		Pessoa pessoa01 = new Pessoa();
		Aluno pessoa02 = new Aluno();
		Professor pessoa03 = new Professor();
		Funcionario pessoa04 = new Funcionario();
		
		pessoa01.setNome("Miranha");
		pessoa02.setNome("Ellie");
		pessoa03.setNome("Gohan");
		pessoa04.setNome("Aloy");
		
		pessoa01.setSexo("Masculino");
		pessoa04.setSexo("Feminino");
		pessoa02.setIdade(22);
		
		pessoa02.setCurso("Inform�tica");
		pessoa03.setSalario(2500.99);		//N�o estao ligadas
		pessoa04.setSetor("Estoque");
		
		//pessoa01.receberAumento(550.20);
		//pessoa02.mudarTrabalho();  // S�o erradas pois essas pessoas nao t�m esses metodos..
		//pessoa04.cancelarMatricula();
		
		System.out.println(pessoa01.toString());
		System.out.println(pessoa02.toString());
		System.out.println(pessoa03.toString());
		System.out.println(pessoa04.toString());
		
	
		
		
		
		
		
	}

}
