//Elaborar una clase POLINOMIO que modele los polinomios grado dos
//implementando al menos las operaciones de suma
//Y producto por un número
//Realizar una función amiga que sume dos polinomios
//Y lo guarde como un tercer polinomio

package programacion_orientada_a_objetos.parcial_segundo_punto;

class Polinomio {
    private double a, b, c; // Coeficientes del polinomio ax^2 + bx + c

    // Constructor
    public Polinomio(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Método para sumar otro polinomio
    public Polinomio sumar(Polinomio otro) {
        return new Polinomio(this.a + otro.a, this.b + otro.b, this.c + otro.c);
    }

    // Método para multiplicar el polinomio por un número
    public Polinomio multiplicarPorNumero(double numero) {
        return new Polinomio(this.a * numero, this.b * numero, this.c * numero);
    }

    // Método para mostrar el polinomio
    public void mostrar() {
        System.out.println(a + "x^2 + " + b + "x + " + c);
    }

    // Función amiga (método estático) para sumar dos polinomios
    public static Polinomio sumarPolinomios(Polinomio p1, Polinomio p2) {
        return new Polinomio(p1.a + p2.a, p1.b + p2.b, p1.c + p2.c);
    }

    public static void main(String[] args) {
        Polinomio p1 = new Polinomio(2, 3, 4);
        Polinomio p2 = new Polinomio(1, -2, 5);

        System.out.println("Polinomio 1:");
        p1.mostrar();
        System.out.println("Polinomio 2:");
        p2.mostrar();

        Polinomio suma = Polinomio.sumarPolinomios(p1, p2);
        System.out.println("Suma de los polinomios:");
        suma.mostrar();

        Polinomio producto = p1.multiplicarPorNumero(3);
        System.out.println("Polinomio 1 multiplicado por 3:");
        producto.mostrar();
    }
}
