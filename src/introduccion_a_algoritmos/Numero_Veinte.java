//Calcule la aproximación de sen x a través de la serie de Tylor

package introduccion_a_algoritmos;

import java.util.Scanner;

public class Numero_Veinte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input for x (in radians)
        System.out.print("Enter the value of x in radians: ");
        double x = sc.nextDouble();

        // Get user input for the number of terms in the Taylor series
        System.out.print("Enter the number of terms: ");
        int terms = sc.nextInt();

        double sum = 0; // Stores the approximation of sin(x)
        double term;    // Stores each term of the series
        int sign = 1;   // Alternates signs (+, -)

        // Loop to calculate the Taylor series expansion
        for (int i = 0; i < terms; i++) {
            int exponent = 2 * i + 1; // Exponent for the current term (1, 3, 5, ...)

            // Compute x^exponent
            double power = 1;
            for (int j = 0; j < exponent; j++) {
                power *= x;
            }

            // Compute factorial of exponent
            double factorial = 1;
            for (int j = 1; j <= exponent; j++) {
                factorial *= j;
            }

            // Compute the term of the Taylor series
            term = (power / factorial) * sign;
            sum += term; // Add term to the sum

            // Alternate the sign for the next term
            sign *= -1;
        }

        // Print the approximation and compare it with the real sin(x) value
        System.out.println("Approximation of sin(" + x + ") with " + terms + " terms: " + sum);
        System.out.println("Real value using Math.sin(x): " + Math.sin(x));

        sc.close(); // Close the Scanner to avoid resource leaks
    }
}
