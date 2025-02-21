//Pida al usuario los dos primeros términos de una serie y escriba los n primeros términos de la serie
package introduccion_a_algoritmos;

import java.util.Scanner;

public class Numero_Diecisiete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Write the number of repetitions of the series: ");
            num = sc.nextInt();
        } while (num <= 0);

        int a;
        do {
            System.out.print("Enter the first integer: ");
            a = sc.nextInt();
        } while (a <= 0);

        int b;
        do {
            System.out.print("Enter the second integer (must be higher than a): ");
            b = sc.nextInt();
        } while (b <= 0 || b < a);

        int c = 0;

        System.out.println("The first N numbers of the Fibonacci series are: ");

        for (int i = 0; i < num; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(b);
        }
    }
}
