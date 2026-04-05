package ex11metodos;

public class Ex11Metodos {

	public static void main(String[] args) {

		int[] vetor = { 10, 5, 8, 20, 3 };

		int maior = encontrarMaior(vetor);
		int menor = encontrarMenor(vetor);
		double media = calcularMedia(vetor);

		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		System.out.println("Média: " + media);
	}

	public static int encontrarMaior(int[] vetor) {
		int maior = vetor[0];

		for (int i = 1; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
			}
		}

		return maior;
	}

	public static int encontrarMenor(int[] vetor) {
		int menor = vetor[0];

		for (int i = 1; i < vetor.length; i++) {
			if (vetor[i] < menor) {
				menor = vetor[i];
			}
		}

		return menor;
	}

	public static double calcularMedia(int[] vetor) {
		int soma = 0;

		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}

		return (double) soma / vetor.length;
	}
}
