package level03;


import java.util.List;
import java.util.ArrayList;

public class Ejericio04 {

	public static void main(String[] args) {
		/*creamos dos listas una con los valores a factorear y otra 
		 * para almacenar los resultados sin valores duplicados*/
		
		List<Integer> numeros = List.of(1,2,4,4,4);
		List<Integer> factorialesSinDuplicados = new ArrayList<>();
		
		numeros.stream().map((a)->{
			int resultado = 1;
			for(int i = 1; i < a; i++) {
				resultado = resultado * (i+1);
			}
			return resultado;
		}).distinct().forEach((f)->factorialesSinDuplicados.add(f));
		
		System.out.println(factorialesSinDuplicados);
	}

}