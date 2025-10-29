package org.example.Cliente;

public class CarroAlugado {
    private AlugaCarro aLugaCarro;

    public CarroAlugado(AlugaCarro aLugaCarro){
        this.aLugaCarro = aLugaCarro;
    }

    public AlugaCarro getaLugaCarro() {
        return aLugaCarro;
    }

    public void setaLugaCarro(AlugaCarro aLugaCarro) {
        this.aLugaCarro = aLugaCarro;
    }
}
