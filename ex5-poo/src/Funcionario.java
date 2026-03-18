
public class Funcionario {
	
	String identificacao;
	String nome;
	String sobrenome;
	double salariom;
	
	public double salarioAnual() {
		return salariom * 12;
	}
	
	public String nomeCompleto() {
		return nome + " " +  sobrenome;
	}
	
	public void modificarSalario(double percentualAumento) {
		double aumento = salariom * percentualAumento / 100;
		double salarioFinal = salariom + aumento;
		salariom = salarioFinal;
	}

}
