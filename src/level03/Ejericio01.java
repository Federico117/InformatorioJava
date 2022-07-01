package level03;

import java.util.ArrayList;
import java.util.List;


public class Ejericio01 {

	public static void main(String[] args) {
		
		List<String> palabras = new ArrayList<>();
		palabras.add("Hola");
		palabras.add(null);
		palabras.add("Informatorio");
		palabras.add("");
		//se uso dos veces el metodo filter() primero para filtrar los valores no nulos y luego para filtrar los Strings vacios
		palabras.stream().filter(x -> x != null).filter(x -> !"".equals(x)).forEach((x) -> System.out.println(x)); 
	}

}
