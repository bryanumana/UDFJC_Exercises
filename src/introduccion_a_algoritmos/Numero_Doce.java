// Para un número entero positivo, escriba el listado de todos los números primos anteriores a él
package introduccion_a_algoritmos;

import java.util.Scanner;

public class Numero_Doce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Enter a positive integer: ");
            n = sc.nextInt();
        } while (n <= 0);

        for (int i = 2; i < n; i++) {
            boolean isPrime = true;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
