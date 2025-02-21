//Para el ejercicio Numero_Doce,calcule la suma de todos los números del listado

package introduccion_a_algoritmos;

import java.util.Scanner;

public class Numero_Trece {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;

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
                sum += i;
            }
        }
        System.out.println("The sum of the prime numbers before " + n + " are: " + sum);
    }
}
