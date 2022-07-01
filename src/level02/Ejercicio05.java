package level02;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/*Todos los empleados estan cargados en un Set(HashSet), se desea calcular el sueldo(horasTrabajadass x valorPorHora)
 * de toda esa lista para luego almacenar en un Map (o diccionario) donde la calve(key) es el dni y el valor (value)
 * es el sueldo calculado */
public class Ejercicio05 {

	public static void main(String[] args) {
		Set<Empleado> empleados = new HashSet();
		empleados.add(new Empleado("Federico Valdez", 40605106, 6, 600));
		empleados.add(new Empleado("Federico Valdez", 39450768, 6, 600));
		empleados.add(new Empleado("Homero Simpsons", 24475761, 9, 450));
		empleados.add(new Empleado("Marge Simpsons", 38869956, 6, 400));
		
		System.out.println(empleados.size());
		for(Empleado emp : empleados){
			System.out.println("Nombre y Apellido: "+emp.getNomApe()+"\nDNI: "+emp.getDni());
			System.out.println("valor por hora: "+emp.getValorHora()+"\nhoras trabajadas: "+emp.getHorasLabor()+"\n");
		}
		System.out.println(empleados);
		//ya hicimos las coomprobaciones y logramos que objetos con el mismo 
		//valor de dni se consideren repetidos sobrescribiendo unos metodos por lo tanto no se agregan
		Map<Integer, Integer> sueldo = new HashMap();
		for(Empleado emple : empleados){
			sueldo.put(emple.getDni(), emple.getValorHora()*emple.getHorasLabor());
		}
		for(Empleado em : empleados){
			System.out.println("el salario total de: "+em.getNomApe()+" es "+sueldo.get(em.getDni()));
		}
	}

}
