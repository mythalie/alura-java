
public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		Conta contaDaLeticia = new Conta();
		System.out.println(contaDaLeticia.getSaldo());
		
		contaDaLeticia.titular = new Cliente();
		System.out.println(contaDaLeticia.titular);
		
		contaDaLeticia.titular.nome = "Leticia";
		System.out.println(contaDaLeticia.titular.nome);
	}

}
