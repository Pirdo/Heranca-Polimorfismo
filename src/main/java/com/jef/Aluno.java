package com.jef;

public class Aluno extends Pessoa {

    public Aluno(String nome, int idade, String endereco) {
        super(nome, idade, endereco);
    }
    private String matriculaAluno;
    private String cursoEstuda;

    public static void andar () {
        System.out.println("Andei como aluno");
    }
}