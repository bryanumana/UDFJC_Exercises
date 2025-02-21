// Para el ejercicio Numero_Diez, escriba la cantidad de divisores que tiene

package introduccion_a_algoritmos;

import java.util.Scanner;

public class Numero_Diez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int div = 0;
        int counter = 0;

        do {
            System.out.print("Enter a positive integer: ");
            n = sc.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            div = n % i;
            if (div == 0) {
                counter++;
            }
        }
        System.out.println("The number of divisors it has are: " + counter);
    }
}
