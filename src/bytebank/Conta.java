/// Class tipo Conta:

package bytebank;

public class Conta {
	double saldo;
	int agencia;
	int numero;
// Referência para o objeto:
	Cliente titular;
	
// Métodos:
	
	// nomeDoMetodo([tipoDeVariável] + variável)
	
	// Void = return vazio 
	
// Método Deposita:
	
	public void  deposita(double valor) {
		this.saldo += valor;
	}
	
// Método Saca:
	
	public boolean saca(double valor) {
		if (this.saldo>= valor) {
			this.saldo -=valor;
			return true;
		} else {
			return false;
		}
	}
//Método Transfere:
	
	// Se separa com virgula os argumentos de um método*
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);	
			return true;
		} else {
			return false;
		}
	}
	
}
