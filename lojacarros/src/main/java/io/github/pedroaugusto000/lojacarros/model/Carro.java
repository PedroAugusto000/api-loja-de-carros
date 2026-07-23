package io.github.pedroaugusto000.lojacarros.model;

import jakarta.persistence.Entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Carro {

    private UUID id;
    private String marca;
    private String modelo;
    private Integer ano;
    private BigDecimal preco;
    private String cor;
    private Integer quilometragem;
    private Combustivel combustivel;
    private Cambio cambio;
    private Boolean disponivel;
    private LocalDate dataCadastro;

    enum Combustivel {
        FLEX,
        GASOLINA,
        ETANOL,
        DIESEL,
        ELETRICO,
        HIBRIDO
    }

    enum Cambio {
        MANUAL,
        AUTOMATICO,
        CVT
    }

    // Construtor padrão
    public Carro() {}

    // Construtor completo
    public Carro(UUID id, String marca, String modelo, Integer ano, BigDecimal preco, String cor, Integer quilometragem, Combustivel combustivel, Cambio cambio, Boolean disponivel, LocalDate dataCadastro) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
        this.cor = cor;
        this.quilometragem = quilometragem;
        this.combustivel = combustivel;
        this.cambio = cambio;
        this.disponivel = disponivel;
        this.dataCadastro = dataCadastro;
    }

    // Construtor de cadastro

    public Carro(String marca, String modelo, Integer ano, BigDecimal preco, String cor, Integer quilometragem, Combustivel combustivel, Cambio cambio) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
        this.cor = cor;
        this.quilometragem = quilometragem;
        this.combustivel = combustivel;
        this.cambio = cambio;
    }
}
