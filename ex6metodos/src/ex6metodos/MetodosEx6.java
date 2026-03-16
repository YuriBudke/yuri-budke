package ex6metodos;

import java.util.Scanner;

public class MetodosEx6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o seu primeiro nome: ");
		String nome = input.next();
		
		System.out.println("Informe o seu sobrenome: ");
		String sobrenome = input.next();
		
		System.out.println("Informe o sobrenome de solteira da sua mãe: ");
		String sobrenomeMae = input.next();
		
		System.out.println("Informe o nome da cidade em que você nasceu: ");
		String cidade = input.next();
		
		String nomeStarWars = generateStarWarsName(nome, sobrenome, sobrenomeMae, cidade);
		
		System.out.println("Seu nome completo Star Wars é: " + nomeStarWars);
	}
	
	public static String generateStarWarsName(String nome , String sobrenome , String sobrenomeMae , String cidade) {
		
		String primeiroNomeSW = sobrenome.substring(0 , 3) + nome.substring(0 , 2);
		
		String SobrenomeSW = sobrenomeMae.substring(0 , 2) + cidade.substring(0 , 3);
		
		return primeiroNomeSW + " " + SobrenomeSW;
		
	}

}
