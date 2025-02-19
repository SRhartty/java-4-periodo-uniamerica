package org.example.crud;

public class Juridico extends Cadastro {

    private String cnpj;

    private String nomeFantasia;

    public static void main(String[] args) {
        Juridico exemplo = new Juridico("João", "123.456.789-00", "12.345.678/0001-00");
        System.out.println("Nome: " + exemplo.getNome() + "\nDocumento: " + exemplo.getDocumento() + "\nCNPJ: " + exemplo.getCnpj());
    }

    public Juridico(String nome, String documento, String cnpj) {
        super(nome, documento);
        this.cnpj = cnpj;
    }

    public Juridico(){}

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }
}
