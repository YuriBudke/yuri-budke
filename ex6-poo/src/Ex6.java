
public class Ex6 {

	public static void main(String[] args) {

		Mercado unidadeDeBlumenau = new Mercado();
		unidadeDeBlumenau.nome = "Giassi";
		unidadeDeBlumenau.qtdeMacasVend = 150000;
		unidadeDeBlumenau.precoMacas = 1.20;
		unidadeDeBlumenau.qtdeLaranjasVend = 210000;
		unidadeDeBlumenau.precoLaranjas = 1.10;
			
		Mercado unidadeDeJoinville = new Mercado();
		unidadeDeJoinville.nome = "Cooper";
		unidadeDeJoinville.qtdeMacasVend = 130000;
		unidadeDeJoinville.precoMacas = 1.30;
		unidadeDeJoinville.qtdeLaranjasVend = 190000;
		unidadeDeJoinville.precoLaranjas = 1.20;
		
		Mercado unidadeDeFlorianopolis = new Mercado();
		unidadeDeFlorianopolis.nome = "Koch";
		unidadeDeFlorianopolis.qtdeMacasVend = 130000;
		unidadeDeFlorianopolis.precoMacas = 1.15;
		unidadeDeFlorianopolis.qtdeLaranjasVend = 230000;
		unidadeDeFlorianopolis.precoLaranjas = 1.05;
		
		Mercado listaMercados[] = {
				unidadeDeBlumenau,
				unidadeDeJoinville,
				unidadeDeFlorianopolis
				};
		
		//Quem teve a maior receita vendendo maçãs?
		double maiorReceitaMacas = 0;
		Mercado mercadoMaiorReceitaMacas = null;
		
		for(int i = 0 ; i < listaMercados.length; i++) {
			if(listaMercados[i].obterReceitaMacas() > maiorReceitaMacas) {
				maiorReceitaMacas = listaMercados[i].obterReceitaMacas();
				mercadoMaiorReceitaMacas = listaMercados[i];
			}
		}
		
		System.out.println("Maior receita de maçãs: " + mercadoMaiorReceitaMacas.nome);
		
		//Quem teve a menor receita vendendo laranjas?

		
		double menorReceitaLaranjas = listaMercados[0].obterReceitaLaranjas();
		Mercado mercadoMenorReceitaLaranjas = null;
		
		for(int i = 0 ; i < listaMercados.length ; i++) {
			if (listaMercados[i].obterReceitaLaranjas() < menorReceitaLaranjas) {
				menorReceitaLaranjas = listaMercados[i].obterReceitaLaranjas();
				mercadoMenorReceitaLaranjas = listaMercados[i];
			}
		}
		
		System.out.println("Menor receita de laranjas: " + mercadoMenorReceitaLaranjas.nome);
		
		
	}

}
