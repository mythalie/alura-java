package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {
	
	public static void main(String[] args) throws IOException {
		
		//Fluxo de entrada com Arquivo
		//Stream - of bytes. Ex: ler pdf
		//Reader - character. Ex: arquivo de texto
		
		InputStream fis = new FileInputStream("lorem.txt"); //criando fluxo concreto binário
		Reader isr = new InputStreamReader(fis, "UTF-8"); //melhorando os dados binários para caracteres
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		
		while(linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		br.close();
	}

}
