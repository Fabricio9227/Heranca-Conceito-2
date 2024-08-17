package com.aula11;

public class Técnico extends Aluno {
    //Atributo

    protected int registroProfissional;

    //Método

    public void praticar() {
        System.out.println("Praticando..");
    }

    //Acessores getters e setters

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
}
