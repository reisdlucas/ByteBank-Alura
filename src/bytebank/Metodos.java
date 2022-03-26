package bytebank;

public class Metodos {
	
	public static void main(String[] args) {
		Conta contaLucas = new Conta();
		contaLucas.deposita(250);	
		System.out.println(contaLucas.saldo);
		contaLucas.saca(25);
		System.out.println(contaLucas.saldo);
		
		Conta contaFabio = new Conta();
		contaFabio.deposita(500);
		if (contaFabio.transfere(25, contaLucas)) {
			System.out.println("Transfer�ncia realizada");
		} else {
			System.out.println("Opera��o negada - Saldo Insuficiente");
		}
		System.out.println(contaLucas.saldo);
	}
}
