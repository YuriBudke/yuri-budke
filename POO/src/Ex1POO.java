
public class Ex1POO {

	public static void main(String[] args) {
	
		Ex1Pessoa p1 = new Ex1Pessoa();
		p1.nome = "Yuri";
		p1.sexo = 'M';
		p1.data = "19/09/2006";
		p1.estadoCivil = "Solteiro";
		
		System.out.println("O seu nome é: " + p1.nome);
		
		Ex1Pessoa p2 = new Ex1Pessoa();
		p2.nome = "Kaue";
		p2.sexo = 'M';
		p2.data = "16/03/2010";
		p2.estadoCivil = "Solteiro";
		
		System.out.println("O seu nome é: " + p2.nome);

	}

}
