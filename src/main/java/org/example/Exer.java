package org.example;

import java.util.*;

public class Exer {

    public static void main(String[] args) {
        System.out.println("nameList:");
        nameList();
        System.out.println("\nhashSetNumeros:");
        hashSetNumeros();
        System.out.println("\nmapAlunos:");
        mapAlunos();
    }

    public static void nameList() {
        List<String> names = new java.util.ArrayList<>();
        names.add("João");
        names.add("Maria");
        names.remove("Maria");
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void hashSetNumeros() {
        Set<Integer> numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(4);
        numeros.add(4);
        numeros.add(5);
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }

    public static void mapAlunos() {
        Map<String, Integer> alunos = new HashMap<>();

        alunos.put("João", 20);
        alunos.put("Maria", 18);
        alunos.put("Pedro", 15);

        String alunoBuscado = "Maria";
        if (alunos.containsKey(alunoBuscado)) {
            System.out.println("Nota de " + alunoBuscado + ": " + alunos.get(alunoBuscado));
            return;
        }
        System.out.println(alunoBuscado + " não encontrado.");
    }
}
