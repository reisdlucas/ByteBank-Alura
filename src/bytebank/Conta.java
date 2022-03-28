/// Class tipo Conta:

package bytebank;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
// Referencia para o objeto:
	private Cliente titular;
	
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
