package Ejercicio1;

import java.util.LinkedList;
import java.util.List;

public class Contratista extends Empleado {

	private List sociedades = new LinkedList();
	
	public Contratista() {
		super();
	}

	public Contratista(String nombre, String primerApellido, String segundoApellido, String fechaContratacion, int numCuentaBancaria, 
			List sociedades) {
		super(nombre, primerApellido, segundoApellido, fechaContratacion, numCuentaBancaria);
		this.sociedades = sociedades;
	}

	@Override
	public String toString() {
		return "Contratista [Nombre= " + getNombre() + ", Primer Apellido= " + getPrimerApellido()
				+ ", Segundo Apellido= " + getSegundoApellido() + ", Fecha Contratacion= "
				+ getFechaContratacion() + ", Numumero Cuenta Bancaria= " + getNumCuentaBancaria()
						+ ", Lista Sociedades Anonimas= " + sociedades + "]";
	}
	
	
}
