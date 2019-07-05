package Ejercicio1;

import java.util.LinkedList;
import java.util.List;

public class SociedadAnonima {
	
	private String nombre;
	private List lista = new LinkedList();
	
	public SociedadAnonima() {
		
	}
	
	public SociedadAnonima(String nombre, List lista) {
		this.nombre = nombre;
		this.lista = lista;
	}

	public String getNombre() {
		return nombre;
	}
	
	@Override
	public String toString() {
		return "SociedadAnonima Nombre= " + nombre + ", Lista= " + lista;
	}
}
