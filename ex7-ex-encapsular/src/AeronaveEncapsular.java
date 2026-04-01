
public class AeronaveEncapsular {

	private String modelo;
	private int passageiros;
	private double velMax;
	private double capComb;
	private double queimaCombMin;
	
	


public AeronaveEncapsular(String modelo, int passageiros, double velMax, double capComb, double queimaCombMin) {
		super();
		setModelo(modelo);
		setPassageiros(passageiros);
		setVelMax(velMax);
		setCapComb (capComb);
		setQueimaCombMin (queimaCombMin);
	}
	
	

	public String getModelo() {
		return modelo;
	}




	public void setModelo(String modelo) {
		if(modelo == null || modelo.isBlank()) {
			System.out.println("Erro, modelo inválido\n");
		} else {
			this.modelo = modelo;
		}
	}




	public int getPassageiros() {
		return passageiros;
	}




	public void setPassageiros(int passageiros) {
		if (passageiros < 0) {
			System.out.println("Erro, número de passageiros inválidos\n");
		} else {
			this.passageiros = passageiros;
		}
	}




	public double getVelMax() {
		return velMax;
	}




	public void setVelMax(double velMax) {
		if(velMax < 0) {
			System.out.println("Erro, velocidade máxima inválida\n");
		} else {
			this.velMax = velMax;
		}
		
	}




	public double getCapComb() {
		return capComb;
	}




	public void setCapComb(double capComb) {
		if(capComb < 0) {
			System.out.println("Erro, capacidade de combustível inválida\n");
		} else {
			this.capComb = capComb;
		}
	}




	public double getQueimaCombMin() {
		return queimaCombMin;
	}




	public void setQueimaCombMin(double queimaCombMin) {
		if (queimaCombMin < 0) {
			System.out.println("Erro, queima de quantidade de combustível por minuto inválida");
		} else {
			this.queimaCombMin = queimaCombMin;
		}

	}




	public double mediaLitrosMinutos() {
		return capComb / queimaCombMin;
	}
	
	public double qualVoaMaisLonge() {
		return mediaLitrosMinutos() * velMax;
	}
	
	
	
//	alt + shift + s = Generate toString()
	@Override
	public String toString() {
		return "Aeronave [modelo=" + modelo + ", passageiros=" + passageiros + ", velMax=" + velMax + ", capComb="
				+ capComb + ", queimaCombMin=" + queimaCombMin + "]";
	}
	
	
}
