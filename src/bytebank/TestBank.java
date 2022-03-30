package bytebank;

public class TestBank {
	
	public static void main(String[] args) {
		Cliente lucas = new Cliente();
		lucas.setNome("Lucas Reis");
		lucas.setCpf("117.262.907-27");
		lucas.setProfissao("Programador");
		
		Conta contaLucas = new Conta(1377, 1001);
		contaLucas.deposita(100);
		
// Atribuicao de referencia:
		
		contaLucas.setTitular(lucas);
	
		
		System.out.println(lucas.getNome());
		System.out.println(lucas.getCpf());
		System.out.println(lucas.getProfissao());
		
		Conta contaFabio = new Conta(2401, 9001);
		System.out.println(contaFabio.getAgencia());
		System.out.println(contaFabio.getNumero());
		
		Conta contaCilene = new Conta(6008, 8001);
		System.out.println(contaCilene.getAgencia());
		System.out.println(contaCilene.getNumero());
	}
	
}
