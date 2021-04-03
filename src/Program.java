
public class Program {
	public static void main(String args[]) {
		Carro kart = new Carro(5,0);
		Carro kart2 = new Carro(20,0,"Honda");
		
		kart.acelerar();
		kart.acelerar();
		kart.acelerar();
		System.out.println("Velocidade do kart 1 = " + kart.getVelocidade());
		kart.frear();
		System.out.println("Velocidade do kart 1 = " + kart.getVelocidade());
		
		System.out.println("///////////////+++++++//////////////////");
		
		kart2.acelerar();
		kart2.acelerar();
		kart2.acelerar();
		System.out.println("Velocidade do kart 2 = " + kart2.getVelocidade());
		kart2.reduzir();
		System.out.println("Velocidade do kart 2 = " + kart2.getVelocidade());
	}
}
