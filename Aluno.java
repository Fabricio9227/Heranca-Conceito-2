package com.aula06.aula11;

public class Aluno extends Pessoa { //"Aluno" é uma HERANÇA PARA DIFERENÇA da classe "Pessoa"
    //Atributos
    private int matricula;
    private String curso;

    //Método
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade do aluno " + this.nome);
    }

    //Acessores
    public int getMatr() {
        return matricula;
    }
    public void setMatr(int matr) {
        this.matricula = matr;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}