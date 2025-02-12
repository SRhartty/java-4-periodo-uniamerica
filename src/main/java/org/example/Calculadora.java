package org.example;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double numero1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite o segundo número: ");
        double numero2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite a operação (+, -, *, /): ");
        String operacao = scanner.nextLine();
        double resultado = 0;
        switch (operacao) {
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            case "/":
                resultado = numero1 / numero2;
                break;
            default:
                System.out.println("Operação inválida");
                System.exit(1);
        }

        if (resultado % 1 == 0) {
            System.out.println("Resultado: " + (int) resultado);
        } else {
            System.out.println("Resultado: " + resultado);
        }
    }
}