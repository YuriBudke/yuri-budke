
public class ImpostoDeRenda {

	private String nome;
	private String cpf;
	private String uf;
	private double rendaAnual;
	
	public ImpostoDeRenda(String nome, String cpf, String uf, double rendaAnual) {
		super();
		setNome (nome);
		setCpf (cpf);
		setUf (uf);
		setRendaAnual (rendaAnual);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null || nome.isBlank()) {
			System.out.println("Erro, nome está vazio\n");
		} else {
			this.nome = nome;
		}
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if (cpf == null || cpf.isBlank()) {
			System.out.println("Erro, CPF está vazio\n");
		} else {
			this.cpf = cpf;
		}
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		if (uf == null || uf.isBlank()) {
			System.out.println("Erro, UF está vazio\n");
		} else {
			this.uf = uf;
		}
	}

	public double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(double rendaAnual) {
		if (rendaAnual < 0) {
			System.out.println("Erro, renda anual inválida\n");
		} else {
			this.rendaAnual = rendaAnual;
		}
	}
	
	public double impostoPagar() {
		if (rendaAnual >= 0 && rendaAnual <= 400) {
			return 0;
		} else if (rendaAnual >= 4001 && rendaAnual <= 9000) {
			return rendaAnual * 0.058;
		} else if (rendaAnual >= 9001 && rendaAnual <= 25000) {
			return rendaAnual * 0.15;
		} else if (rendaAnual >= 25001 && rendaAnual <= 35000) {
			return rendaAnual * 0.275;
		} else {
			return rendaAnual * 3.33;
		}
	}

	@Override
	public String toString() {
		return "ImpostoDeRenda [nome=" + nome + ", cpf=" + cpf + ", uf=" + uf + ", rendaAnual=" + rendaAnual + "]";
	}
	
	
	
	
	
}
