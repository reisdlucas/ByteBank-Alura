package bytebank.br.com.ByteBank.Banco.Teste;

import bytebank.br.com.ByteBank.Banco.Modelo.*;

public class TestaContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(100);
		
		cc.transfere(50, cp);
		
		System.out.println("Saldo CC: " + cc.getSaldo());
		System.out.println("Saldo CP: " + cp.getSaldo());
		
		
		
	}
	
}
