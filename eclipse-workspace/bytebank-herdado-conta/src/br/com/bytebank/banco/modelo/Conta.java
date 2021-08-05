package br.com.bytebank.banco.modelo;


/**
 * Classe representa a moldura de uma conta
 * 
 * @author Mythalie Sandretti
 * 
 * 
 */
import java.io.Serializable;

public abstract class Conta extends Object implements Comparable<Conta>, Serializable {
	protected double saldo;  //atributos do objeto conta
	private int agencia;
	private int numero;
	private transient Cliente titular; //transient quer dizer que o cliente não faz parte da serialização
	private static int total; //static é um atributo da classe
	
/**
 * Construtor para inicializar o objeto Conta a partir da agencia e numero.
 * 
 * @param agencia
 * @param numero
 */
	
//	public Conta() { - construtor padrão
//		
//	}
	
	public Conta(int agencia, int numero) { //construtor específico
		Conta.total++;
//		System.out.println("O total de contas é: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
//		System.out.println("Estou criando uma conta " + this.numero);
	}
	
	public void deposita(double valor) { //metodo 
		this.saldo += valor;
	}
	
/**
 * Valor precisa ser maior do que saldo.
 * 
 * @param valor
 * @throws SaldoInsuficienteException
 */
	
	public void saca(double valor) throws SaldoInsuficienteException {
		
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		
		this.saldo -= valor; 
	}
	
//	public boolean saca(double valor) {
//		if(this.saldo >= valor) {
//			this.saldo -= valor;           -Usamos o this dentro de um método para acessar um atributo
//			return true;
//		} else {
//			return false;
//		}
//	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("Não pode valor menor ou igual a 0!");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(numero <= 0) {
			System.out.println("Não pode valor menor ou igual a 0!");
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
	
	@Override
	public boolean equals(Object ref) {
		
		Conta outra = (Conta) ref;
		
		if(this.agencia != outra.agencia) {
			return false;
		}
		
		if(this.numero != outra.numero) {
			return false;
		}
		
		return true;
	}

	@Override
	public int compareTo(Conta outra) {
		return Double.compare(this.saldo, outra.saldo);
	}
	
	@Override
	public String toString() {
		return "Numero: " + this.numero + ", Agencia: " + this.agencia + ", Saldo: " + this.saldo;
	}
}