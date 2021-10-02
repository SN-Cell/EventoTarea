package MainPackage;

import java.util.Scanner;

import Modelo.Evento;
import Modelo.Cliente;
import Modelo.Vendedor;


public class MainClass {

	public static void main(String[] args) {
		
		String nombreEvento = "";
		Integer EdadMinima = 0; 
		Integer EntradasUsadas = 0;
		Integer EntradasVendidas = 0;
		boolean estadoEvento = false;
		
		
		Scanner sc = new Scanner(System.in);
		Evento ev[] = new Evento[2];
		
		for(int i=0;i<ev.length;i++) {
			System.out.println("Ingresa Nombre del evento");
			nombreEvento = sc.nextLine();
			System.out.println("Ingrese Edad Minima del evento");
			EdadMinima = sc.nextInt();
			sc.nextLine();
			ev[i] = new Evento(nombreEvento,EdadMinima,EntradasUsadas,EntradasVendidas,estadoEvento);	
		}
		
		for(int i=0;i<ev.length;i++) {
			System.out.println(ev[i].getNombreEvento()+" "+ev[i].getEdadMinima()+" ");
		}
		
		String rutVendedor = "";
		String nombreVendedor = "";
		String fechaNacimientoVen = "";
		Integer EntradasVendidasVen = 0; 
		
		Vendedor ven[] = new Vendedor[2];
		
		for(int i=0;i<ev.length;i++) {
			System.out.println("Ingresa el Rut del Vendedor");
			rutVendedor = sc.nextLine();
			System.out.println("Ingrese el Nombre del Vendedor");
			nombreVendedor = sc.nextLine();
			System.out.println("Ingrese el Fecha de Nacimiento del Vendedor");
			fechaNacimientoVen = sc.nextLine();
			sc.nextLine();
			
			ven[i] = new Vendedor(rutVendedor,nombreVendedor,fechaNacimientoVen,EntradasVendidasVen);	
		}
		
		
		String rutCliente = "";
		String nombreCliente = "";
		String fechaNacimientoCl = "";
		
		Cliente cl[] = new Cliente[2];
		
		for(int i=0;i<ev.length;i++) {
			System.out.println("Ingresa el Rut del Cliente");
			rutCliente = sc.nextLine();
			System.out.println("Ingrese el Nombre del Cliente");
			nombreCliente = sc.nextLine();
			System.out.println("Ingrese el Fecha de Nacimiento del Cliente");
			fechaNacimientoCl = sc.nextLine();
			sc.nextLine();
			
			cl[i] = new Cliente(rutCliente,nombreCliente,fechaNacimientoCl);	
		}
		
		
		
		

		
		
		//System.out.println(ev[0].getNombreEvento());
		
	}

}
