import java.util.Scanner;

public class exercicio_12_02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Insira seu nome: ");
		String nome = input.next();
		System.out.println("Insira sua idade: ");
		int idade = input.nextInt();
		System.out.println("Seu nome é: " + nome + " e você tem " + idade + " anos.");
		
		System.out.println("\n--------------\n");
		
		System.out.println("Compras de mercado:\n");
		System.out.println("Informe o valor do primeiro produto comprado: ");
		double prod1 = input.nextDouble();
		System.out.println("Informe o valor do segundo produto comprado: ");
		double prod2 = input.nextDouble();
		double prodf = prod1 + prod2;
		System.out.println("Você deverá pagar: R$" + prodf);

		System.out.println("\n--------------\n");
		
		System.out.println("Informe a altura de duas pessoas em metro: ");
		System.out.println("Pessoa 1: ");
		double alt1 = input.nextDouble();
		System.out.println("Pessoa 2: ");
		double alt2 = input.nextDouble();
		double difalt = alt1 - alt2;
		System.out.println("A diferença de altura das duas pessoas é de: " + difalt + " metros");
		
		
		System.out.println("\n--------------\n");

		System.out.println("Informe a largura e altura de um retângulo:\n");
		System.out.println("Largura: ");
		double largura = input.nextDouble();
		System.out.println("Altura: ");
		double altura = input.nextDouble();
		double area = altura * largura;
		double perimetro = (altura + largura) * 2;
		System.out.println("O perímetro do Retângulo é de " + perimetro + " e a Área é de " + area);
		
		System.out.println("\n--------------\n");

		System.out.println("Informe o seu nome:");
		String nome1 = input.next();
		System.out.println("Informe o seu sobrenome: ");
		String sobrenome = input.next();
		String nomecomp = nome1 + " " + sobrenome;
		System.out.println("Seu nome completo é: " + nomecomp);
		
		
		
		
	}

}
