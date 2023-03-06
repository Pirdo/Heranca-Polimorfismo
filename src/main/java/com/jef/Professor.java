package com.jef;

public class Professor extends Pessoa {
  
    public Professor(String nome, int idade, String endereco) {
        super(nome, idade, endereco);
    }

    private String matriculaProfessor;
    private String cursoLeciona;

    public static void andar () {
        System.out.println("Andei como professor");
    }
}