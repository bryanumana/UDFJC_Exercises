// Escriba los primeros n términos de la serie Fibonacci

package introduccion_a_algoritmos;

import java.util.Scanner;

public class Numero_Dieciseis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int a = 0;
        int b = 1;
        int c = 1;

        do {
            System.out.print("Write the number of repetitions of the series: ");
            num = sc.nextInt();
        } while (num <= 0);

        System.out.println("The first N numbers of the Fibonacci series are: ");

        for (int i = 0; i < num; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(b);
        }
    }
}
