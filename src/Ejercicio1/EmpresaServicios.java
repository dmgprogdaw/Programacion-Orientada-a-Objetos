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

	@Override
	public void realizarPago() {
		
	}
}
