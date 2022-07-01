package level02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejericio01 {

	public static void main(String[] args) {
		List<String> ciudades = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("ingrese la ciudad favorita");
		ciudades.add(scan.nextLine());
		System.out.println("ingrese la ciudad favorita");
		ciudades.add(scan.nextLine());
		System.out.println("ingrese la ciudad favorita");
		ciudades.add(scan.nextLine());
		for(String ciudad: ciudades){
			System.out.println();
		}
	}

}
