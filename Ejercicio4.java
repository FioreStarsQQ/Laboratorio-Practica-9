
/*
    - Laboratorio Nro 09 - Ejercicio4: Ingresar 2 puntos en el plano cartesiano (valores enteros), cada uno será el centro 
    de un círculo de un radio cualquiera, ingresar los radios de ambos. Calcular la suma de las áreas de ambos círculos, 
    la suma de las áreas de los cuadrados que los circunscriben, la distancia entre los centros de los círculos. Modo gráfico.
    - Autor: Fiorela Clariza Quispe Quispe
    - Colaboró: 
    - Tiempo: 
*/
import javax.swing.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        String punto1, punto2; // Las variables
        int punto1x, punto1y, punto2x, punto2y, radio1, radio2, areaCuadrado1, areaCuadrado2, sumaAreaCuadrados;
        double areaCirculo1, areaCirculo2, sumaAreaCirculos, distanciaPuntos;

        // Obteniendo valores del punto 1 y 2
        punto1 = JOptionPane.showInputDialog("Ingrese el primer punto en el plano cartesiano:\nEjemplo: (2,6)");
        punto2 = JOptionPane.showInputDialog("Ingrese el segundo punto en el plano cartesiano:\nEjemplo: (2,6)");
        radio1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el radio para formar el primer círculo:"));
        radio2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el radio para formar el segundo círculo:"));
        // Extrayendo los valores x e y del punto 1 y 2
        punto1x = Integer.parseInt(punto1.substring(1, punto1.indexOf(",")));
        punto1y = Integer.parseInt(punto1.substring(punto1.indexOf(",") + 1, punto1.length() - 1));
        punto2x = Integer.parseInt(punto2.substring(1, punto2.indexOf(",")));
        punto2y = Integer.parseInt(punto2.substring(punto2.indexOf(",") + 1, punto2.length() - 1));
        // Áreas, suma de áreas y distancia entre los puntos centro de círculos
        areaCirculo1 = Math.PI * Math.pow(radio1, 2);
        areaCirculo2 = Math.PI * Math.pow(radio2, 2);
        sumaAreaCirculos = (double) Math.round((areaCirculo1 + areaCirculo2) * 100) / 100;
        areaCuadrado1 = (int) Math.pow((radio1 * 2), 2);
        areaCuadrado2 = (int) Math.pow((radio2 * 2), 2);
        sumaAreaCuadrados = areaCuadrado1 + areaCuadrado2;
        distanciaPuntos = (double) Math
                .round(Math.sqrt(Math.pow(punto2x - punto1x, 2) + Math.pow(punto2y - punto1y, 2)) * 100) / 100;
        // Salida de los resultados
        JOptionPane.showMessageDialog(null,
                "Los puntos tomados como centro de dos círculos fueron: " + punto1 + " y " + punto2+"\nLos radios ingresados fueron: "
                        + radio1 + " y " + radio2 + "\nLa suma de las áreas es: " + sumaAreaCirculos
                        + " unidades cuadradas.\nLa suma de las áreas de los cuadrados que los circunscriben es: "
                        + sumaAreaCuadrados + " unidades cuadradas.\nLa distancia entre los centros de los círculos es: " 
                        + distanciaPuntos + " unidades.");
    }

}