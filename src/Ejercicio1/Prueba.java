package Ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

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

		Asalariado emple1 = new Asalariado("Alba", "Gonzalez", "Perez", "09-07-2012", 445566);
		Contratista emple2 = new Contratista("Maria", "Iglesias", "Megido", "03-03-2003", 778899, so1);
		Asalariado emple3 = new Asalariado("Jose", "Hernandez", "Martin", "05-05-1989", 225588);
		Contratista emple4 = new Contratista("Daniel", "Diaz", "Velasco", "15-09-1999", 114477, so1);
		Asalariado emple5 = new Asalariado("Elena", "Hernandez", "Fernandez", "28-03-2011", 112233);
		Contratista emple6 = new Contratista("Victor", "Fernandez", "Velasco", "30-08-2000", 336699, so2);
		List<Empleado> empleados = new ArrayList<>();

		empleados.add(emple1);
		empleados.add(emple2);
		empleados.add(emple3);
		empleados.add(emple4);
		empleados.add(emple5);
		empleados.add(emple6);
		
		Collections.sort(empleados);
		
		Iterator i = empleados.iterator();
		while(i.hasNext()) {
			Empleado elemento = (Empleado) i.next();
			
			System.out.println(elemento);
		}
		
	}
}
