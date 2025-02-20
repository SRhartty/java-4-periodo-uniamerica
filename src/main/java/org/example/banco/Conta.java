package org.example.banco;

public class Conta {

    private Cliente cliente;
    private double saldo;

    public Conta(Cliente cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public Conta(){}

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public Cliente getTitular() {
        return cliente;
    }

    public String getSaldo() {
        return String.format("R$ %.2f", saldo);
    }

    public String emprestimo(double valor) {
        if (valor <= 0) {
            return "Valor inválido";
        }
        if (valor > saldo * 1.5) {
            return "Valor acima do limite";
        }
        if (valor > saldo) {
            return "Saldo insuficiente";
        }
        saldo -= valor + (valor * 0.1);
        return "Empréstimo realizado";
    }
}
