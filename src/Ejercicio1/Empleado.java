package Ejercicio1;

public class Empleado implements Pagos, Comparable<Empleado>{
	
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private Integer dia, mes, año;
	private int numCuentaBancaria;
	
	public Empleado() {
		
	}
	
	public Empleado(String nombre, String primerApellido, String segundoApellido, int dia, int mes, int año, int numCuentaBancaria) {
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.dia = dia;
		this.mes = mes;
		this.año = año;
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

	public Integer getDia() {
		return dia;
	}

	public Integer getMes() {
		return mes;
	}

	public Integer getAño() {
		return año;
	}

	@Override
	public void realizarPago() {
		System.out.println("Se ha realizado el pago a " + nombre + " en la cuenta " + numCuentaBancaria);
		
	}
	
	@Override
	public String toString() {
		return "Empleado [Nombre= " + nombre + ", Primer Apellido= " + primerApellido + ", Segundo Apellido= "
				+ segundoApellido + ", Fecha Contratacion= " + dia + "-" + mes + "-" + año + ", Numero Cuenta Bancaria= "
				+ numCuentaBancaria + "]";
	}
	
	@Override
	public int compareTo(Empleado e) {
		String empA = new String(String.valueOf(this.nombre));
		String empB = new String(String.valueOf(e.nombre));
		return empA.compareTo(empB);
	}

}
