// Pida al usuario ingresar números, termine cuando haya ingresar 5 números pares;
// cacule y escriba la suma de los 5 pares

package introduccion_a_algoritmos;

import java.util.Scanner;

public class Numero_Cinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int suma = 0;
        int n;

        System.out.println("Enter five even numbers: ");
        do {
            System.out.print("Enter even number: ");
            n = sc.nextInt();
            if (n % 2 == 0) {
                counter++;
                suma += n;
            }
        } while (counter < 5);

        System.out.println("The sum of the even numbers is: " + suma);
    }
}
