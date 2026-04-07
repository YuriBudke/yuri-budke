package ex12metodos;

import java.util.Scanner;

public class MetodosEx12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escreva uma palavra: ");
		String palavra = input.next();

        char resultado = verificarCaractere(palavra);

        System.out.println("Caractere retornado: " + resultado);

        input.close();
    }

    public static char verificarCaractere(String palavra) {
        int tamanho = palavra.length();

        if (tamanho % 2 == 0) {
            return palavra.charAt(0);
        } else {
            return palavra.charAt(1);
        }
    }
}