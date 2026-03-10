import java.util.Scanner;

public class MetodosEx9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o número: ");
		int numero = input.nextInt();
		
		System.out.println(determinarParOuImpar(numero));

	}

	public static boolean determinarParOuImpar(int num) {
		return num % 2 == 0;
	}
}
