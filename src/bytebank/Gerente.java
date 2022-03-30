package bytebank;

// Gerente herda de Funcionario 

public class Gerente extends Funcionario {
	
	private int senha;
	
	public boolean valida(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
//	public double getBonificação() {
//		return this.salario + 1500.0;
//	}
	
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
}
