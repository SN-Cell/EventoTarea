package Modelo;

public class Vistas {

	static void menu() {
		System.out.println("--------------------------------------------------------------");
		System.out.println("------1 CREAR EVENTO              2 VENTA DE ENTRADAS     ----");
		System.out.println("------3 INGRESO A EVENTO          4 CAMBIO ESTADO EVENTO  ----");
		System.out.println("--------------------------------------------------------------");
		
	}
	static void TipoEntrada() {
		System.out.println("-------SELECCIONE TIPO DE VENTA QUE DESEA REALIZAR----------");
		System.out.println("----                                                     ---");
		System.out.println("----         1 ENTRADA  NORMAL                           ---");
		System.out.println("----                                                     ---");
		System.out.println("----         2 ENTRADA  VIP                              ---");
		System.out.println("----                                                     ---");
		System.out.println("----         3 REGRESA AL MENU PRINCIAL                  ---");
		System.out.println("------------------------------------------------------------");
	}
	
	static void VentaEntradaTicket(String nombre, String rut, String evento) {
		System.out.println("------------------------------------------------------------");
		System.out.println("---- VENDIENDO ENTRADA A                                 ---");
		System.out.println("---- CLIENTE:                                            ---");
		System.out.println("----    "+ nombre+ " RUT:"+rut +"----------");
		System.out.println("---- EVENTO:                                             ---");
		System.out.println("----    "+ evento +"         ----------");
		System.out.println("----                                                     ---");
		System.out.println("------------------------------------------------------------");
	}
	static void EventoNoCurso(String nombre, String rut, String evento) {
		System.out.println("------------------------------------------------------------");
		System.out.println("---- USANDO ENTRADA CON CLIENTE                          ---");
		System.out.println("----    "+ nombre+ " RUT:"+ rut +"----------");
		System.out.println("---- PARA EVENTO:                                        ---");
		System.out.println("----    "+ evento +"----------");
		System.out.println("---- NO SE PUEDE USAR LA ENTRADA PORQUE EL EVENTO        ---");
		System.out.println("----    "+ evento +"----------");
		System.out.println("---- NO ESTA EN CURSO                                    ---");
		System.out.println("------------------------------------------------------------");
	}
	static void EventoEnCurso(String nombre, String rut, String evento) {
		System.out.println("------------------------------------------------------------");
		System.out.println("---- USANDO ENTRADA CON CLIENTE                          ---");
		System.out.println("----    "+ nombre+ " RUT:"+rut +"----------");
		System.out.println("---- PARA EVENTO:                                        ---");
		System.out.println("----    "+ evento +"----------");
		System.out.println("---- ENTRADA ENCONTRADA                                  ---");
		System.out.println("----    "+ nombre+"----------");
		System.out.println("----       PUEDE PASAR                                    ---");
		System.out.println("------------------------------------------------------------");
	}
	
	static void EntradaUsada(String nombre, String rut, String evento) {
		System.out.println("------------------------------------------------------------");
		System.out.println("---- USANDO ENTRADA CON CLIENTE                          ---");
		System.out.println("----    "+nombre+ " RUT:"+rut +"----------");
		System.out.println("---- PARA EVENTO:                                        ---");
		System.out.println("----    "+ evento +"----------");
		System.out.println("---- ENTRADA PARA RUT                                    ---");
		System.out.println("----    "+ rut+"----------");
		System.out.println("----   YA FUE USADA NO   PUEDE PASAR                     ---");
		System.out.println("------------------------------------------------------------");
	}
	
	static void EntradaVendidas(String nombreV, int CantEntradaN, int CantEntradaVIP) {
		System.out.println("------------------------------------------------------------");
		System.out.println("----EL VENDEDOR  "+ nombreV+  " HA VENDIDO: ");   
		System.out.println("----                                                     ---");
		System.out.println("---- "+ CantEntradaN +"    ENTRADA/S NORMAL/ES -------");
		System.out.println("----                                                     ---");
		System.out.println("---- "+CantEntradaVIP +"      ENTRADA/S VIP      ----------");
		System.out.println("----   YA FUE USADA NO   PUEDE PASAR                     ---");
		System.out.println("------------------------------------------------------------");
	}
	
	
	
}
	
	

