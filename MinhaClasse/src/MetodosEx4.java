
public class MetodosEx4 {

	public static void main(String[] args) {
		
		int vetor[] = {4 , 2 , 12 , 8 , 10};
		
		maiorElemento(vetor);
		menorElemento(vetor);
		obterMedia(vetor);
		
	}
	
	public static void maiorElemento(int[] vetor) {
		
		int maior = Integer.MIN_VALUE;
		
		for(int i = 0 ; i < vetor.length ; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
			}
		}
		System.out.println("Maior valor: " + maior);
		
	}
	
	public static void menorElemento(int vetor[]) {
		
		int menor = Integer.MAX_VALUE;
		
		for(int i = 0 ; i < vetor.length ; i++) {
			
			if (vetor[i] < menor) {
				menor = vetor[i];
			}
		}
		
		System.out.println("Menor valor: " + menor);
	}
	
	public static void obterMedia(int vetor[]) {
		
		double soma = 0;
		
		for (int i = 0 ; i < vetor.length ; i++) {
			soma += vetor[i];
		}
		double media = soma / vetor.length;
		
		System.out.println("Média dos valores: " + media);
	}
	
	

}
