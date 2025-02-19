package org.example;


public class Pessoa {


    private String nome;
    private int idade;

    public static void main(String[] args) {
        Pessoa exemplo = new Pessoa("João", 20);
        System.out.println("Nome: " + exemplo.getNome() + "\nIdade: " + exemplo.getIdade());
    }
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(){}

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }
}
