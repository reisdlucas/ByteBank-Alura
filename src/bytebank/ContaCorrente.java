package bytebank;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}
	
	@Override
	public boolean transfere(double valor, Conta destino) {
		double valorATransferir = valor + 0.2;
		return super.transfere(valorATransferir, destino);
	}
	
//	@Override
//	public boolean transfere(double valor, Conta destino) {
//		
//	}
	
}
