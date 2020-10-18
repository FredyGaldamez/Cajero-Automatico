package Main;

import java.util.ArrayList;
import java.util.Scanner;

import Modelo.*;
import Utilidades.*;
import controller.*;

public class Main {
	
	public static Scanner src = new Scanner(System.in);
	Metodos met = new Metodos ();
	static ArrayList<Cliente> cliente = new ArrayList<>();
	static ArrayList<CuentaCorriente> ctaCorriente = new ArrayList<>();
	static ArrayList<TarjetaCredito> tarjetita = new ArrayList<>();
	public static void main(String[] args) {
		cliente.add(new Cliente ("1980,12,10", "Israel", "Naranjo", "111111111", "i.naranjo", "12ab"));
		ctaCorriente.add(new CuentaCorriente(cliente.get(0), true, "00-111111111", 1500000, 1000000, 1234, 13000));
		tarjetita.add(new TarjetaCredito(cliente.get(0), true, "TC01", 1000000, 1200000, 1234, 1015000));
		for (TarjetaCredito tarjeta : tarjetita ) {
		System.out.println(tarjeta.toString());
		
		System.out.println("Ingrese su RUT");
		String rut=src.next();

		System.out.println("Ingrese su clave");
		String clave=src.next();
		
		if (rut.equals(tarjeta.getCliente().getRut()) && clave.equals(tarjeta.getCliente().getPassword())) {
			
			System.out.println("Bienvenido "+tarjeta.getCliente().getNombre()+" "+
			
			System.out.println("Que deseas hacer?");
			System.out.println("1- Menu Cuenta Corriente");
			System.out.println("2- Menu Tarjeta de Credito");
			System.out.println("3- Ver datos de mi ejecutivo");
			System.out.println("4- Salir");
			System.out.println("Ingrese opción 1 al 4");
			int op=src.nextInt();
			while(op<1 || op>4) {
				System.out.println("Debe ser entre 1 y 4 0/Ingrese nuevamente");
				op=src.nextInt();
			}
			switch (op) {
			case 1:
				System.out.println("Cuenta Corriente "+ctaCorriente.get(0).getIdentificarProducto());
				System.out.println("Su saldo actual es: "+ctaCorriente.get(0).getSaldo());
				System.out.println("Qué desea hacer ?");
				System.out.println("1. Volver al menu");
				System.out.println("2. Retirar dinero");
				System.out.println("3. Pagar mi deuda");
				int op1=src.nextInt();
				switch (op1) {
				case 1:
					
					break;
				case 2:
					System.out.println("Cuánto desea retirar ? (0 para cancelar)");
					int retiro=src.nextInt();
					while(retiro>ctaCorriente.get(0).getSaldo()) {
						
						
					}
					break;

				default:
					break;
				}

				
				break;

			default:
				break;
			}

			
			
			
			
		}else {
			
			System.out.println("Usuario y/o contraseña son incorrectas !");
		}
	}
			
	}	
	
}
