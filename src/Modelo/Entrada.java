package Modelo;

public class Entrada {
	private int precio;
	private String asiento;
	private Cliente cliente;
	private Vendedor vendedor;
	
	public Entrada() {
		
	}
	public Entrada(int precio, String asiento, Cliente cliente, Vendedor vendedor) {
		//super();
		this.precio = precio;
		this.asiento = asiento;
		this.cliente = cliente;
		this.vendedor = vendedor;
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
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	@Override
	public String toString() {
		return "Entrada [precio=" + precio + ", asiento=" + asiento + ", cliente=" + cliente + ", vendedor=" + vendedor
				+ "]";
	}
	
	

	}
