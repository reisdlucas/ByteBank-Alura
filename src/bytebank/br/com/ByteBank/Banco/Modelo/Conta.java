package bytebank.br.com.ByteBank.Banco.Modelo;

public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
// Referencia para o objeto:	
	private Cliente titular;
//	private static int total;
	
	
// Contrutores:
	
	public Conta(int agencia, int numero) {
//		total++;
//		System.out.println("O total de contas e " + total);
//		this.agencia = agencia;
//		this.numero = numero;
//		System.out.println("Criada a conta " + this.numero);
	}	
	
// Metodos:
	
	// nomeDoMetodo([tipoDeVariavel] + variavel)
	
	// Void = return vazio 
	
// Metodo Deposita:
	
	public void  deposita(double valor) {
		this.saldo += valor;
	}
	
// Metodo Saca:
	
	public boolean saca(double valor) {
		if (this.saldo>= valor) {
			this.saldo -=valor;
			return true;
		} else {
			return false;
		}
	}
	
//Metodo Transfere:
	
	// Se separa com virgula os argumentos de um metodo*
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);	
			return true;
		} else {
			return false;
		}		
		
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	
	
}
