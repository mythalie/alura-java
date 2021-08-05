class Conta {
	private double saldo;  //atributos do objeto conta
	double agencia;
	int numero;
	Cliente titular;
	
	public void deposita(double valor) { //metodo 
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor; //Usamos o this dentro de um método para acessar um atributo
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
}