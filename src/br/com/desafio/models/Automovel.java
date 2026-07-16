
package br.com.desafio.models;

public class Automovel {
    private String cor;
    private String placa;
    private String modelo;

    public Automovel(String modelo, String cor, String placa) {
        this.cor = modelo;
        this.placa = cor;
        this.modelo = placa;
    }

    public void exibirFicha() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Placa: " + this.placa);
    }

    public String getCor() {
        return this.cor;
    }

    public String getPlaca() {
        return this.placa;
    }

    public String getModelo() {
        return this.modelo;
    }
}
