
public class TestaCondicional {
	
	public static void main(String[] args) {
		System.out.println("Tentando condicionais"); //sysout + ctrl espa�o completa o println.
		int idade = 23;
		int quantidadePessoas = 3;
		
		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos. Seja bem vindo!");
		} if(quantidadePessoas >= 2) {
			System.out.println("Voc� n�o tem 18 anos, mas pode entrar, pois est� acompanhado");
			} else {
			System.out.println("Infelizmente voc� n�o pode entrar!");
		}
	}
}


/*
Atalhos no Eclipse:

main ctrl + espa�o
para gerar o m�todo main

ctrl + shift + f
para formatar o c�digo fonte

sysout + ctrl + espa�o
para gerar a instru��o System.out.println()
*/
