//Leer lo enteros a y b,
// y escribir todos los enteros entre a y b de forma ascendente
// y luego de forma descendente

package introduccion_a_algoritmos.ejercicios;

import java.util.Scanner;

public class Numero_Dos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int a = sc.nextInt();
        System.out.print("Enter a integer: ");
        int b = sc.nextInt();

        if (a < b) {
            System.out.println("Ascending form: ");
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }

            System.out.println("\n" + "Descending form: ");
            for (int i = b; i >= a; i--) {
                System.out.println(i);
            }
        } else {
            System.out.println("Ascending form: ");
            for (int i = b; i <= a; i++) {
                System.out.println(i);
            }

            System.out.println("\n" + "Descending form: ");
            for (int i = a; i >= b; i--) {
                System.out.println(i);
            }
        }
    }
}
