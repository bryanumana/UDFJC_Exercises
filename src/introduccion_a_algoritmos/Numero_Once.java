//Para un entero positivo determine si es primo
package introduccion_a_algoritmos;

import java.util.Scanner;

public class Numero_Once {
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
        if (counter == 2) {
            System.out.println("The number is prime.");
        }else{
            System.out.println("The number is not prime.");
        }
    }
}