import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		
		System.out.println("Soma dos produtos ");
		
		double produto1 = 10.5;
		double produto2 = 20.8;
		
		double somaProduto = produto1 + produto2;
		
		System.out.println("\nA soma dos produtos foi de: " + somaProduto);
		
		System.out.println("\nDifereça de altura ");
		
		double altura1 = 1.87;
		double altura2 = 1.76;
		
		double diferencaDeAltura = altura1 - altura2;
		
		System.out.println("\nA diferença de altura é de: " + diferencaDeAltura + " metros");
		
		System.out.println("\nÁrea e perimetro de um retângulo ");
		
		double altura = 2.5;
		double comprimento = 4.7;
		
		double perimetro = (altura + comprimento)*2;
		double area = altura * comprimento;

		System.out.println("\nO perimetro do retângulo é de: " + perimetro + " metros");
		System.out.println("\nA área do retângulo é de: " + area + " metros");
		
		System.out.println("\nNome ");
		
		String nome = "Roméro Franco";
		String sobrenome = "Pereira da Silva";
		
		String nomeCompleto = nome + " " + sobrenome;
		
		System.out.println("Seu nome é: " + nomeCompleto);
		
		
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira sua idade");
		int old = input.nextInt();
		
		System.out.println("Sua idade é: ");
		
		double feet = input.nextDouble();
		char letra = input.next().charAt(0);
		String velho = input.next();
		
		System.out.println("Insira o seu nome ");
		String nme = input.next();
		
		System.out.println("O seu nome é " + nome);

		}

}
