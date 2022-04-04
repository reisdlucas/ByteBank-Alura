package bytebank;


public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;	
	private int cargo = 0; 	
			
	public abstract double getBonificacao();
	
//Nome:	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

//CPF:	
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

//Salario:
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

//Cargo:	
	
	public int getCargo() {
		return cargo;
	}

	public void setCargo(int cargo) {
		this.cargo = cargo;
	}
}
