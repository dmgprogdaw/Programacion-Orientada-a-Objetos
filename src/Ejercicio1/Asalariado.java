package Ejercicio1;

public class Asalariado extends Empleado{
	
	public Asalariado() {
		super();
	}
	
	public Asalariado(String nombre, String primerApellido, String segundoApellido, int dia, int mes, int año, int numCuentaBancaria) {
		super(nombre, primerApellido, segundoApellido, dia, mes, año, numCuentaBancaria);
	}

	@Override
	public String toString() {
		return "Asalariado [Nombre= " + getNombre() + ", Primer Apellido= " + getPrimerApellido() + ", Segundo Apellido= " 
				+ getSegundoApellido() + ", Fecha Contratacion= " + getDia() + "-" + getMes() + "-" + getAño() + 
				", Numero Cuenta Bancaria= " + getNumCuentaBancaria() + "]";
	}
}
