//Escriba al listado de los primeros n múltiplos de 7, n ingresado por teclado

package introduccion_a_algoritmos;

import java.util.Scanner;

public class Numero_Cuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        int mul = 0;

        for (int i = 1; i <= n; i++) {
            mul = 7 * i;
            System.out.println(i + ". " + mul);
        }
    }
}
