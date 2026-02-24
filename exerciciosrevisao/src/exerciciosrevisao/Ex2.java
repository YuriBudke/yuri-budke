package exerciciosrevisao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Informe o seu nome: ");
		String nome = scanner.next();
		
		System.out.println("Informe o seu salário: ");
		double sal = scanner.nextDouble();
		
		System.out.println("Informe o valor total de vendas efetuadas no mês: ");
		double venda = scanner.nextDouble();
		
		double comissao = (venda * 15) / 100;
		double tsal = sal + comissao;
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("O vendedor: " + nome + " irá receber o total de: R$" + df.format(tsal) + " no final do mês.");
		
		scanner.close();


	}

}
