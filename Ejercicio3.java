
/*
    - Laboratorio Nro 09 - Ejercicio3: Ingresar 2 puntos en el plano cartesiano (valores dobles) y generar 3 puntos aleatorios que
    deben pertenecer al rectángulo generado por los 2 puntos ingresados (al borde o dentro).
    Generar la siguiente tabla:
            Nº Punto Distancia al origen
            1 (-1,1) 1.4142
            2 (3,-4) 5
            3 (-3,-3) 4.2426
    - Autor: Fiorela Clariza Quispe Quispe
    - Colaboró: 
    - Tiempo: 
*/
import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        String punto1, punto2;
        double punto1x, punto1y, punto2x, punto2y, x1, y1, x2, y2, x3, y3, distanciaOrigen1, distanciaOrigen2,
                distanciaOrigen3; // Las variables

        // Obteniendo valores del rango
        punto1 = JOptionPane.showInputDialog("Ingrese el primer punto en el plano cartesiano:\nEjemplo: (2.5,6)");
        punto2 = JOptionPane.showInputDialog("Ingrese el segundo punto en el plano cartesiano:\nEjemplo: (2.5,6)");
        // Econtrando los valores x e y del punto 1 y 2
        punto1x = Double.parseDouble(punto1.substring(1, punto1.indexOf(",")));
        punto1y = Double.parseDouble(punto1.substring(punto1.indexOf(",") + 1, punto1.length() - 1));
        punto2x = Double.parseDouble(punto2.substring(1, punto2.indexOf(",")));
        punto2y = Double.parseDouble(punto2.substring(punto2.indexOf(",") + 1, punto2.length() - 1));
        // Seleccionando las coordenadas al azar
        x1 = (double) Math.round(((Math.random() * (punto2x - punto1x + 1)) + punto1x) * 100) / 100; // Coordenada x1
        y1 = (double) Math.round(((Math.random() * (punto2y - punto1y + 1)) + punto1y) * 100) / 100; // Coordenada y1
        x2 = (double) Math.round(((Math.random() * (punto2x - punto1x + 1)) + punto1x) * 100) / 100; // Coordenada x2
        y2 = (double) Math.round(((Math.random() * (punto2y - punto1y + 1)) + punto1y) * 100) / 100; // Coordenada y2
        x3 = (double) Math.round(((Math.random() * (punto2x - punto1x + 1)) + punto1x) * 100) / 100; // Coordenada x3
        y3 = (double) Math.round(((Math.random() * (punto2y - punto1y + 1)) + punto1y) * 100) / 100; // Coordenada y3
        // Distancias al origen
        distanciaOrigen1 = (double) Math.round(Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2)) * 100) / 100;
        distanciaOrigen2 = (double) Math.round(Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2)) * 100) / 100;
        distanciaOrigen3 = (double) Math.round(Math.sqrt(Math.pow(x3, 2) + Math.pow(y3, 2)) * 100) / 100;
        // Salida de los 2 puntos en el plano: (x1,y1) (x2,y2)
        JOptionPane.showMessageDialog(null, "El rango establecido fue entre " + punto1 + " y " + punto2
                + "\nN°\t    Punto\t        Distancia al origen\n1\t     (" + x1 + "," + y1 + ")\t    "
                + distanciaOrigen1 + "\n2\t     (" + x2 + "," + y2 + ")\t    " + distanciaOrigen2 + "\n3\t     (" 
                + x3 + "," + y3 + ")\t    " + distanciaOrigen3);
    }

}