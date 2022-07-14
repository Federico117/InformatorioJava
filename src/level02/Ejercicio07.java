package level02;

import java.util.Arrays;

public class Ejercicio07 {
    public static void main(String[] args) {
        //llamamos a la funcion con los argumentos 1 a 6 y 1 a 8 para comprobar que excluye el ultimo numero
        System.out.println(Arrays.toString(funcionFizzBuzz(1, 6)));
        System.out.println(Arrays.toString(funcionFizzBuzz(1, 8)));
        
    }
    
    public static String[] funcionFizzBuzz(int menor, int mayor) {
        String[] words = new String[mayor - 1];
        int index = 0;
        for (int i = menor; i < mayor; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                words[index] = "FizzBuzz";
            } else if (i % 2 == 0) {
                words[index] = "Fizz";
            } else if (i % 3 == 0) {
                words[index] = "Buzz";
            } else {
                words[index] = String.valueOf(i);
            }
            index += 1;
        }
        return words;
    }
}
