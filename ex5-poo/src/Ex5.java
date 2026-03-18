
public class Ex5 {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		
		f1.identificacao = "815968";
		f1.nome = "Yuri";
		f1.sobrenome = "Budke";
		f1.salariom = 2000.00;
		
		System.out.println("Seu salário total é: " + f1.salarioAnual());
		System.out.println("Seu nome completo é: " + f1.nomeCompleto());
		System.out.println("Seu salário atual é de: " + f1.salariom);
		f1.modificarSalario(5);
		System.out.println("Seu novo salário é de: " + f1.salariom);
		
		
	}
	

}
