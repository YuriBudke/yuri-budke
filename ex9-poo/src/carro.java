
public class carro {
	
	private int velCarro;

	public carro(int velCarro) {
		setVelCarro (velCarro);
	}
	
	//Acelerar
	public void acelerar(int aumento) {
		if(aumento < 0 || aumento >=20) {
			throw new IllegalArgumentException("Aceleração Inválida");
		}
		this.velCarro = this.velCarro + aumento;
	}
	
	//Reduzir
	
	public void reduzir(int reducao) {
		if(reducao <0 || reducao >=30) {
			throw new IllegalArgumentException("Redução Inválida");
		}
		setVelCarro(velCarro - reducao);
	}

	public int getVelCarro() {
		return velCarro;
	}	

	public void setVelCarro(int velCarro) {
		if(velCarro < 0) {
			throw new IllegalArgumentException("Preço Inválido");
		}
		this.velCarro = velCarro;
	}

	@Override
	public String toString() {
		return "carro [velCarro=" + velCarro + "]";
	}
	
	
	
	
}
