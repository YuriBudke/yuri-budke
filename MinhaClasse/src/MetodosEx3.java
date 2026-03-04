import java.util.Scanner;

public class MetodosEx3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int numero = scanner.nextInt();

		imprimirNumero(numero);
		scanner.close();
	}

	public static void imprimirNumero(int numero) {
		for (int i = numero; i <= numero + 20 ; i++) {
			System.out.println(i);
		}
	}
}
