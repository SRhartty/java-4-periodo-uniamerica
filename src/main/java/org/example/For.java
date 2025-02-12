package org.example;

public class For {

    public static void main(String[] args) {
        whileLoop();
        doWhileLoop();
        forEach();
        forLoop();
    }

    public static  void whileLoop() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }

    public static void doWhileLoop() {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 10);
    }

    public static void forEach() {
        int[] numeros = {1, 2, 3, 4, 5};
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }

    public static void forLoop() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
