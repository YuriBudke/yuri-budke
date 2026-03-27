
public class Ex8 {

	public static void main(String[] args) {

		ImpostoDeRenda p1 = new ImpostoDeRenda("Romero" , "011.029.008-17" , "SC" , 27600.25);
		ImpostoDeRenda p2 = new ImpostoDeRenda("Kaue" , "001.100.001-50" , "RS" , 23550.20);
		ImpostoDeRenda p3 = new ImpostoDeRenda("Yuri" , "876.331.006-19" , "SC" , 8500.57);
		ImpostoDeRenda p4 = new ImpostoDeRenda("Evandro" , "001.001.001.01" , "PR" , 255000.72);
		ImpostoDeRenda p5 = new ImpostoDeRenda("Nadir" , "100.100.100.10" , "RS" , 210564.73);	
		
		ImpostoDeRenda listaImpostoRenda[] = { p1 , p2 , p3 , p4 , p5};
		
		double maiorImposto = Integer.MIN_VALUE;
		ImpostoDeRenda maisPagaImposto = null;
		
		for (int i = 0 ; i < listaImpostoRenda.length ; i++) {
			if (listaImpostoRenda[i].impostoPagar() > maiorImposto) {
				maiorImposto = listaImpostoRenda[i].impostoPagar();
				maisPagaImposto = listaImpostoRenda[i];
			}			
		}
		
		System.out.println("Quem mais paga imposto: " + maisPagaImposto);

		double totalImposto = 0;
		
		for (int i = 0 ; i < listaImpostoRenda.length ; i++) {
			totalImposto = totalImposto + listaImpostoRenda[i].impostoPagar();
		}
		
		System.out.println("\nTotal de imposto pago entre os 5 contribuintes: R$ " + totalImposto);
			
	}

}
