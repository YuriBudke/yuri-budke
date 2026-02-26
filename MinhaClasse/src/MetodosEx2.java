import java.util.Scanner;

public class MetodosEx2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escreva o nome de um dos seus amigos para saber mais sobre ele");
		System.out.println("Roméro, Eduardo, Pedro, João ou Kevin(Escreva exatamente como informado)");
		System.out.println("R: ");
		String nome = scanner.next();
		
		switch(nome) {
		
		case "Roméro" -> imprimirRomero();
		
		case "Eduardo" -> imprimirEduardo();
		
		case "Pedro" -> imprimirPedro();
		
		case "João" -> imprimirJoao();
		
		case "Kevin" -> imprimirKevin();
		
		default -> System.out.println("Nome inválido.");
		}
	}
	
	public static void imprimirRomero() {
		
		System.out.println("O nome dele é: Roméro");
		System.out.println("Ele tem 17 anos");
		System.out.println("Ele é estudante de desenvolvimento de sistemas");
	}
	public static void imprimirEduardo() {
		
		System.out.println("O nome dele é: Eduardo");
		System.out.println("Ele tem 21 anos");
		System.out.println("Ele é estudante de desenvolvimento de sistemas");
	}
	public static void imprimirPedro() {
		
		System.out.println("O nome dele é: Pedro");
		System.out.println("Ele tem 19 anos");
		System.out.println("Ele é estudante de desenvolvimento de sistemas");
	}
	public static void imprimirJoao() {
		
		System.out.println("O nome dele é: João");
		System.out.println("Ele tem 20 anos");
		System.out.println("Ele é estudante de desenvolvimento de sistemas");
	}
	public static void imprimirKevin() {
		
		System.out.println("O nome dele é: Kevin");
		System.out.println("Ele tem 19 anos");
		System.out.println("Ele é estudante de desenvolvimento de sistemas");
	}
	

}
