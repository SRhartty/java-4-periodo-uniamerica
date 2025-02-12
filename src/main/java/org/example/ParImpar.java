package org.example;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();
        System.out.println("O número " + numero + " é " + (numero % 2 == 0 ? "par" : "ímpar"));
    }
}
