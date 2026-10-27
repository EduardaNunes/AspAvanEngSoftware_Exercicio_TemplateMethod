package templatemethod;

import org.example.templatemethod.AvaliacaoPesoPena;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AvaliacaoPesoPenaTest {

    @Test
    void deveLiberarComImcDentroDaFaixa() {
        AvaliacaoPesoPena avaliacao = new AvaliacaoPesoPena();
        avaliacao.setPeso(18.5f);
        avaliacao.setAltura(1.0f);
        assertEquals("Liberado", avaliacao.verificarLiberacao());
    }

    @Test
    void deveBloquearComImcAcimaDaFaixa() {
        AvaliacaoPesoPena avaliacao = new AvaliacaoPesoPena();
        avaliacao.setPeso(23.0f);
        avaliacao.setAltura(1.0f);
        assertEquals("Bloqueado", avaliacao.verificarLiberacao());
    }

    @Test
    void deveRetornarInformacoes() {
        AvaliacaoPesoPena avaliacao = new AvaliacaoPesoPena();
        avaliacao.setPeso(62.0f);
        avaliacao.setAltura(1.77f);
        avaliacao.setNome("Duda");
        assertEquals("Avaliação Padrão{nome=Duda, resultado=Liberado}", avaliacao.getInfo());
    }
}
