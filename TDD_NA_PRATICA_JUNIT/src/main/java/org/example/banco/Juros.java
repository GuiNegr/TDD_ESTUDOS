package org.example.banco;

public class Juros {
    private double taxa = 2.00;
    private double capital;

    public double getTaxa(){
        return this.taxa;
    }

    public double calculoJuros(double valor){
        capital = valor * taxa;
        return capital;
    }


}
