package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite quantos numeros tera sua lista: ");
        int n = scanner.nextInt();
        List<Integer> lista = new ArrayList<>();
        System.out.println("Digite os numeros: ");
        for (int i = 0; i < n; i++) {
            lista.add(scanner.nextInt());
        }
        System.out.println(lista);

        int media = 0;
        for (Integer integer : lista) {
            media += integer;
        }
        media /= lista.size();
        System.out.println("Media: " + media);

        double desvioPadrao = 0;
        for (Integer integer : lista) {
            desvioPadrao += Math.pow(integer - media, 2);
        }
        desvioPadrao = desvioPadrao / lista.size();
        System.out.println("Desvio padrão: " + desvioPadrao);

        int maior = lista.get(0);
        for (Integer integer : lista) {
            if (integer > maior) {
                maior = integer;
            }
        }
        System.out.println("Maior: " + maior);

        int menor = lista.get(0);
        for (Integer integer : lista) {
            if (integer < menor) {
                menor = integer;
            }
        }
        System.out.println("Menor: " + menor);
    }
}
