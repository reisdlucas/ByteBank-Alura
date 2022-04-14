package bytebank.br.com.ByteBank.Banco.Teste;

import java.util.ArrayList;
import java.util.List;

import bytebank.br.com.ByteBank.Banco.Modelo.Conta;
import bytebank.br.com.ByteBank.Banco.Modelo.ContaCorrente;


public class TesteArrayList {
	
	public static void main(String[] args) {
		
		List<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(11, 22);
		lista.add(cc);
		
		Conta cc1 = new ContaCorrente(33, 44);
		lista.add(cc1);
		
		System.out.println("Tamanho: " + lista.size());
		Conta ref = lista.get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta cc2 = new ContaCorrente(55, 66);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(77, 88);
		lista.add(cc3);
		
	
		
		
	}

}
