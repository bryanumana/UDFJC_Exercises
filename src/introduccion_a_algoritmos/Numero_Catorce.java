// Pida al usuario un entero positivo n y escriba las tablas de multiplicar de n

package introduccion_a_algoritmos;

import java.util.Scanner;

public class Numero_Catorce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;

        do {
            System.out.print("Enter a positive integer: ");
            number = sc.nextInt();
        } while (number <= 0);

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " X " + number + " = " + number * i);
        }
    }
}
