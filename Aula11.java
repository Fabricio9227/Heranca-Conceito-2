package com.aula06.aula11;

public class Aula11 {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setIdade(22);
        v1.setNome("Juvenal");
        v1.setSexo("M");

        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Fabrício");
    }
}
