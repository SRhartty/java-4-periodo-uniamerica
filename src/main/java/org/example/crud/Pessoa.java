package org.example.crud;

public class Pessoa extends Cadastro {

    private int idade;

    public static void main(String[] args) {
        Pessoa exemplo = new Pessoa("João", "123.456.789-00", 20);
        System.out.println("Nome: " + exemplo.getNome() + "\nDocumento: " + exemplo.getDocumento() + "\nIdade: " + exemplo.getIdade());
    }

    public Pessoa(String nome, String documento, int idade) {
        super(nome, documento);
        this.idade = idade;
    }

    public Pessoa(){}

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }
}
