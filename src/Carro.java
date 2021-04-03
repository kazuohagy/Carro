
public class Carro {
	private String marca;
	private int potencia;
	private int velocidade;
	public Carro() {
		
	}
	public Carro(int potencia, int velocidade) {
		this.potencia = potencia;
		this.velocidade = velocidade;
		
	}
	public Carro(int potencia, int velocidade, String marca) {
		this.velocidade = velocidade;
		this.potencia = potencia;
		this.marca = marca;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void acelerar() {
		velocidade = velocidade + 10;
	}
	public void frear() {
		reduzir();
		parar();
	}
	public void reduzir() {
		while(velocidade > 10) {
			velocidade = velocidade -10;
		}
	}
	public void parar() {
		velocidade = 0;
	}
	public boolean ehIgual(Carro p) {
		boolean valor_retorno = false;
		if(velocidade == p.getVelocidade()) {
			return valor_retorno = true;
		}
		return valor_retorno;		
		
	}
}
