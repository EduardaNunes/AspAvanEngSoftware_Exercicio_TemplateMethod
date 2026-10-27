package org.example.templatemethod;

public class AvaliacaoPesoPena extends AvaliacaoPreLuta {

    public String verificarLiberacao() {
        float imc = this.calcularIMC();
        if (imc >= 18.5f && imc < 23.0f) {
            return "Liberado";
        }
        else {
            return "Bloqueado";
        }
    }

}
