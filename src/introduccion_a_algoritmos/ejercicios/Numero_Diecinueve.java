//Pida un entero positivo y escríbalo al revés
//Este ejercicio debe realizarse sin usar funciones relacionadas

package introduccion_a_algoritmos.ejercicios;

import java.util.Scanner;

public class Numero_Diecinueve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int digits;


        do {
            System.out.print("Enter a positive integer: ");
            n = sc.nextInt();
        } while (n <= 0);

        for (int i = 0; i < n; i++) {
            digits = n % 10;
            n = n / 10;
            System.out.print(digits);
        }
    }
}
