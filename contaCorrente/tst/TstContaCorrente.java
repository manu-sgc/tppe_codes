package contaCorrente.tst;

import contaCorrente.app.ContaCorrente;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TstContaCorrente {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Deposito", 200.0, true, 400.0},
            {"Saque", -100.0, true, 100.0},
            {"Pix", -100.0, true, 100.0},
            {"Pix", 300.0, true, 500.0},
            {"Pix", -300.0, false, 200.0}
        });
    }

    private final String operacao;
    private final double valor;
    private final boolean processada;
    private final double saldoFinal;

    public TstContaCorrente(String operacao, double valor, boolean processada, double saldoFinal) {
        this.operacao = operacao;
        this.valor = valor;
        this.processada = processada;
        this.saldoFinal = saldoFinal;
    }

    @Test
    @Category(Processamento.class)
    public void testProcessamento() throws contaCorrente.exceptions.OperacaoInvalidaException {
        ContaCorrente cc = new ContaCorrente(200.0);
        boolean resultado = cc.processarOperacao(operacao, valor);
        assertEquals(processada, resultado);
        assertEquals(saldoFinal, cc.getSaldo(), 0.01);
    }
}
