//Para un entero positivo ingresado, escriba el listado de todos sus divisores
package introduccion_a_algoritmos.ejercicios;

import java.util.Scanner;

public class Numero_Nueve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int div = 0;

        do {
            System.out.print("Enter a positive integer: ");
            n = sc.nextInt();
        } while (n <= 0);

        for(int i = 1; i <= n; i++) {
            div = n % i;
            if(div == 0){
                System.out.println(i);
            }
        }
    }
}
