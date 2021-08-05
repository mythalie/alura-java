package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero); 
	}

	@Override
	public int compareTo(Conta o) {
		return 0;
	}
	
	@Override
	public String toString() {
		return "ContaPoupanca, " + super.toString();
	}

}
