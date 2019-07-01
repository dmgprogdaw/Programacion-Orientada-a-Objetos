package Ejercicio1;

public class Empleado implements Pagos{
	
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String fechaContratacion;
	private int numCuentaBancaria;
	
	public Empleado() {
		
	}
	
	public Empleado(String nombre, String primerApellido, String segundoApellido, String fechaContratacion, int numCuentaBancaria) {
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.fechaContratacion = fechaContratacion;
		this.numCuentaBancaria = numCuentaBancaria;
	}
	
	public int getNumCuentaBancaria() {
		return numCuentaBancaria;
	}
	public void setNumCuentaBancaria(int numCuentaBancaria) {
		this.numCuentaBancaria = numCuentaBancaria;
	}
	public String getNombre() {
		return nombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public String getFechaContratacion() {
		return fechaContratacion;
	}

	@Override
	public void realizarPago() {
		// TODO Apéndice de método generado automáticamente
		
	}
	
	
}
