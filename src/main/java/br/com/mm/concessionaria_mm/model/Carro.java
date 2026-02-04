package br.com.mm.concessionaria_mm.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "carro")
public class Carro {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int codigo;
    private String cor;
    private String marca;

    public Carro() {}

    public Carro(int codigo, String cor, String marca) {
        this.codigo = codigo;
        this.cor = cor;
        this.marca = marca;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }
}