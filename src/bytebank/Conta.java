// Class tipo Conta:

package bytebank;

public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
// Métodos:
	
	// nomeDoMetodo([tipoDeVariável] + variável)
	
	// Void = return vazio 
	
	public void  deposita(double valor) {
		this.saldo += valor;
	}	
}
