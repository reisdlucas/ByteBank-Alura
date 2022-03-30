// Objeto do tipo: Conta

package bytebank;

public class CriaConta {
	
	public static void main(String[] args) {
		
		// Conta <- do tipo <- variavel(Referencia):firstaccount = new Conta()	
		
		Conta contaLucas = new Conta(1201, 1998);		
		
		// firstAccount[.] <- Ponto para navegar pelos atributos: Conta
		
		contaLucas.setSaldo(200);		
		
		System.out.println(contaLucas.getSaldo());
	}
	
}
