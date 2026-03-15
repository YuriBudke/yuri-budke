package ex5metodos;

import java.util.Scanner;

public class MetodosEx5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira um número inteiro base: ");
		int base = input.nextInt();
		
		System.out.println("Insira outro número: ");
		int num1 = input.nextInt();
		
		System.out.println("Insira outro número: ");
		int num2 = input.nextInt();
		
		int resultado = determinaMaisPerto(base, num1, num2);
		
		System.out.println("O número mais perto da base é: " + resultado);
		
	}
	
	public static int determinaMaisPerto(int base, int num1, int num2) {
		
		int distancia1 = Math.abs(base-num1);
		int distancia2 = Math.abs(base-num2);
		
		if(distancia1<distancia2) {
			return num1;
		} else {
			return num2;
		}
	}
	
}
