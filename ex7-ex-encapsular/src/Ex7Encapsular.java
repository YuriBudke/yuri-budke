
public class Ex7Encapsular {

	public static void main(String[] args) {
		
		
		AeronaveEncapsular aeronave1 = new AeronaveEncapsular("Boeing 737-800", 185 , 840.0 , 26500.0 , 45.5);
		AeronaveEncapsular aeronave2 = new AeronaveEncapsular("Aibus A320" , 170 , 870.0 , 24600.0 , 38.5);
		AeronaveEncapsular aeronave3 = new AeronaveEncapsular("Embraer E195" , 130 , 890.0 , 13000.5 , 30.6);
		AeronaveEncapsular aeronave4 = new AeronaveEncapsular("Boeing 777-300ER" , 	390 , 945.0 , 181000.7 , 5000.5);
		
		AeronaveEncapsular listaAeronave[] = {
			aeronave1,
			aeronave2,
			aeronave3,
			aeronave4
		};
		
		
//		a) Qual aeronave leva o maior número de passageiros?
		
		int maiorNumPassageiros = 0;
		AeronaveEncapsular aeronaveMaiorNumPassageiros = null;
		
		for(int i = 0 ; i < listaAeronave.length ; i++) {
			if(listaAeronave[i].getPassageiros() > maiorNumPassageiros) {
				maiorNumPassageiros = listaAeronave[i].getPassageiros();
				aeronaveMaiorNumPassageiros = listaAeronave[i];
			}
		}
		
		System.out.println("Aeronave que leva o maior número de passageiros: " + aeronaveMaiorNumPassageiros);
		
//		b) Qual das aeronaves pode ficar mais tempo no ar?
		
		double maisTempoAr = 0.0;
		AeronaveEncapsular aeronaveMaisTempoAr = null;
		
		for (int i = 0 ; i < listaAeronave.length ; i++) {
			if(listaAeronave[i].mediaLitrosMinutos() > maisTempoAr) {
				maisTempoAr = listaAeronave[i].mediaLitrosMinutos();
				aeronaveMaisTempoAr = listaAeronave[i];
			}
		}

		System.out.println("\nAeronave que pode ficar mais tempo no ar: " + aeronaveMaisTempoAr);
		
//		c) Considerando que os aviões estão em velocidade máxima, qual deles consegue voar mais longe?
		
		double voarMaisLonge = 0.0;
		AeronaveEncapsular aeronaveVoarMaisLonge = null;
		
		for (int i = 0 ; i <listaAeronave.length ; i++) {
			if(listaAeronave[i].qualVoaMaisLonge() > voarMaisLonge) {
				voarMaisLonge = listaAeronave[i].qualVoaMaisLonge();
				aeronaveVoarMaisLonge = listaAeronave[i];
			}
			
		}
	
		System.out.println("\nAeronave que voa mais longe com a velocidade máxima: " + aeronaveVoarMaisLonge);
		
	}

}
