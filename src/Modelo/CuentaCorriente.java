package Modelo;

public class CuentaCorriente extends Producto {
	
	private double precioMensual;
	public CuentaCorriente(Cliente cliente, boolean vigente, String identificarProducto, double saldo, double deuda,
			int claveCajero, double precioMensual) {
		super(cliente, vigente, identificarProducto, saldo, deuda, claveCajero);
		this.precioMensual=precioMensual;
	}
	public double getPrecioMensual() {
		return precioMensual;
	}
	public void setPrecioMensual(double precioMensual) {
		this.precioMensual = precioMensual;
	}
	

}
