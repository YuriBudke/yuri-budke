package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex3ArrayList {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		List<Double> listaNum = new ArrayList<>();
		
		System.out.println("Digite os números decimais (0 para sair)");
		double	numero = scanner.nextDouble();
		
		while(numero != 0) {
			listaNum.add(numero);
			numero = scanner.nextDouble();
		}
		scanner.close();
		
		double maior = Collections.max(listaNum);
		double menor = Collections.min(listaNum);
		double soma = 0;
		
		for(int i = 0 ; i < listaNum.size(); i++) {
			soma += listaNum.get(i);
		}
		
		double media = soma / listaNum.size();
		
		System.out.println("Valor maior: " + maior );
		System.out.println("Valor menor: " + menor);
		System.out.println("Média: " + media);
		
	}

}
