package bytebank;

public class TryCatch {

	public static void main(String[] args) {

		System.out.println("Ini da main");

		try {

			metodo1();

		} catch (ArithmeticException | NullPointerException ex) {

			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			ex.printStackTrace();
		} 
		
		System.out.println("Fim da main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo 1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Ini do metodo 2");

// throw new ArithmeticException ("deu errado")
		
		ArithmeticException ex = new ArithmeticException("deu errado");
		throw ex;
//		for (int i = 1; i <= 5; i++) {
//			System.out.println(i);
//			int a = i / 0;
//		}
	}
}
