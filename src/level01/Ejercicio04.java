package level01;
import java.util.Scanner;


public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number;
		System.out.println("Introdusca el numero del que desee el factorial");
		number = scan.nextInt();
		scan.close();
		int tmp = 1;
		for(int i=1; i<=number; i++){
			tmp *= i;
		}
		System.out.println("El factorial de "+number+" es "+tmp);
	}

}
