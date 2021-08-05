package br.com.bytebank.banco.modelo;

import java.io.Serializable;

//new ContaCorrente() --- não herda o construtor
public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero); //chamando o construtor específico
	}
	
	@Override // Override sobrescreve método da classe MÃE, caso contrário, seria um novo método.
	public void saca(double valor) throws SaldoInsuficienteException{
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}
	
	@Override 
	public void deposita(double valor) {
		super.saldo += valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}

	@Override
	public int compareTo(Conta o) {
		return 0;
	}
	
	@Override
	public String toString() {
		return "ContaCorrente, " + super.toString();
	}

}
