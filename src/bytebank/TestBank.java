package bytebank;

public class TestBank {
	
	public static void main(String[] args) {
		Cliente lucas = new Cliente();
		lucas.setNome("Lucas Reis");
		lucas.setCpf("117.262.907-27");
		lucas.setProfissao("Programador");
		
		Conta contaLucas = new Conta();
		contaLucas.deposita(100);
		
// Atribuicao de referencia:
		
		contaLucas.setTitular(lucas);
		contaLucas.setAgencia(1377);
		contaLucas.setNumero(1001);
		
		System.out.println(lucas.getNome());
		System.out.println(lucas.getCpf());
		System.out.println(lucas.getProfissao());
		
	}
	
}
