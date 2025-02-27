package org.example;

public class TryCatch {

    public static void main(String[] args) {
        try {
            int[] vetor = new int[4];
            vetor[4] = 10;
            System.out.println("Valor: " + vetor[4]);
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
    }
}
