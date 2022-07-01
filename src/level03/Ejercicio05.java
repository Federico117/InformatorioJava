package level03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio05 {

	public static void main(String[] args) {
		List<Alumno> alumnos = new ArrayList<>();
		alumnos.add(new Alumno("Homero", "Simpsons", LocalDate.of(1979, 07, 21)));
		alumnos.add(new Alumno("Marge", "Simpsons", LocalDate.of(1984, 03, 19)));
		alumnos.add(new Alumno("Bart", "Simpsons", LocalDate.of(2012, 9, 7)));
		alumnos.add(new Alumno("Lisa", "Simpsons", LocalDate.of(2014, 03, 19)));
		alumnos.add(new Alumno("Maggie", "Simpsons", LocalDate.of(2020, 9, 7)));
		//creamos un Map a partir de un Stream de la lista Alumno con Collectors
		Map<String, Integer> edadAlumno = alumnos.stream().collect(Collectors.toMap(Alumno::getNombreApellido, x->x.getEdad()));
		System.out.println(edadAlumno);
	}

}
