package bytebank;

public class TryCatch {

	public static void main(String[] args) {

		System.out.println("Ini da main");

		try {
			metodo1();
		} catch (Exception ex) {
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			ex.printStackTrace();
		} 
		
		System.out.println("Fim da main");
	}

	private static void metodo1() throws MinhaExcecao {
		System.out.println("Ini do metodo 1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() throws MinhaExcecao {
		System.out.println("Ini do metodo 2");
		throw new MinhaExcecao("deu muito errado");
	}
}
