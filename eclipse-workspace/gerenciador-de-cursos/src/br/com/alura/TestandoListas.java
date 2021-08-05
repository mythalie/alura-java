package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	
	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
		aulas.remove(0);
		
		System.out.println(aulas);
		
		for (String aula : aulas) { //para cada string aula dentro de aulas, fa�a o seguinte:
			System.out.println("Aula: " + aula);
		}
		
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula �: " + primeiraAula);
	
		for(int i = 0; i < aulas.size(); i++) { //(Cole��es) size devolve quantos elementos tem na lista
			System.out.println("Aula: " + aulas.get(i));
		}
		
		aulas.forEach(aula -> {	
			System.out.println("percorrendo....");
			System.out.println("Aula: " + aula);
			}); //para cada aula -> execute esse trecho de c�digo
		
		aulas.add("Aumentando nosso conhecimento");
		System.out.println(aulas);
		
		Collections.sort(aulas);
		System.out.println("Depois de ordenado");
		System.out.println(aulas); 

		}
}	
