
public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDaMythalie = new Conta();
		contaDaMythalie.saldo = 100;
		contaDaMythalie.deposita(50); //metodo deposita - nomeDaReferencia.nomeDoMetodo()
		System.out.println(contaDaMythalie.saldo);
		
		contaDaMythalie.saca(20); //invocar metodo usa ()
		System.out.println(contaDaMythalie.saldo);
		
		Conta contaDaLeticia = new Conta();
		contaDaLeticia.deposita(1000);
		
		if(contaDaLeticia.transfere(300, contaDaMythalie)) {
			System.out.println("Transferência feita com sucesso!");
		} else {
			System.out.println("Saldo insuficiente");
		}
		System.out.println(contaDaLeticia.saldo);
		System.out.println(contaDaMythalie.saldo);
		
		contaDaMythalie.titular = "Mythalie Sandretti";
		System.out.println(contaDaMythalie.titular);
	}

}
