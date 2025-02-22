//En un campo de prueba de proyectiles se dibujaron 2 círculos: C1, C2
//y se registraron en su centro coordenadas cartesianas y su radio.
//No tenemos información respecto si los círculos tienen intersección o no.
//El lanza un proyectíl y el dispositivo GPS que lleva incorporado
//registra y envía al centro de comando las coordenadas cartesianas del punto P en dónde cayó.
//Queremos un programa orientado a objetos que nos permita determinar si el proyectil:
//Si el proyectil cayó sobre C1
//Si el proyectil cayó sobre C2
//Si el proyectil cayó sobre C1 y C2
//Si el proyectil no cayó en ningún círculo
//Adicionalmente se debe pintar cada círculo de un color diferente para diferenciarlos.

package programacion_orientada_a_objetos.parcial_primer_punto;

import javax.swing.*;
import java.awt.*;

class Circulo {
    private int x, y, radio;
    private Color color;

    public Circulo(int x, int y, int radio, Color color) {
        this.x = x;
        this.y = y;
        this.radio = radio;
        this.color = color;
    }

    public boolean contienePunto(int px, int py) {
        double distancia = Math.sqrt(Math.pow(px - x, 2) + Math.pow(py - y, 2));
        return distancia <= radio;
    }

    public void dibujar(Graphics g) {
        g.setColor(color);
        g.fillOval(x - radio, y - radio, radio * 2, radio * 2);
    }
}

class Proyectil {
    private int x, y;

    public Proyectil(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String evaluarImpacto(Circulo c1, Circulo c2) {
        boolean enC1 = c1.contienePunto(x, y);
        boolean enC2 = c2.contienePunto(x, y);

        if (enC1 && enC2) {
            return "El proyectil cayó en ambos círculos.";
        } else if (enC1) {
            return "El proyectil cayó en C1.";
        } else if (enC2) {
            return "El proyectil cayó en C2.";
        } else {
            return "El proyectil no cayó en ningún círculo.";
        }
    }

    public void dibujar(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillOval(x - 3, y - 3, 6, 6);
    }
}

public class Simulacion extends JPanel {
    private Circulo c1 = new Circulo(400, 200, 100, Color.BLUE);
    private Circulo c2 = new Circulo(400, 200, 80, Color.RED);
    private Proyectil p = new Proyectil(250, 200);

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        c1.dibujar(g);
        c2.dibujar(g);
        p.dibujar(g);
    }

    public static void main(String[] args) {
        Simulacion panel = new Simulacion();
        JFrame frame = new JFrame("Simulación de Proyectil");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.add(panel);
        frame.setVisible(true);

        System.out.println(panel.p.evaluarImpacto(panel.c1, panel.c2));
    }
}
