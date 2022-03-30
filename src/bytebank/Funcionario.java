package bytebank;
// Base Class - Class Mae
public class Funcionario {
	
	private String nome;
	private String cpf;
	// protected = publico somente para os filhos
	protected double salario;	
	private int cargo = 0; // 0 - Funcionario, 1 - Gerente, 2 - Diretor
	
	//public Funcionario(int cargo) {
	//	this.cargo = cargo;
	//}
		
	public int getCargo() {
		return cargo;		
	}

	public void setCargo(int cargo) {
		this.cargo = cargo;		
	}

	public double getBonificacao() {
		
		if (this.cargo == 0) {
			return this.salario * 0.1;
		} else if (this.cargo == 1) {
			return this.salario + 1000.0;
		} else {
			return this.salario + 2500.0;			
		}		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
