package org.example.banco;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Cliente> clientes = new java.util.ArrayList<>(List.of(
                new Cliente("João", 25, "123.456.789-00"),
                new Cliente("Maria", 30, "987.654.321-00"),
                new Cliente("José", 40, "456.789.123-00")
        ));

        List<Conta> contas = new java.util.ArrayList<>(List.of(
                new Conta(clientes.get(0), 1000.0),
                new Conta(clientes.get(1), 2000.0),
                new Conta(clientes.get(2), 3000.0)
        ));

        System.out.println("Contas:");
        contas.forEach(conta -> {
            System.out.println("Titular: " + conta.getTitular().getNome());
            System.out.println("Saldo: " + conta.getSaldo());
            System.out.println();
        });

        System.out.println("cliente: " + contas.get(0).getTitular().getNome() + " depositou 500.0");
        contas.get(0).depositar(500.0);
        System.out.println("cliente: " + contas.get(1).getTitular().getNome() + " sacou 1000.0");
        contas.get(1).sacar(1000.0);
        System.out.println();

        System.out.println("Contas atualizadas:");
        contas.forEach(conta -> {
            System.out.println("Titular: " + conta.getTitular().getNome());
            System.out.println("Saldo: " + conta.getSaldo());
            System.out.println();
        });

        System.out.println("cliente " + contas.get(0).getTitular().getNome() + " fez um empréstimo de 500.0");
        System.out.println(contas.get(0).emprestimo(500.0));
        System.out.println();

        System.out.println("Delete conta do cliente: " + contas.get(0).getTitular().getNome());
        contas.remove(0);
        System.out.println();

        System.out.println("Delete cliente: " + clientes.get(0).getNome());
        clientes.remove(0);
        System.out.println();


        System.out.println("Contas atualizadas:");
        contas.forEach(conta -> {
            System.out.println("Titular: " + conta.getTitular().getNome());
            System.out.println("Saldo: " + conta.getSaldo());
            System.out.println();
        });

        System.out.println("Clientes atualizados:");
        clientes.forEach(cliente -> {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Idade: " + cliente.getIdade());
            System.out.println();
        });

    }
}
