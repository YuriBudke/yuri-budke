
public class Ex7 {

	public static void main(String[] args) {
		
		
		Aeronave aeronave1 = new Aeronave("Boeing 737-800", 185 , 840.0 , 26500.0 , 45.5);
		Aeronave aeronave2 = new Aeronave("Aibus A320" , 170 , 870.0 , 24600.0 , 38.5);
		Aeronave aeronave3 = new Aeronave("Embraer E195" , 130 , 890.0 , 13000.5 , 30.6);
		Aeronave aeronave4 = new Aeronave("Boeing 777-300ER" , 	390 , 945.0 , 181000.7 , 5000.5);
		
		Aeronave listaAeronave[] = {
			aeronave1,
			aeronave2,
			aeronave3,
			aeronave4
		};
		
//		a) Qual aeronave leva o maior número de passageiros?
		
		int maiorNumPassageiros = 0;
		Aeronave aeronaveMaiorNumPassageiros = null;
		
		for(int i = 0 ; i < listaAeronave.length ; i++) {
			if(listaAeronave[i].passageiros > maiorNumPassageiros) {
				maiorNumPassageiros = listaAeronave[i].passageiros;
				aeronaveMaiorNumPassageiros = listaAeronave[i];
			}
		}
		
		System.out.println("Aeronave que leva o maior número de passageiros: " + aeronaveMaiorNumPassageiros);
		
//		b) Qual das aeronaves pode ficar mais tempo no ar?
		
		double maisTempoAr = 0.0;
		Aeronave aeronaveMaisTempoAr = null;
		
		for (int i = 0 ; i < listaAeronave.length ; i++) {
			if(listaAeronave[i].mediaLitrosMinutos() > maisTempoAr) {
				maisTempoAr = listaAeronave[i].mediaLitrosMinutos();
				aeronaveMaisTempoAr = listaAeronave[i];
			}
		}

		System.out.println("\nAeronave que pode ficar mais tempo no ar: " + aeronaveMaisTempoAr);
		
//		c) Considerando que os aviões estão em velocidade máxima, qual deles consegue voar mais longe?
		
		double voarMaisLonge = 0.0;
		Aeronave aeronaveVoarMaisLonge = null;
		
		for (int i = 0 ; i <listaAeronave.length ; i++) {
			if(listaAeronave[i].qualVoaMaisLonge() > voarMaisLonge) {
				voarMaisLonge = listaAeronave[i].qualVoaMaisLonge();
				aeronaveVoarMaisLonge = listaAeronave[i];
			}
			
		}
	
		System.out.println("\nAeronave que voa mais longe com a velocidade máxima: " + aeronaveVoarMaisLonge);
		
	}

}
