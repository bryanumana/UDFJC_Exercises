//Pida al usuario un número entero, escriba el número de cifras que tiene

package introduccion_a_algoritmos.ejercicios;

import java.util.Scanner;

public class Numero_Siete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        int counter = 0;


        while (number > 0) {
            number = number / 10;
            counter++;
        }

        System.out.println("The number of digits are: " + counter);
    }
}
