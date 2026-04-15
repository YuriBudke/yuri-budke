package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex4ArrayList {

	public static void main(String[] args) {
		
		List<Integer> listaNumeros = new ArrayList<>();
		
		listaNumeros.add(1);
		listaNumeros.add(21);
		listaNumeros.add(14);
		listaNumeros.add(30);
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o valor que você quer saber o índice: ");
		int numero = input.nextInt();
		
		int indice = listaNumeros.indexOf(numero);
		
		if(indice != -1) {
			System.out.println("O valor " + numero + " está no índice");
		} else {
			System.out.println("O valor não está na lista");
		}
		
		input.close();
		
	}

}
