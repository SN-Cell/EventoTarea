package Modelo;

public class EntradaVip extends Entrada {
	private boolean regalo;
	
	public EntradaVip(int precio, String asiento, boolean regalo) {
		this.regalo = regalo;
}

	public boolean isRegalo() {
		return regalo;
	}

	public void setRegalo(boolean regalo) {
		this.regalo = regalo;
	}
	
}
