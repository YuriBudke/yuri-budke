import java.util.Scanner;

public class MetodosEx1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe um número de 1 a 4");
		System.out.println("1 - Verão\n2 - Outono\n3 - Inverno\n4 - Primavera\nR: ");
		int num = scanner.nextInt();
		
		switch(num) {
		case 1:
			imprimirVerao();
			break;
		case 2:
			imprimirOutono();
			break;
		case 3:
			imprimirInverno();
			break;
		case 4:
			imprimirPrimavera();
			break;
		default:
			imprimirIncorreto();
		}
		
	}
	
	public static void imprimirVerao() {
		
		System.out.println("Verão");
		System.out.println("Temperaturas mais altas");
		System.out.println("Dias mais longos");
		System.out.println("Mais chuvas fortes (em várias regiões do Brasil)");
		System.out.println("É comum as pessoas irem à praia ou piscina");
		
	}
	public static void imprimirOutono() {
		
		System.out.println("Outono");
		System.out.println("Temperatura começa a diminuir");
		System.out.println("Folhas das árvores caem");
		System.out.println("Clima mais seco em algumas regiões");
		System.out.println("Dias começam a ficar mais curtos");
	}
	
	public static void imprimirInverno() {
		System.out.println("Inverno");
		System.out.println("Estação mais fria do ano");
		System.out.println("Dias mais curtos");
		System.out.println("No sul do Brasil pode ocorrer geada e até neve");
		System.out.println("Clima geralmente mais seco");
	}
	
	public static void imprimirPrimavera() {
		System.out.println("Primavera");
		System.out.println("Clima mais ameno (nem muito quente, nem muito frio)");
		System.out.println("Flores começam a nascer");
		System.out.println("Árvores ficam mais verdes");
		System.out.println("Dias começam a ficar mais longos");
	}
	
	public static void imprimirIncorreto() {
		System.out.println("Valor informado não identificado");
	}

}
