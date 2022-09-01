
/*
    - Laboratorio Nro 09 - Ejercicio5: Generar 3 cartas aleatorias de una baraja. Para el palo usar [1..4] y para el número
    usar [1..13].
    Mostrarlas de la siguiente forma:
        Nº Palo Numero
        1 1 13
        2 3 1
        3 2 10
    - Autor: Fiorela Clariza Quispe Quispe
    - Colaboró: 
    - Tiempo: 
*/

public class Ejercicio5 {
    public static void main(String[] args) {
        int palo1, palo2, palo3, num1, num2, num3;
        System.out.println("Bienvenido(a), a continuación se generarán 3 cartas aleatorias");
        palo1 = (int) (Math.random() * (4)) + 1;
        palo2 = (int) (Math.random() * (4)) + 1;
        palo3 = (int) (Math.random() * (4)) + 1;
        num1 = (int) (Math.random() * (13)) + 1;
        num2 = (int) (Math.random() * (13)) + 1;
        num3 = (int) (Math.random() * (13)) + 1;
        System.out.println("N°\tPalo\tNúmero\n1\t" + palo1 + "\t" + num1 + "\n2\t" + palo2 + "\t" + num2 + "\n3\t"
                + palo3 + "\t" + num3);
    }

}