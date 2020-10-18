package Modelo;

public abstract class Producto {
	protected Cliente cliente;
	protected boolean vigente;
	protected String identificarProducto;
	protected double saldo;
	protected double deuda;
	protected int claveCajero;
	public Producto(Cliente cliente, boolean vigente, String identificarProducto, double saldo, double deuda,
			int claveCajero) {
		super();
		this.cliente = cliente;
		this.vigente = vigente;
		this.identificarProducto = identificarProducto;
		this.saldo = saldo;
		this.deuda = deuda;
		this.claveCajero = claveCajero;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public boolean isVigente() {
		return vigente;
	}
	public void setVigente(boolean vigente) {
		this.vigente = vigente;
	}
	public String getIdentificarProducto() {
		return identificarProducto;
	}
	public void setIdentificarProducto(String identificarProducto) {
		this.identificarProducto = identificarProducto;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getDeuda() {
		return deuda;
	}
	public void setDeuda(double deuda) {
		this.deuda = deuda;
	}
	public int getClaveCajero() {
		return claveCajero;
	}
	public void setClaveCajero(int claveCajero) {
		this.claveCajero = claveCajero;
	}
	
	
	@Override
	public String toString() {	
		return this.identificarProducto+" "+this.claveCajero+" "+this.deuda+" "+this.saldo;
	}
	
	
	
	

}
