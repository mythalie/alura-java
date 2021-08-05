
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		System.out.println(conta.getNumero());
		
		Cliente mythalie = new Cliente();
		mythalie.setNome("Mythalie Sandretti");
		
		conta.setTitular(mythalie);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("estudante");
		
//		Cliente titularDaConta = conta.getTitular();
//		titularDaConta.setProfissao("estudante");
	}
	
}
