package level01;
import java.util.Scanner;


public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese una palabra en minusculas");
		String myString = scan.nextLine();
		int largo = myString.length();
		char[] myChar = new char[largo];
		int[] mayus = new int[largo];
		for(int i=0; i<largo; i++){
			myChar[i] = myString.charAt(i);
			mayus[i] = ((int)myChar[i]-32);
			myChar[i] = (char)mayus[i];
		}
		for(int i=0; i<largo; i++){
			System.out.print(myChar[i]);
		}
	}

}
