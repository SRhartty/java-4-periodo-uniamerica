package org.example;

public class ExemploClass {

    private String nome;
    private int idade;

    public ExemploClass(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public ExemploClass(){}

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}
