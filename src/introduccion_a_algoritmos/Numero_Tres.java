//Para el ejercicio Numero_Dos calcular la suma de los números del listado

package introduccion_a_algoritmos;

import java.util.Scanner;

public class Numero_Tres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int a = sc.nextInt();
        System.out.print("Enter a integer: ");
        int b = sc.nextInt();

        int sum = 0;

        if (a < b) {
            for (int i = a; i <= b; i++) {
                sum = sum + i;
            }
            System.out.println("The sum is: " + sum);
        } else {
            for (int i = b; i <= a; i++) {
                sum = sum + i;
            }
            System.out.println("The sum is: " + sum);
        }
    }
}
