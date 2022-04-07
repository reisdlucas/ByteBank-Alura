package bytebank.br.com.ByteBank.Banco.Teste;

import bytebank.br.com.ByteBank.Banco.Modelo.*;

public class TesteEx {
	public static void main(String[] args) {

        String nome = "Alura";
        System.out.println("ANTES");

        try {
            System.out.println(nome);
        } catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("CATCH");
        }

        System.out.println("DEPOIS");
    }
}
