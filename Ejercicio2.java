
/*
 * Laboratorio Nro 09 - Ejercicio2: Ingresar un valor de un ángulo en grados y mostrar su seno, coseno, tangente, cotangente, secante y cosecante. Modo gráfico.
 * Autor: Fiorela Clariza Quispe Quispe
 * Colaboró: 
 * Tiempo: 

 */
import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        double anguloGrados, sen, cos, tg, ctg, sec, csc; // Las variables

        // Obteniendo el ángulo
        anguloGrados = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de un ángulo en grados:"));
        // Conversión a radian y el calculo de las razones trigonometricas
        sen = (double) Math.round(Math.sin(Math.toRadians(anguloGrados)) * 100) / 100;
        cos = (double) Math.round(Math.cos(Math.toRadians(anguloGrados)) * 100) / 100;
        tg = (double) Math.round(Math.tan(Math.toRadians(anguloGrados)) * 100) / 100;
        ctg = (double) Math.round(Math.pow(Math.tan(Math.toRadians(anguloGrados)), -1) * 100) / 100;
        sec = (double) Math.round(Math.pow(Math.cos(Math.toRadians(anguloGrados)), -1) * 100) / 100;
        csc = (double) Math.round(Math.pow(Math.sin(Math.toRadians(anguloGrados)), -1) * 100) / 100;
        // Salida
        JOptionPane.showMessageDialog(null,
                "Razones trigonométricas del ángulo ingresado: " + anguloGrados + "\nSeno: " + sen + "\nCoseno: " + cos
                        + "\nTangente: " + tg + "\nCotangente: " + ctg + "\nSecante: " + sec + "\nCosecante: " + csc);
    }

}