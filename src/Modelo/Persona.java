package Modelo;

import java.util.Date;

public class Persona {
	protected String rut;
	protected String nombre;
	protected String fechaNacimiento;
	
	
	public Persona(String rut, String nombre,String fechaNacimiento) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [rut=" + rut + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	
	
	
	
	
}


