package ex7metodos;

import java.util.Scanner;

public class MetodosEx7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe um número de 1 a 4: ");
		int numero = input.nextInt();
		
		System.out.println(verificaEstacao(numero));
	}
	
	public static String verificaEstacao(int numero) {
		
		if(numero == 1) {
			return verao();
		} else if(numero == 2) {
			return outono();
		} else if(numero == 3) {
			return inverno();
		} else if(numero == 4) {
			return primavera();
		} else {
			return invalido();
		}
	}
	
	public static String verao() {
		return "É verão\nE o tempo está quente.";
	}
	
	public static String outono() {
		return "É outono\nE o clima está ameno.";
	}
	
	public static String inverno() {
		return "É inverno\nE está frio.";
	}

	public static String primavera() {
		return "É primavera\nE as flores estão surgindo.";
	}
	
	public static String invalido() {
		return "Número inválido.";
	}
}
