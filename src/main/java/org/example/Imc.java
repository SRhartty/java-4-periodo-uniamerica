package org.example;

import java.util.Scanner;

public class Imc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();
        //double imc = peso / (altura * altura);
        double imc = peso / Math.pow(altura, 2);
        if (imc < 19.1){
            System.out.println("Abaixo do peso");
        } else if (imc < 25.8){
            System.out.println("Peso normal");
        } else if (imc < 27.3){
            System.out.println("Marginalmente acima do peso");
        } else if (imc < 32.3){
            System.out.println("Acima do peso");
        } else {
            System.out.println("Obeso");
        }
    }
}
