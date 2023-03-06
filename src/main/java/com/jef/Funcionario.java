package com.jef;

public class Funcionario extends Pessoa {
 
    public Funcionario(String nome, int idade, String endereco) {
        super(nome, idade, endereco);
    }

    private String matriculaFuncionario;
    private String funcaoExecuta;

    public static void andar () {
        System.out.println("Andei como funcionario");
    }
}