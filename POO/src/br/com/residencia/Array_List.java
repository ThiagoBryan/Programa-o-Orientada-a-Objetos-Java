package br.com.residencia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import br.com.curso.aula10.Funcionario;

public class Array_List{

	public static void main(String[] args) {

		System.out.println("\t\tARRAYliST NORMAL\n");
		List lista = new ArrayList();

		lista.add("Thiago");
		lista.add("Tata");
		lista.add("Severino");
		System.out.println("Tamanho da lista: " + lista.size()); // tamanho da lista;
		System.out.println("Nome: " + lista.get(0)); // pega o nome da lista;
		System.out.println("Nome: " + lista.get(1));// pega o nome da lista;
		System.out.println("Nome: " + lista.get(2));// pega o nome da lista;
		System.out.println("Remove: " + lista.remove(0)); // remove o item da lista e o que estava na posiçao 1 vai para
															// poisição 0;
		System.out.println("Tamanho da lista: " + lista.size());
		System.out.println("Nome: " + lista.get(0));
		System.out.println("Nome: " + lista.get(1));

		System.out.println("\n\tARRAYLIST POR ORDEM ALFABETICA USANDO LIST");

		List<String> lista1 = new ArrayList<>();

		lista1.add("Thiago");
		lista1.add("Tata");
		lista1.add("Severino");
		System.out.println(lista1);
		Collections.sort(lista1); // PARA ORDENAR POR ORDEM ALFABETICA
		System.out.println(lista1);
		
		System.out.println("\n\tSET IGNORA REPETIDOS\n");
		//IGNORA OS REPETIDOS E IMPRIME EM ORDEM ALEATORIA
		Set<String> cargos = new HashSet();
		
		cargos.add("Gerente");
		cargos.add("Diretor");
		cargos.add("Presidente");
		cargos.add("Secretária");
		cargos.add("Funcionarios");
		cargos.add("Diretor"); // REPETIDO
		
		
		System.out.println("APENAS IGNORA OS REPETIDOS");
		System.out.println(cargos);
		//SORT NAO FUNCIONA PARA ORDENAR EM SET APENAS EM LIST
		
Set<String> cargos1 = new LinkedHashSet();
		//TRAS NA ORDEM LISTADA IGNORANDO REPETIDOS
		cargos1.add("Gerente");
		cargos1.add("Diretor");
		cargos1.add("Presidente");
		cargos1.add("Secretária");
		cargos1.add("Funcionarios");
		cargos1.add("Diretor"); // REPETIDO
		
		System.out.println("IGNORA OS REPETIDOS E TRAS NA ORDEM LISTADA");
		System.out.println(cargos1);
		
Set<String> cargos2 = new TreeSet();
			// TRAS NA ORDEM ALFABETICA IGNORANDO OS REPETIDOS
		cargos2.add("Gerente");
		cargos2.add("Diretor");
		cargos2.add("Presidente");
		cargos2.add("Secretária");
		cargos2.add("Funcionarios");
		cargos2.add("Diretor"); // REPETIDO
		
		System.out.println("IGNORA OS REPETIDOS E COLOCA EM ORDEM ALFABETICA");
		System.out.println(cargos2);
	
		
		
		
	}

	

}
