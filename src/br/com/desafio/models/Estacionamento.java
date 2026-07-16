package br.com.desafio.models;

import java.util.ArrayList;

public class Estacionamento {
    private int vagasTotais;
    private int vagasDisponiveis;
    private int vagasOcupadas;
    private ArrayList<Automovel> carros;

    public Estacionamento(int vagasTotais) {
        this.vagasTotais = vagasTotais;
        this.vagasDisponiveis = vagasTotais;
        this.vagasOcupadas = 0;
        this.carros = new ArrayList();
    }

    public void entradaCarro(Automovel carro) {
        if (this.vagasDisponiveis <= 0) {
            System.out.println("O estacionamento está lotado.");
        } else {
            for (int i = 0; i < this.carros.size(); ++i) {
                if (((Automovel) this.carros.get(i)).getPlaca().equals(carro.getPlaca())) {
                    System.out.println("Este carro já esta estacionado");
                    return;
                }
            }

            this.carros.add(carro);
            --this.vagasDisponiveis;
            ++this.vagasOcupadas;
            System.out.println("Carro registrado");
        }
    }

    public void saidaCarro(Automovel carro) {
        for (int i = 0; i < this.carros.size(); ++i) {
            if (((Automovel) this.carros.get(i)).getPlaca().equals(carro.getPlaca())) {
                this.carros.remove(i);
                --this.vagasOcupadas;
                ++this.vagasDisponiveis;
                return;
            }
        }

        System.out.println("O carro informado não consta no estacionamento");
    }
}