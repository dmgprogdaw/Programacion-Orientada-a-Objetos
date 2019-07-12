package Ejercicio1;

import java.util.LinkedList;
import java.util.List;

public class Contratista extends Empleado {

	private List sociedades = new LinkedList();
	
	public Contratista() {
		super();
	}

	public Contratista(String nombre, String primerApellido, String segundoApellido, int dia, int mes, int año, int numCuentaBancaria, 
			List sociedades) {
		super(nombre, primerApellido, segundoApellido, dia, mes, año, numCuentaBancaria);
		this.sociedades = sociedades;
	}

	@Override
	public String toString() {
		return "Contratista [Nombre= " + getNombre() + ", Primer Apellido= " + getPrimerApellido()
				+ ", Segundo Apellido= " + getSegundoApellido() + ", Fecha Contratacion= "
				+ getDia() + "-" + getMes() + "-" + getAño() + ", Numumero Cuenta Bancaria= " + getNumCuentaBancaria()
						+ ", Lista Sociedades Anonimas= " + sociedades + "]";
	}
	
	
}
