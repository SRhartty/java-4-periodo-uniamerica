package org.example.AtvBanco.Interfaces;

public interface ContaBancaria {
    void sacar(float valor);
    void depostar(float valor);
    float verificarSaldo();
}
