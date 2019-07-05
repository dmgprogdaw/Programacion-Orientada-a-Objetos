package Ejercicio1;

public class Asalariado extends Empleado{
	
	public Asalariado() {
		super();
	}
	
	public Asalariado(String nombre, String primerApellido, String segundoApellido, String fechaContratacion, int numCuentaBancaria) {
		super(nombre, primerApellido, segundoApellido, fechaContratacion, numCuentaBancaria);
	}

	@Override
	public String toString() {
		return "Asalariado [Nombre= " + getNombre() + ", Primer Apellido= " + getPrimerApellido() + ", Segundo Apellido= " 
				+ getSegundoApellido() + ", Fecha Contratacion= " + getFechaContratacion() + 
				", Numero Cuenta Bancaria= " + getNumCuentaBancaria() + "]";
	}
	
}
