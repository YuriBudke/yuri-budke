
public class Mercado {
	String nome;
	int qtdeMacasVend;
	double precoMacas;
	int qtdeLaranjasVend;
	double precoLaranjas;
	
	public double obterReceitaMacas() {
		return qtdeMacasVend * precoMacas;
	}
	public double obterReceitaLaranjas() {
		return qtdeLaranjasVend * precoLaranjas;
	}
	
	public double obterReceitaTotal() {
		return obterReceitaLaranjas() + obterReceitaMacas();
	}
}
