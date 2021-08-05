package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
	
	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>(); //não existe uma ordem alfabetica desses objetos.
		alunos.add("Rodrigo Turini");		  //caso adicione um mesmo nome, ele vai considerar somente 1. 
		alunos.add("Alberto Souza");		  //vantagens HashSet - pesquisas rápidas quando se tem varios objetos. Enquanto ArrayList confere 1 de cada vez.
		alunos.add("Nico Steppat");			  //não tem a opção GET
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		alunos.remove("Sergio Lopes");
		System.out.println(pauloEstaMatriculado);
		
		for (String aluno : alunos) { //para cada ALUNO que eu tenho dentro dessa minha coleção ALUNOS, faça:
			System.out.println(aluno);
		}
		
//		alunos.forEach(aluno -> {
//			System.out.println(aluno);
//		});
		
		System.out.println(alunos);
	}

}
