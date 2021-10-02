package MainPackage;

import java.util.Iterator;
import java.util.Scanner;
import java.lang.invoke.SwitchPoint;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import Modelo.Evento;
import Modelo.Cliente;
import Modelo.Vendedor;


public class MainClass {

	public static void main(String[] args) {
		
		//Declaraciones del evento
		Evento ev[] = new Evento[30];
		
		//Declaraciones del Vendedor
		String rutVendedor = "";
		String nombreVendedor = "";
		String fechaNacimientoVen = "";
		Integer EntradasVendidasVen = 0; 
		Vendedor ven[] = new Vendedor[1];
		
		//Declaraciones del Cliente
		String rutCliente = "";
		String nombreCliente = "";
		String fechaNacimientoCl = "";
		
		Cliente cl[] = new Cliente[1];
		
		//Declaracion Venta de entradas
		String nombreEventoCliente;
		String rutClienteEvento;
		String nombreClienteEvento;
		String rutVendedorVerificacion;
		
		
		
		//Lector
		Scanner sc = new Scanner(System.in);
				
		//menu
		String opcion = "";
		Boolean salir = false;
		Boolean salirEvento = false;
		

		while(salir.equals(false)) 
		
		{
			Modelo.Vistas.menu();
			
			opcion = sc.nextLine();
			
			switch (opcion) {
			
			case "1":
				//Crear Evento
		            ev=CreaEveento(ev);
		            
		            for(int i=0;i<ev.length;i++) {
		                if(ev[i]!=null) {
		                    System.out.println(ev[i].getNombreEvento()+" "+ev[i].getEdadMinima()+" ");
		                }else {
		                    i=ev.length;
		                }    
		            }
				break;
			case "2":
				//Venta Entrada
				
				System.out.println("Ingrese su rut: ");
				rutVendedorVerificacion = sc.nextLine();
				System.out.println("Ingrese nombre evento: ");
				nombreEventoCliente = sc.nextLine();
				System.out.println("Ingrese rut cliente: ");
				rutClienteEvento = sc.nextLine();
			
				
				int Entrada = 0;
				int Venta = 0;
				int Diferencia=0;
				int indice = 0;
				for(int j=0;j<cl.length;j++) {
					if (rutClienteEvento.equals(cl[j].getRut())) {
						Diferencia=CuentaY(cl[j].getFechaNacimiento());
					}
				}
				for (int j=0; j<ven.length; j++) {
					if (rutVendedorVerificacion.equals(ven[j].getRut())) {
						Venta = ven[j].getEntradasVendidas();
						indice = j;
					}	
				}
				
				
				System.out.println(Diferencia);
				
				for (int i=0; i<ev.length; i++) {
					if (nombreEventoCliente.equals(ev[i].getNombreEvento())) {
						if (ev[i].getEdadMinima()<=Diferencia) {
							Entrada = ev[i].getEntradasVendidas()+1;
							ev[i].setEntradasVendidas(Entrada);
							ven[indice].setEntradasVendidas(Venta+1);
							
							
							
						}else {
							System.out.println("No cumple edad para asistir a evento");
						}
						
					}else {
						System.out.println("No existe el evento");
					}
					
				}
				for(int i=0;i<ev.length;i++) {
					System.out.println(ev[i].getNombreEvento()+" "+ev[i].getEntradasVendidas());
				}
				
				Entrada = 0;
				
				
				
				for(int i=0;i<ev.length;i++) {
					System.out.println(ven[i].getNombre()+" "+ven[i].getEntradasVendidas());
				}
				
				
				
				break;
			case "3":
				//Registrar Vendedor
				
				for(int i=0;i<ven.length;i++) {
					System.out.println("Ingresa el Rut del Vendedor");
					rutVendedor = sc.nextLine();
					System.out.println("Ingrese el Nombre del Vendedor");
					nombreVendedor = sc.nextLine();
					System.out.println("Ingrese el Fecha de Nacimiento del Vendedor");
					fechaNacimientoVen = sc.nextLine();
					sc.nextLine();
					ven[i] = new Vendedor(rutVendedor,nombreVendedor,fechaNacimientoVen,EntradasVendidasVen);	
				}
				
				break;
			case "4":
				//Registrar Cliente
				
				for(int i=0;i<cl.length;i++) {
					System.out.println("Ingresa el Rut del Cliente");
					rutCliente = sc.nextLine();
					System.out.println("Ingrese el Nombre del Cliente");
					nombreCliente = sc.nextLine();
					System.out.println("Ingrese el Fecha de Nacimiento del Cliente en formato dd/MM/yyyy");
					fechaNacimientoCl = sc.nextLine();
					sc.nextLine();
					cl[i] = new Cliente(rutCliente,nombreCliente,fechaNacimientoCl);	
				}
		
				break;
			case "5":
				//Ingreso a evento
				break;
			case "6":
				//cambio de estado del evento
				break;
			default:
				break;
			}
		}
		
		
			
		
		//System.out.println(ev[0].getNombreEvento());
		
	}
	public static int CuentaY(String fecha) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate Actualidad = LocalDate.now();
		LocalDate fechaNac;
		Period periodo;
		fechaNac = LocalDate.parse(fecha, fmt);
		periodo = Period.between(fechaNac, Actualidad);
		System.out.printf("La edad del cliente es: %s a�os \n",
		                    periodo.getYears());
		return periodo.getYears();
	}
	

	public static Evento[] CreaEveento(Evento[] ev) {
		Scanner sc = new Scanner(System.in);
		String nombreEvento = "";
		Integer EdadMinima = 0;
		Integer EntradasUsadas = 0;
		Integer EntradasVendidas = 0;
		boolean estadoEvento = false;
		for (int i = 0; i < ev.length; i++) {
			if (ev[i] == null) {
				System.out.println("Ingresa Nombre del evento");
				nombreEvento = sc.nextLine();
				System.out.println("Ingrese Edad Minima del evento");
				EdadMinima = sc.nextInt();
				sc.nextLine();
				ev[i] = new Evento(nombreEvento, EdadMinima, EntradasUsadas, EntradasVendidas, estadoEvento);
				i = ev.length;
			}

		}
		return ev;

	}
	
	

}
