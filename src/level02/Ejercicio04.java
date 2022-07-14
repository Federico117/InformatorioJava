package level02;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<String> alumnos = new ArrayList<>();
        alumnos.add("Federico");
        alumnos.add("Susana");
        alumnos.add("Nicolas");
        alumnos.add("Marcela");
        alumnos.add("Adrian");
        alumnos.add("Marta");
        alumnos.add("Marcelo");
        alumnos.add("Mariana");
        alumnos.add("Pablo");
        alumnos.add("Mirta");
        alumnos.add("Mario");
        alumnos.add("Veronica");
        //separamos alumnos por cursos
        var cursoDesarrolloWeb = alumnos.subList(0, 4);
        var cursoTesting = alumnos.subList(4, 8);
        var cursoDisenioUX = alumnos.subList(8, 12);
        System.out.println("Alumnos del curso de Desarrollo: "+cursoDesarrolloWeb);
        System.out.println("Alumnos del curso de Testing: "+cursoTesting);
        System.out.println("Alumnos del curso de Diseño UX: "+cursoDisenioUX);
	    
    }
	
}
