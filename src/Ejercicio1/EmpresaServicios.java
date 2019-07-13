package Ejercicio1;

public class EmpresaServicios implements Pagos{
	private String nombre;
	private String tipoServicio;
	private int numCuentaBancaria;
	
	public EmpresaServicios() {
		
	}
	
	public EmpresaServicios(String nombre, String tipoServicio, int numCuentaBancaria) {
		this.nombre = nombre;
		this.tipoServicio = tipoServicio;
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

	public String getTipoServicio() {
		return tipoServicio;
	}
	
	@Override
	public String toString() {
		return "EmpresaServicios [nombre= " + nombre + ", tipoServicio= " + tipoServicio + ", numCuentaBancaria= "
				+ numCuentaBancaria + "]";
	}
	
	@Override
	public void realizarPago() {
		System.out.println("Se ha realizado el pago a " + nombre + " en la cuenta " + numCuentaBancaria);
	}
}
