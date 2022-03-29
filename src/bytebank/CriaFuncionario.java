package bytebank;

public class CriaFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario lucas = new Funcionario();
		lucas.setCargo(1);
		lucas.setNome("lucas Reis");
		lucas.setCpf("11726290727");
		lucas.setSalario(1900.0);
		
		System.out.println(lucas.getNome());
		System.out.println(lucas.getCpf());
		System.out.println(lucas.getSalario());
		System.out.println(lucas.getBonificacao());		
	}

}
