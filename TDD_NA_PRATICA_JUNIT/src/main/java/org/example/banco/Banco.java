package org.example.banco;

public class Banco {
    private double debito = 1000.0;
    private double deitoPendente;

    public double saldoDivida(double valorPago){
        deitoPendente = debito - valorPago;
        return  deitoPendente;
    }
}
