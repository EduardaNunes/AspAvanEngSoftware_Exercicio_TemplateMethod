package templatemethod;

import org.example.templatemethod.AvaliacaoPesoPesado;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AvaliacaoPesoPesadoTest {

    @Test
    void deveLiberarComMesmoCorpoQueBloqueariaNoPesoPena() {
        AvaliacaoPesoPesado avaliacao = new AvaliacaoPesoPesado();
        avaliacao.setPeso(23.0f);
        avaliacao.setAltura(1.0f);
        assertEquals("Liberado", avaliacao.verificarLiberacao());
    }

    @Test
    void deveBloquearComImcMuitoAcimaDaFaixa() {
        AvaliacaoPesoPesado avaliacao = new AvaliacaoPesoPesado();
        avaliacao.setPeso(31.0f);
        avaliacao.setAltura(1.00f);
        assertEquals("Bloqueado", avaliacao.verificarLiberacao());
    }

    @Test
    void deveRetornarInformacoes() {
        AvaliacaoPesoPesado avaliacao = new AvaliacaoPesoPesado();
        avaliacao.setPeso(70.0f);
        avaliacao.setAltura(1.65f);
        avaliacao.setNome("Miguel");
        assertEquals("Avaliação Peso Pesado{nome=Miguel, resultado=Liberado}", avaliacao.getInfo());
    }
}
