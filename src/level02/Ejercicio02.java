package level02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio02 {

	public static void main(String[] args) {
		//agregamos cinco numeros enteros a la lista creada
		List<Integer> numeros = new ArrayList(Arrays.asList(1,2,3,4,5));
		System.out.println("Los elementos en la lista son: "+numeros.size()+"\n"+numeros);
		//agregamos un numero entero al principio de la lista
		System.out.println("\nAgregamos un entero al comienzo y otro al final de la lista\n");
		numeros.add(0, 0);
		//y luego otro al final
		numeros.add(6);
		//imprimimos
		System.out.println("los elementos en la lista ahora son: "+numeros.size()+"\n"+numeros);
		
		
	}

}
