package Modelo;

public class Vendedor extends Persona {

	int EntradasVendidas; 
	
	public Vendedor(String rut, String nombre, String fechaNacimiento, int EntradasVendidas) {
		super(rut,nombre,fechaNacimiento);
		this.EntradasVendidas = EntradasVendidas;
	}

	public int getEntradasVendidas() {
		return EntradasVendidas;
	}

	public void setEntradasVendidas(int entradasVendidas) {
		EntradasVendidas = entradasVendidas;
	}

	@Override
	public String toString() {
		return "Vendedor [EntradasVendidas=" + EntradasVendidas + "]";
	}
	
}
