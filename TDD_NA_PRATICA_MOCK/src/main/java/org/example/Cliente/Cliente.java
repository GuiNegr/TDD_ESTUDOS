package org.example.Cliente;

public class Cliente implements AlugaCarro{
    private String nomeCliente;
    private String modeloCarro;


    @Override
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    @Override
    public void setModeloCarro(String nomeCarro) {
        this.modeloCarro = nomeCarro;
    }

    @Override
    public String getNomeCliente() {
        return this.modeloCarro;
    }

    @Override
    public String getModeloCarro() {
        return this.nomeCliente;
    }
}
