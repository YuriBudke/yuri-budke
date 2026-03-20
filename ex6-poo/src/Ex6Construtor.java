
public class Ex6Construtor {

	public static void main(String[] args) {
		
		MercadoConstrutor unidadeDeBlumenau = new MercadoConstrutor("Giassei", 150000, 1.20, 210000, 1.10);
		MercadoConstrutor unidadeDeJoinville = new MercadoConstrutor("Cooper", 130000, 1.30, 190000, 1.20);
		MercadoConstrutor unidadeDeFlorianopolis = new MercadoConstrutor("Koch", 130000, 1.15, 230000, 1.05);
		
		
		MercadoConstrutor listaMercados[] = {
				unidadeDeBlumenau,
				unidadeDeJoinville,
				unidadeDeFlorianopolis
				};
		
		//Quem teve a maior receita vendendo maçãs?
		double maiorReceitaMacas = 0;
		MercadoConstrutor mercadoMaiorReceitaMacas = null;
		
		for(int i = 0 ; i < listaMercados.length; i++) {
			if(listaMercados[i].obterReceitaMacas() > maiorReceitaMacas) {
				maiorReceitaMacas = listaMercados[i].obterReceitaMacas();
				mercadoMaiorReceitaMacas = listaMercados[i];
			}
		}
		
		System.out.println("Maior receita de maçãs: " + mercadoMaiorReceitaMacas);
		
		//Quem teve a menor receita vendendo laranjas?

		
		double menorReceitaLaranjas = listaMercados[0].obterReceitaLaranjas();
		MercadoConstrutor mercadoMenorReceitaLaranjas = null;
		
		for(int i = 0 ; i < listaMercados.length ; i++) {
			if (listaMercados[i].obterReceitaLaranjas() < menorReceitaLaranjas) {
				menorReceitaLaranjas = listaMercados[i].obterReceitaLaranjas();
				mercadoMenorReceitaLaranjas = listaMercados[i];
			}
		}
		
		System.out.println("Menor receita de laranjas: " + mercadoMenorReceitaLaranjas);
		
		
	}

}
