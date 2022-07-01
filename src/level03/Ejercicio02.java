package level03;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class Ejercicio02 {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1,2,3,4,5);
		List<Integer> numerosElevados = new ArrayList<>();
		numeros.stream().map((x)->x*x).forEach((x)->numerosElevados.add(x));
		System.out.println(numerosElevados);
	}

}
