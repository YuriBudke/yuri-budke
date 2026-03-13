
public class Funcionario {
	
	String identificacao;
	String nome;
	String sobrenome;
	double salariom;
	double aumento;
	
	public double salarioAnual() {
		return salariom * 12;
	}
	
	public String nomeCompleto() {
		return nome + " " +  sobrenome;
	}
	public double aumentoSal() {
		return ((salariom * aumento) / 100) + salariom;
	}

}
