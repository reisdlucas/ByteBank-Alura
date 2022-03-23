package bytebank;

public class Sacar {
	
	public static void main(String[] args) {
		Conta contaLucas = new Conta();
		contaLucas.deposita(250);	
		System.out.println(contaLucas.saldo);
	}
}
