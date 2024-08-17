package com.aula11;

public class Professor extends Pessoa {
    //Atributos
    
    protected String especialidade;
    protected float salário;

    //Método

    public void receberAum(float aum) {
        this.salário = salário + aum;
    }

   //Acessores getters e setters

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalário() {
        return salário;
    }

    public void setSalário(float salário) {
        this.salário = salário;
    }

 
    
}
