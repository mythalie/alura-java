package br.com.bytebank.banco.modelo;

public interface Tributavel {
	
	//não é necessario colocar 'public abstract', pois já é padrão de uma interface.
	double getValorImposto();

}
