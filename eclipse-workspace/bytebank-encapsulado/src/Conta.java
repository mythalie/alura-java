public class Conta {
	private double saldo;  //atributos do objeto conta
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total; //static � um atributo da classe
	
	public Conta(int agencia, int numero) {
		Conta.total++;
//		System.out.println("O total de contas �: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
//		System.out.println("Estou criando uma conta " + this.numero);
	}
	
	public void deposita(double valor) { //metodo 
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor; //Usamos o this dentro de um m�todo para acessar um atributo
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} 
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("N�o pode valor menor ou igual a 0!");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(numero <= 0) {
			System.out.println("N�o pode valor menor ou igual a 0!");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}