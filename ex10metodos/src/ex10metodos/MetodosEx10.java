package ex10metodos;

import java.util.Scanner;

public class MetodosEx10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Infome um número inteiro para limite máximo: ");
		int max = input.nextInt();
		
		System.out.println("Informe um número inteiro para limite mínimo: ");
		int min = input.nextInt();
		
		System.out.println("Informe um número inteiro: ");
		int numero = input.nextInt();
		
		System.out.println(limiteImposto(max, min, numero));

	}
	
	public static String limiteImposto(int max , int min , int numero) {
		if(numero <= max && numero >= min) {
			return numero + " está nos limites impostos";
		} else {
			return numero + " não está nos limites impostos";
		}
	}

}
