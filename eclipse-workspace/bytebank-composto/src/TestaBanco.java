
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente mythalie = new Cliente();
		mythalie.nome = "Mythalie Sandretti";
		mythalie.cpf = "222.222.222-22";
		mythalie.profissao = "programadora";
		
		Conta contaDaMythalie = new Conta();
		contaDaMythalie.deposita(100);
		
		//associa a cliente Mythalie a conta contaDaMythalie
		contaDaMythalie.titular = mythalie;
		System.out.println(contaDaMythalie.titular.nome);
	}

}
