package org.example.crud;

public class Cadastro {

    private String nome;
    private String documento;

    public static void main(String[] args) {
        Cadastro exemplo = new Cadastro("João", "123.456.789-00");
        System.out.println("Nome: " + exemplo.getNome() + "\nDocumento: " + exemplo.getDocumento());
    }

    public Cadastro(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }
    public Cadastro(){}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getDocumento() {
        return documento;
    }
}
