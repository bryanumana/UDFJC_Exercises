//Escriba el listado de números del 15 al 32 en forma ascendente, luego en forma descendente

package introduccion_a_algoritmos.ejercicios;

public class Numero_Uno {
    public static void main(String[] args) {
        System.out.println("Ascending form: ");
        for (int i = 15; i <= 32; i++) {
            System.out.println(i);
        }

        System.out.println("\n" + "Descending form: ");
        for (int i = 32; i >= 15; i--) {
            System.out.println(i);
        }
    }
}
