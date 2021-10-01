package Modelo;

public class Evento {
	
	private Integer EdadMinima;
	private Integer EntradasUsadas;
	private Integer EntradasVendidas;
	//private boolean usoEntrada;
	private String NombreEvento;
	private boolean EstadoEvento;
	
	
	
	public Integer getEdadMinima() {
		return EdadMinima;
	}
	public void setEdadMinima(Integer edadMinima) {
		EdadMinima = edadMinima;
	}
	public Integer getEntradasUsadas() {
		return EntradasUsadas;
	}
	public void setEntradasUsadas(Integer entradasUsadas) {
		EntradasUsadas = entradasUsadas;
	}
	public Integer getEntradasVendidas() {
		return EntradasVendidas;
	}
	public void setEntradasVendidas(Integer entradasVendidas) {
		EntradasVendidas = entradasVendidas;
	}
	public String getNombreEvento() {
		return NombreEvento;
	}
	public void setNombreEvento(String nombreEvento) {
		NombreEvento = nombreEvento;
	}
	public boolean isEstadoEvento() {
		return EstadoEvento;
	}
	public void setEstadoEvento(boolean estadoEvento) {
		EstadoEvento = estadoEvento;
	}
	@Override
	public String toString() {
		return "Evento [EdadMinima=" + EdadMinima + ", EntradasUsadas=" + EntradasUsadas + ", EntradasVendidas="
				+ EntradasVendidas + ", NombreEvento=" + NombreEvento + ", EstadoEvento=" + EstadoEvento + "]";
	}
	
	
	
	
	
	
	

}
