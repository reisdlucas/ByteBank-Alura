package bytebank;

public class ControleBonificacao {
	
	private double soma;
	
	
	
	public double getSoma() {
		return soma;
	}

	public void setSoma(double soma) {
		this.soma = soma;
	}	

	public void registra(Gerente g) {
		double boni = g.getBonificacao();
		this.soma += boni;		
	}
	
	public void registra (Funcionario f) {
		double boni = f.getBonificacao();
		this.soma += boni;
	}
	
	public void registra (Seguranca se) {
		double boni = se.getBonificacao();
		this.soma += boni;
	}

}
