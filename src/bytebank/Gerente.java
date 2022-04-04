package bytebank;

// Gerente herda de Funcionario - Class filha

public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;
	
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o Método de Bonificação do GERENTE");
		return super.getSalario();
	}	

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(1414);
	}
	
	@Override
	public boolean autentica (int senha) {
		return this.autenticador.autentica(1414);
	}
}
