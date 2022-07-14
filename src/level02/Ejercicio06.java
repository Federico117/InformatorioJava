package level02;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ejercicio06 {
	public static void main(String[] args) {
		Set<Empleado> setEmpleado = new HashSet<>();
		Map<Integer, Double> dniSueldo = new HashMap<>();
		//agregamos los empleados al hashset
		setEmpleado.add(new Empleado("Federico Valdez", 40605106, 8, 500));
		setEmpleado.add(new Empleado("Carlos Valdez", 40605107,  8, 800));
		setEmpleado.add(new Empleado("Maximiliano Valdez", 24325761, 6, 1000));
		setEmpleado.add(new Empleado("Ezequiel Valdez", 24325762, 8, 900));
		setEmpleado.add(new Empleado("Juan Valdez", 24306405, 3, 1500));
		//procedemos a calcular el sueldo de cada empleado y almacenarlo en map con la clave del dni
		for(Empleado emp: setEmpleado){
			double sueldox = emp.getHorasTrabajadas() * emp.getValorHora();
			dniSueldo.put(emp.getDni(), sueldox);
		}
                //imprimimos el map con el clave dni y el valor del sueldo
		System.out.println(dniSueldo);
	}
}
