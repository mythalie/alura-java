
//contrato autenticavel
	//quem assina esse contrato, precisa implementar
		//metodo setSenha
		//metodo autentica

public abstract interface Autenticavel {

	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
	
	
//	private int senha;
//	
//	public void setSenha(int senha) {
//		this.senha = senha;
//	}
//	
//	public boolean autentica(int senha) {
//		if(this.senha == senha) {
//			return true;
//		} else {
//			return false;
//		}
//	}

}
