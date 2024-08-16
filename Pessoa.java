package com.aula06.aula11;

 public abstract class Pessoa {//Por conta de ser uma classe abstrata, ela não pode ter "filhos/subclasses" e nem gerar/instanciar objetos no programa principal
    protected String nome; //Atributos em "protected" permitem que apenas "filhos" dessa classe "mãe" acessem esse atributo diretamente, sem o uso dos "getters"
    protected int idade;
    protected String sexo;
     
    //Método final
    final void fazerAniver() {//Este método não pode ser sobrescrito por subclasses e não pode ter subclasses, ou seja, não pode ter filhos
        this.idade++;
    }

    //Métodos Acessores
    public String getNome() {
        return nome;
    }
    public void setNome(String no) {
        this.nome = no;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int id) {
        this.idade = id;
    }
    public String getsexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Dados{" + " nome = " + nome + ", idade = " + idade + ", sexo = " + sexo+ "}";
    }
}
