package com.aula06.aula11;

public class Bolsista extends Aluno { //Bolsista é uma ESPECIALIZAÇÃO  de "Aluno", porntanto, herda todas os atributos e métodos de "Aluno" e de tabela, também herda da superclasse "Pessoa"
    //Atributos
    private int bolsa;

    //Método
    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.nome);
    }

    @Override //Permite escrever o mesmo método para uma subclasse com uma funcionalidade diferente da primeira 
    public void pagarMensalidade() {
        System.out.println(this.nome + " é bolsista! Pagamento facilitado");
    }    
    
    //Acessores
    public int getBolsa() {
        return bolsa;
    }
    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
}