package org.example.templatemethod;

public class AvaliacaoPesoPesado extends AvaliacaoPreLuta {

    public String verificarLiberacao() {
        float imc = this.calcularIMC();
        if (imc >= 23f && imc <= 30.0f) {
            return "Liberado";
        }
        else {
            return "Bloqueado";
        }
    }

    @Override
    public String getTipoAvaliacao() {
        return "Avaliação Peso Pesado";
    }
}