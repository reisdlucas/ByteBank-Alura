/// Class tipo Conta:

package bytebank;

public class Conta {
	double saldo;
	int agencia;
	int numero;
// Referencia para o objeto:
	Cliente titular;
	
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
	
}
