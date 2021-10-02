package Modelo;

public class Vistas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static void menu() {
		System.out.println("------------------------------------------------------------");
		System.out.println("------1 CREAR EVENTO              2 vENTA DE ENTRADAS     ----");
		System.out.println("------3      4 DIVISION  ----");
		System.out.println("----------Ingrese una opcion --------------");
		
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
	
	static void VentaEntradaTicket(Cliente cliente, Evento evento) {
		System.out.println("------------------------------------------------------------");
		System.out.println("---- VENDIENDO ENTRADA A                                 ---");
		System.out.println("---- CLIENTE:                                            ---");
		System.out.println("----    "+ cliente.nombre+ " RUT:"+cliente.rut +"----------");
		System.out.println("---- EVENTO:                                             ---");
		System.out.println("----    "+ evento.getNombreEvento() +"----------");
		System.out.println("----                                                     ---");
		System.out.println("------------------------------------------------------------");
	}
	static void EventoNoCurso(Cliente cliente, Evento evento) {
		System.out.println("------------------------------------------------------------");
		System.out.println("---- USANDO ENTRADA CON CLIENTE                          ---");
		System.out.println("----    "+ cliente.nombre+ " RUT:"+cliente.rut +"----------");
		System.out.println("---- PARA EVENTO:                                        ---");
		System.out.println("----    "+ evento.getNombreEvento() +"----------");
		System.out.println("---- NO SE PUEDE USAR LA ENTRADA PORQUE EL EVENTO        ---");
		System.out.println("----    "+ evento.getNombreEvento() +"----------");
		System.out.println("---- NO ESTA EN CURSO                                    ---");
		System.out.println("------------------------------------------------------------");
	}
	static void EventoEnCurso(Cliente cliente, Evento evento) {
		System.out.println("------------------------------------------------------------");
		System.out.println("---- USANDO ENTRADA CON CLIENTE                          ---");
		System.out.println("----    "+ cliente.nombre+ " RUT:"+cliente.rut +"----------");
		System.out.println("---- PARA EVENTO:                                        ---");
		System.out.println("----    "+ evento.getNombreEvento() +"----------");
		System.out.println("---- ENTRADA ENCONTRADA                                  ---");
		System.out.println("----    "+ cliente.nombre+"----------");
		System.out.println("----       PUEDE PASAR                                    ---");
		System.out.println("------------------------------------------------------------");
	}
	
	static void EntradaUsada(Cliente cliente, Evento evento) {
		System.out.println("------------------------------------------------------------");
		System.out.println("---- USANDO ENTRADA CON CLIENTE                          ---");
		System.out.println("----    "+ cliente.nombre+ " RUT:"+cliente.rut +"----------");
		System.out.println("---- PARA EVENTO:                                        ---");
		System.out.println("----    "+ evento.getNombreEvento() +"----------");
		System.out.println("---- ENTRADA PARA RUT                                    ---");
		System.out.println("----    "+ cliente.rut+"----------");
		System.out.println("----   YA FUE USADA NO   PUEDE PASAR                     ---");
		System.out.println("------------------------------------------------------------");
	}
	
	static void EntradaVendidas(Vendedor vendedor) {
		System.out.println("------------------------------------------------------------");
		System.out.println("----EL VENDEDOR  "+ vendedor.nombre+  " HA VENDIDO: ");   
		System.out.println("----                                                     ---");
		System.out.println("---- "+ getEntradaNormal() +"    ENTRADA/S NORMAL/ES -------");
		System.out.println("----                                                     ---");
		System.out.println("---- "+getEntradaVip() +"      ENTRADA/S VIP      ----------");
		System.out.println("----   YA FUE USADA NO   PUEDE PASAR                     ---");
		System.out.println("------------------------------------------------------------");
	}
	
	
	
	}
	
	

