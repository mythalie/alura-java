
public class TestaCondicional2 {
	
	public static void main(String[] args) {
		System.out.println("Tentando condicionais"); //sysout + ctrl espaço completa o println.
		int idade = 23;
//		int quantidadePessoas = 2;
		boolean acompanhado = true;
		
//		if (idade >= 18 || quantidadePessoas >= 2) { // operações lógicas AND (&&) e OR (||)
		
		if (idade >= 18 && acompanhado) { // (== compara)
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("Infelizmente você não pode entrar!");
		}
	}

}
	