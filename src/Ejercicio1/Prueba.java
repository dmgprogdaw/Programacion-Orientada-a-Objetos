package Ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Prueba {

	public static void main(String[] args) {

		List<String> tso1 = new ArrayList<>();
		tso1.add("Trabajo1");
		tso1.add("Trabajo2");
		List<String> tso2 = new ArrayList<>();
		tso2.add("Trabajo3");

		SociedadAnonima sa1 = new SociedadAnonima("SociedadAnonima1", tso1);
		SociedadAnonima sa2 = new SociedadAnonima("SociedadAnonima1", tso2);
		List<Object> so1 = new ArrayList<>();
		List<Object> so2 = new ArrayList<>();
		so1.add(sa1);
		so2.add(sa2);

		Asalariado emple1 = new Asalariado("Alba", "Gonzalez", "Perez", 9, 7, 2012, 445566);
		Contratista emple2 = new Contratista("Maria", "Iglesias", "Megido", 3, 3, 2003, 778899, so1);
		Asalariado emple3 = new Asalariado("Jose", "Hernandez", "Martin", 5, 5, 1989, 225588);
		Contratista emple4 = new Contratista("Daniel", "Diaz", "Velasco", 15, 9, 1999, 114477, so1);
		Asalariado emple5 = new Asalariado("Elena", "Hernandez", "Fernandez", 31, 3, 2000, 112233);
		Contratista emple6 = new Contratista("Victor", "Fernandez", "Velasco", 30, 3, 2000, 336699, so2);
		List<Empleado> listas = new ArrayList<>();
		List<Empleado> ordenadaNombre = new ArrayList<>();
		List<Empleado> ordenadaFecha = new ArrayList<>();
		List<Empleado> ordenadaNombreInverso = new ArrayList<>();
		
		ordenadaNombre.add(emple1); ordenadaNombre.add(emple2); ordenadaNombre.add(emple3); ordenadaNombre.add(emple4); ordenadaNombre.add(emple5); ordenadaNombre.add(emple6);	
		ordenadaFecha.add(emple1); ordenadaFecha.add(emple2); ordenadaFecha.add(emple3); ordenadaFecha.add(emple4); ordenadaFecha.add(emple5); ordenadaFecha.add(emple6);
		ordenadaNombreInverso.add(emple1); ordenadaNombreInverso.add(emple2); ordenadaNombreInverso.add(emple3); ordenadaNombreInverso.add(emple4); ordenadaNombreInverso.add(emple5); ordenadaNombreInverso.add(emple6);	
		
		Collections.sort(ordenadaNombre);
		Collections.sort(ordenadaFecha, new Comparator<Empleado>() {			
			public int compare(Empleado emp1, Empleado emp2) {
				int comparacion = 0;
				if (emp1.getAño().equals(emp2.getAño())) {
					if (emp1.getMes().equals(emp2.getMes())) {
						if (emp1.getDia().equals(emp2.getDia())) {
							comparacion = emp2.getNombre().compareTo(emp1.getNombre());
						}
						else {
							comparacion = emp2.getDia().compareTo(emp1.getDia());
						}
					}
					else {
						comparacion = emp2.getMes().compareTo(emp1.getMes());
					}
				}
				else {
					comparacion = emp2.getAño().compareTo(emp1.getAño());
				}			
				return comparacion;			
			}
		});
		Collections.sort(ordenadaNombreInverso, new Comparator<Empleado>() {			
			public int compare(Empleado emp1, Empleado emp2) {
				return emp2.getNombre().compareTo(emp1.getNombre());		
			}
		});
		
		listas.addAll(ordenadaNombre); listas.addAll(ordenadaFecha); listas.addAll(ordenadaNombreInverso);
		
		Iterator<Empleado> i = listas.iterator();
		while(i.hasNext()) {
			Empleado elemento = (Empleado) i.next();
			
			System.out.println(elemento);
		}
	}	
}