package Utilidades;



import Main.Main;
import Modelo.Cliente;
import Modelo.TarjetaCredito;

public class Util {

	String user="i.naranjo";
	String password="12AB";
	public static void mensaje(String mensaje) {
		System.out.println(mensaje);

	}
	public static void menu(Cliente cliente, TarjetaCredito tarjeta) {
		
		
		boolean salir=false;
		while(!salir) {
			mensaje("Tarjeta de credito: "+tarjeta.getIdentificarProducto());
			mensaje("Saldo actual "+tarjeta.getSaldo() + " -  "+tarjeta.getSaldoMaximo());
			boolean tieneDeuda= tarjeta.getDeuda()>0;
			if (tieneDeuda) {
				mensaje("La deuda de su tarjeta es: "+tarjeta.getDeuda());
			}else {
				mensaje("No tienes deuda");
			}
			mensaje("Que deseas hacer?");
			mensaje("1. Volver al menu");
			int opcionMasAlta =1;
			if (tieneDeuda) {
				mensaje("2. Pagar mi deuda");
				opcionMasAlta=2;
			}
			int op=0;
			while(op<=0 || (op>opcionMasAlta)) {
				try {
					op=Integer.parseInt(Main.src.nextLine());
				} catch (Exception e) {
					op=0;
				}
				
				
			}
			
		}
	}
}