package org.example;

import java.util.Scanner;

public class teste {

    public static void main(String[] args) {
        print();
        scanner();
    }

    public static void print() {

        String nome = "João";
        int age = 20;
        boolean isAlive = true;
        System.out.println("Nome: " + nome + "\nIdade: " + age + "\nEstá vivo: " + isAlive);
        System.out.println(false);
    }

    public static void scanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite sua idade: ");
        int age = scanner.nextInt();
        System.out.println("Digite sua altura: ");
        float altura = scanner.nextFloat();
        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + age);
        System.out.println("Sua altura é: " + altura);

    }
}