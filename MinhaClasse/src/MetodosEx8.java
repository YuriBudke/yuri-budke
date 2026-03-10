import java.util.Scanner;

public class MetodosEx8 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota: ");
		double nota1 = scanner.nextDouble();
		
		System.out.println("Informe a segunda nota: ");
		double nota2 = scanner.nextDouble();
		
		System.out.println("Informe a terceira nota: ");
		double nota3 = scanner.nextDouble();

		double media = calcularMedia(nota1, nota2, nota3);
		
		System.out.println("A média é: " + media);
		
	}
	
	public static double calcularMedia(double nota1, double nota2, double nota3) {
		return (nota1 + nota3 + nota3) /3;
		
	}

}
