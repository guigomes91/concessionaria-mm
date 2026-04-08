package br.com.mm.concessionaria_mm.model;

import jakarta.persistence.*;

@Entity(name = "carro")
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carro_seq")
    @SequenceGenerator(
            name = "carro_seq",
            sequenceName = "carro_sequence",
            allocationSize = 1
    )
    private Long codigo;

    private String cor;
    private String marca;
    private String transactionId;

    public Carro() {}

    public Carro(String cor, String marca) {
        this.cor = cor;
        this.marca = marca;
    }

    public Long getCodigo() {
        return codigo;
    }

    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}