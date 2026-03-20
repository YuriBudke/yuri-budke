
public class MercadoConstrutor {
	
	
	String nome;
	int qtdeMacasVend;
	double precoMacas;
	int qtdeLaranjasVend;
	double precoLaranjas;
	
	
	public MercadoConstrutor(String nome, int qtdeMacasVend, double precoMacas, int qtdeLaranjasVend,
			double precoLaranjas) {
		super();
		this.nome = nome;
		this.qtdeMacasVend = qtdeMacasVend;
		this.precoMacas = precoMacas;
		this.qtdeLaranjasVend = qtdeLaranjasVend;
		this.precoLaranjas = precoLaranjas;
	}
	
	public double obterReceitaMacas() {
		return qtdeMacasVend * precoMacas;
	}
	
	public double obterReceitaLaranjas() {
		return qtdeLaranjasVend * precoLaranjas;
	}
	
	public double obterReceitaTotal() {
		return obterReceitaLaranjas() + obterReceitaMacas();
	}

	@Override
	public String toString() {
		return "MercadoConstrutor [nome=" + nome + ", qtdeMacasVend=" + qtdeMacasVend + ", precoMacas=" + precoMacas
				+ ", qtdeLaranjasVend=" + qtdeLaranjasVend + ", precoLaranjas=" + precoLaranjas + "]";
	}
	
}
