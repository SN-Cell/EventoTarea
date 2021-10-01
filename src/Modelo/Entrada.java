package Modelo;

public class Entrada {
	private int precio;
	private String asiento;
	
	public Entrada() {
		
	}
	public Entrada(int precio, String asiento) {
		super();
		this.precio = precio;
		this.asiento = asiento;
	}
	
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getAsiento() {
		return asiento;
	}
	public void setAsiento(String asiento) {
		this.asiento = asiento;
	}
	
	

	}
