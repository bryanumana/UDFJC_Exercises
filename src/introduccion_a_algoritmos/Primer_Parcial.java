//Un algoritmo que lea un número entero positivo de 5 cifras y calcule el promedio de todos sus digitos.
//El algoritmo debe verificar que el número solicitado sea válido e insistir hasta el usuario ingrese el número correcto.
// EJEMPLO: Si ingresa 23457 debe escribir en pantalla 4.2
package introduccion_a_algoritmos;

import java.util.Scanner;

public class Primer_Parcial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        float sum = 0;

        do {
            System.out.print("Enter a number of 5 digits and positive: ");
            number = sc.nextInt();
        } while (number < 10000 || number > 99999);

        int n = number;

        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            sum += digit;
        }
        System.out.println("The average of the digits of " + number + " is " + sum / 5);
    }
}