package exerciciosrevisao;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o seu peso em quilogramas: ");
		Double massa = scanner.nextDouble();
		
		System.out.println("Informe a sua altura em metros: ");
		Double altura = scanner.nextDouble();
		
		Double imc = massa / (altura * altura);
		
		if (imc < 18.5) {
			System.out.println("Baseado no seu IMC, seu grau de obesidade é: " + imc + " - Magreza.");
		} else if (imc >= 18.5 && imc <= 24.9) {
			System.out.println("Baseado no seu IMC, seu grau de obesidade é: " + imc + " - Saudável.");
		} else if (imc >= 25 && imc <= 29.9) {
			System.out.println("Baseado no seu IMC, seu grau de obesidade é: " + imc + " - Sobrepeso.");
		} else if (imc >= 30 && imc <= 34.9) {
			System.out.println("Baseado no seu IMC, seu grau de obesidade é: " + imc + " - Obesidade Grau I.");
		} else if (imc >= 35 && imc <= 39.9) {
			System.out.println("Baseado no seu IMC, seu grau de obesidade é: " + imc + " - Obesidade Grau II (Severa).");
		} else {
			System.out.println("Baseado no seu IMC, seu grau de obesidade é: " + imc + " - Obesidade Grau II (Morbida).");

		}
		
		scanner.close();
		
	}

}
