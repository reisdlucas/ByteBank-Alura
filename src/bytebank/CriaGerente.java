package bytebank;

public class CriaGerente {
	
	public static void main(String[] args) {
		
		Gerente gerente1 = new Gerente();
		gerente1.setNome("Lucas Reis");
		gerente1.setCpf("11726290727");
		gerente1.setSalario(5000);
		gerente1.setSenha(1201);
		
		System.out.println(gerente1.getNome());
		System.out.println(gerente1.getCpf());
		System.out.println(gerente1.getSalario());
		
		boolean validou = gerente1.valida(1201);
		System.out.println(validou);		
		
		System.out.println(gerente1.getBonificacao());
	}

}
