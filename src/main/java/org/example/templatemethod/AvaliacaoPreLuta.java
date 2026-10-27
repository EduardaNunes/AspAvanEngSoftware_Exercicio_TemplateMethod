package org.example.templatemethod;

public abstract class AvaliacaoPreLuta {

    protected String nome;
    private float peso;
    private float altura;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float calcularIMC() {
        return this.peso / (this.altura * this.altura);
    }

    public abstract String verificarLiberacao();

    public String getTipoAvaliacao() {
        return "Avaliação Padrão";
    }

    public String getInfo() {
        return getTipoAvaliacao() + "{" +
                "nome=" + this.nome +
                ", resultado=" + this.verificarLiberacao() +
                '}';
    }
}
