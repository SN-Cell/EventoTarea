package MainPackage;

import java.util.Scanner;

import Modelo.Evento;

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
		
		
		//System.out.println(ev[0].getNombreEvento());
		
	}

}
