package exerciciosrevisao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Informe sua matrícula: ");
		String mat = scanner.next();
		
		System.out.println("Informe seu nome: ");
		String nome = scanner.next();
		
		System.out.println("Informe a quantidade de horas que você trabalhou: ");
		int hr = scanner.nextInt();
		
		System.out.println("Informe o valor que você recebe por hora: ");
		double valor = scanner.nextDouble();
		
		double salmen = (hr * valor) * 28;
		
		System.out.println("\nMatrícula: " + mat + "\nNome: " + nome + "\nSalário: R$ " + df.format(salmen));
	
		scanner.close();

	}

}
