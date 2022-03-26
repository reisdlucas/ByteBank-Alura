package bytebank;

public class TestBank {
	
	public static void main(String[] args) {
		Cliente lucas = new Cliente();
		lucas.nome = "Lucas Reis";
		lucas.cpf = "117.262.907-27";
		lucas.profissao = "Programador";
		
		Conta contaLucas = new Conta();
		contaLucas.deposita(100);
		
// Atribuição de referencia para o atributo Titular:
		
		contaLucas.titular = lucas;
		
	}
	
}
