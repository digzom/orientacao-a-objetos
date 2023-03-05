package oop;

public class Carro extends Veiculo {
	private int cilindradas;
	private boolean airbag;
	
	public String toString() {
		return "Carro fabricado em " + getAnoDeFabricacao() + " com " + cilindradas + " cilindradas!";
	}
	
	Carro (int ano, String modelo, String marca, int cilindradas) {
		super (ano, modelo, marca);
		
		this.cilindradas = cilindradas;
	}
	
	public static void main (String args[]) {
		 Carro fordBigode = new Carro(1910, "bigode", "Ford", 2900);
		 
		 System.out.println("O veículo criado foi " + fordBigode);
	}
}
