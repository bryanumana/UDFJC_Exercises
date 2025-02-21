//Para el ejercicio Numero_Catorce escriba las tablas del 1 hasta el n
package introduccion_a_algoritmos;

import java.util.Scanner;

public class Numero_Quince {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        int multiplier = 0;
        do {
            System.out.print("Enter a positive integer: ");
            number = sc.nextInt();
        } while (number <= 0);

        do {
            System.out.print("Enter a positive multiplier: ");
            multiplier = sc.nextInt();
        } while (multiplier <= 0);

        for (
                int i = 1;
                i <= multiplier; i++) {
            System.out.println(i + " X " + number + " = " + number * i);
        }
    }
}
