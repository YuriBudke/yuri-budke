
public class Aeronave {

	String modelo;
	int passageiros;
	double velMax;
	double capComb;
	double queimaCombMin;
	
//	alt + shift + s = Generate Construct using Fields
	public Aeronave(String modelo, int passageiros, double velMax, double capComb, double queimaCombMin) {
		super();
		this.modelo = modelo;
		this.passageiros = passageiros;
		this.velMax = velMax;
		this.capComb = capComb;
		this.queimaCombMin = queimaCombMin;
	}

//	alt + shift + s = Generate toString()
	@Override
	public String toString() {
		return "Aeronave [modelo=" + modelo + ", passageiros=" + passageiros + ", velMax=" + velMax + ", capComb="
				+ capComb + ", queimaCombMin=" + queimaCombMin + "]";
	}
	

	public double mediaLitrosMinutos() {
		return capComb / queimaCombMin;
	}
	
	public double qualVoaMaisLonge() {
		return mediaLitrosMinutos() * velMax;
	}
	
}