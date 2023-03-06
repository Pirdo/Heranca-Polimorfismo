package com.jef;

public class Pessoa {
    private String nome;
    private int idade;
    private String endereco;

    public static void andar () {
        System.out.println("Andei");
    }

    public Pessoa (String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }
}