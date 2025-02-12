package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {

    public static void main(String[] args) {
        matriz2();
    }

    public static void array() {
        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }

    public static void matriz() {
        int[][] matriz = new int[2][2];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[1][0] = 3;
        matriz[1][1] = 4;
        for (int[] ints : matriz) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }
    }

    public static void matriz2() {
        int[][] matriz = {{1, 3}, {2, 4}};
        Arrays.stream(matriz).forEach(
                x -> Arrays.stream(x).forEach(System.out::println)
        );
    }

    public static void lista() {
        List<String> numeros = new ArrayList<>();
        numeros.add("um");
        System.out.println(numeros.get(0));
    }
}
