package oop;

public class Veiculo {
//	atributos de classe
	private int anoDeFabricacao;
	private String modelo;
	private String marca;
	
	// constructor
	Veiculo (int adf, String m, String ma) {
		anoDeFabricacao = adf;
		modelo = m;
		marca = ma;
	}

	public int getAnoDeFabricacao() {
		return anoDeFabricacao;
	}

	public void setAnoDeFabricacao(int anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}
}
