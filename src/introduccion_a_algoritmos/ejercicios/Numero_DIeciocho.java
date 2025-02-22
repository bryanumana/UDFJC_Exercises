//Pida un entero positivo y escriba y escriba el número resultante de eliminar los digitos impares

package introduccion_a_algoritmos.ejercicios;

import java.util.Scanner;

public class Numero_DIeciocho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int digits;
        int result = 0;
        int potencia = 1; // Debe empezar en 1, no en 0

        do {
            System.out.print("Enter a positive integer: ");
            n = sc.nextInt();
        } while (n <= 0);

        while (n > 0) {
            digits = n % 10; // Obtiene el último dígito
            if (digits % 2 == 0) {   // Verifica si el dígito es par
                result += digits * potencia; // Agrega el dígito al resultado
                potencia *= 10; // Aumenta la potencia para la siguiente posición
            }
            n /= 10; // Elimina el último dígito
        }

        System.out.println("Even digits extracted: " + result);
        sc.close();
    }
}

