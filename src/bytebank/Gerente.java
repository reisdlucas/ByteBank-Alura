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
	
	public double getBonifica��o() {
		return super.salario + 1500; // super = atributo da base class
	}
	
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
}
