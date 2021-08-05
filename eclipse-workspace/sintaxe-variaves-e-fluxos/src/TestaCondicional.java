
public class TestaCondicional {
	
	public static void main(String[] args) {
		System.out.println("Tentando condicionais"); //sysout + ctrl espaço completa o println.
		int idade = 23;
		int quantidadePessoas = 3;
		
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos. Seja bem vindo!");
		} if(quantidadePessoas >= 2) {
			System.out.println("Você não tem 18 anos, mas pode entrar, pois está acompanhado");
			} else {
			System.out.println("Infelizmente você não pode entrar!");
		}
	}
}


/*
Atalhos no Eclipse:

main ctrl + espaço
para gerar o método main

ctrl + shift + f
para formatar o código fonte

sysout + ctrl + espaço
para gerar a instrução System.out.println()
*/
