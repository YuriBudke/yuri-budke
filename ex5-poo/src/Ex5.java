
public class Ex5 {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		
		
		f1.nome = "Yuri";
		f1.sobrenome = "Budke";
		f1.salariom = 2000.00;
		f1.aumento = 10;
		
		System.out.println("Seu salário total é: " + f1.salarioAnual());
		System.out.println("Seu nome completo é: " + f1.nomeCompleto());
		System.out.println("Seu salário com o aumento será de: " + f1.aumentoSal());
		
		
		
	}
	

}
