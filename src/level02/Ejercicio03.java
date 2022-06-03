package level02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ejercicio03 {

	public static void main(String[] args) {
		//cargamos los valores de la baraja francesa
		Integer[] cartas = {1, 2, 3, 4,5,6,7,8,9,10,11,12,13};		
		List<Integer> naipes = new ArrayList<>(Arrays.asList(cartas));
		//imprimimos por pantalla la numeracion de los naipes
		System.out.println("Imprimimos en orden la numeracion de naipes");
		for(int g: naipes){
			System.out.print(g+" ");
		}
		System.out.println("\nImprimimos la lista en orden inverso");
		//ordenamos inversamente la lista e imprimimos
		Collections.sort(naipes, Collections.reverseOrder());
		for(int g: naipes){
			System.out.print(g+" ");
		}
		System.out.println("\nDesordenamos la lista e imprimimos");
		//mezclamos los elementos de la lista e imprimimos
		Collections.shuffle(naipes);
		for(int g: naipes){
			System.out.print(g+" ");
		}
	}

}
