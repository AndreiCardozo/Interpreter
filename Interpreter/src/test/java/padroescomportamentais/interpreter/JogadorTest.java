package padroescomportamentais.interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JogadorTest {

    @Test
    void deveCalcularExpressaoComFormula() {
        Jogador jogador = new Jogador();
        jogador.setNota1(2.0);
        jogador.setNota2(5.0);

        assertEquals(9.0, jogador.calcularNota());
    }

}