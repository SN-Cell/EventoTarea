package Modelo;

public class Evento {
	
	private String NombreEvento;
	private Integer EdadMinima;
	private Integer EntradasUsadas;
	private Integer EntradasVendidas;
	//private boolean usoEntrada;
	private boolean EstadoEvento;
	
	public Evento ()
	{
		
	}
	
	public Evento(String nombreEvento, Integer edadMinima, Integer entradasUsadas, Integer entradasVendidas, boolean estadoEvento) {
		NombreEvento = nombreEvento;
		EdadMinima = edadMinima;
		EntradasUsadas = entradasUsadas;
		EntradasVendidas = entradasVendidas;
		EstadoEvento = estadoEvento;
	}
	
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
