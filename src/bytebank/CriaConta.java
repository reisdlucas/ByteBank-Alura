// Objeto do tipo: Conta
package bytebank;

public class CriaConta {
	
	public static void main(String[] args) {
		
		// Conta <- do tipo <- variavel(Referencia):firstaccount = new Conta()	
		
		Conta firstAccount = new Conta();
		
		// firstAccount[.] <- Ponto para navegar pelos atributos: Conta
		
		firstAccount.setSaldo(200);		
		
		System.out.println(firstAccount.getSaldo());
	}
	
}
