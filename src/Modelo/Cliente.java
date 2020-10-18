package Modelo;

import java.util.Date;

public class Cliente {
	
	
	private String fechaNacimiento;
	private String nombre;
	private String apellido;
	private String rut;
	private String user;
	private String password;
	public Cliente(String fechaNacimiento, String nombre, String apellido, String rut, String user, String password) {
		//super();
		this.fechaNacimiento = fechaNacimiento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
		this.user = user;
		this.password = password;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return this.nombre+" "+this.apellido+" "+this.rut+" "+this.fechaNacimiento ;
	}
}
	
	
	
	

