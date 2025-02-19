//Pida al usuario ingresar a, b, c,.
// Escriba en pantalla los múltiplos de a que estén entre b y c

package introduccion_a_algoritmos;

import java.util.Scanner;

public class Numero_Seis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a A number: ");
        int a = sc.nextInt();
        System.out.print("Enter a B number: ");
        int b, c;

        do {
            System.out.print("Enter the value of b (must be less than c): ");
            b = sc.nextInt();

            System.out.print("Enter the value of c: ");
            c = sc.nextInt();

            if (b >= c) {
                System.out.print("Error: b must be less than c. Please enter the values again.");
            }
        } while (b >= c);

        System.out.println("Multiples of " + a + " between  " + b + " and " + c + " are: ");
        for (int i = b; i <= c; i++) {
            if (i % a == 0) {
                System.out.println(i);
            }
        }

    }
}
