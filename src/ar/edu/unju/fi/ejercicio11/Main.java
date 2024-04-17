package ar.edu.unju.fi.ejercicio11;

public class Main {
    public static void main(String[] args) {
        int j = 40;
        int i = 2;

        for (; i <= 20; i++) {
            System.out.print(j + " ");
            j -= 37;
        }

        for (; i <= 40; i++) {
            System.out.print(j + " ");
            j += 5;
        }

        System.out.println(); // Imprimir nueva línea al final
    }
}
