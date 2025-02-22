//Para el ejercicio Numero_Seis calcular la sumatoria de los digitos

package introduccion_a_algoritmos.ejercicios;

import java.util.Scanner;

public class Numero_Ocho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        int digits = 0;
        int sum = 0;

        while (number > 0) {
            digits = number % 10;
            number = number / 10;
            sum += digits;
        }

        System.out.println("The sum of digits are: " + sum);
    }
}
