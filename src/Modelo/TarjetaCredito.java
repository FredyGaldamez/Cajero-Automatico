package Modelo;

public class TarjetaCredito extends Producto{
	private double saldoMaximo;
	public TarjetaCredito(Cliente cliente, boolean vigente, String identificarProducto, double saldo, double deuda,
			int claveCajero, double saldoMaximo) {
		super(cliente, vigente, identificarProducto, saldo, deuda, claveCajero);
		this.saldoMaximo=saldoMaximo;
	}
	public double getSaldoMaximo() {
		return saldoMaximo;
	}
	public void setSaldoMaximo(double saldoMaximo) {
		this.saldoMaximo = saldoMaximo;
	}

	@Override
	public String toString() {
		String c = cliente.toString();
		String p= super.toString();
		return c + p + this.saldoMaximo ;
	}
}
