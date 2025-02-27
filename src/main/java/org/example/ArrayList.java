package org.example;

import java.util.*;

public class ArrayList {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public static void listaNomes(){
        List<String> nomes = new java.util.ArrayList<>();
        nomes.add("João");
        nomes.add("Maria");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

    public static void map(){
        Map<String, String> pessoa = new HashMap<>();
        pessoa.put("nome", "João");
        pessoa.put("idade", "20");
        System.out.println(pessoa.get("nome"));
        System.out.println(pessoa.get("idade"));
    }

    public static void set(){
       Set<String> nomes = new HashSet<>();
       nomes.add("João");
       nomes.add("Maria");
       System.out.println(nomes);
    }
}
