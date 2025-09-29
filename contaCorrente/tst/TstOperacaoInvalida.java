package contaCorrente.tst;

import contaCorrente.app.ContaCorrente;
import contaCorrente.exceptions.OperacaoInvalidaException;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class TstOperacaoInvalida {
    @Test(expected = OperacaoInvalidaException.class)
    @Category(Excecao.class)
    public void testDepositoNegativo() throws OperacaoInvalidaException {
        ContaCorrente cc = new ContaCorrente(200.0);
        cc.processarOperacao("Deposito", -300.0);
    }

    @Test(expected = OperacaoInvalidaException.class)
    @Category(Excecao.class)
    public void testSaquePositivo() throws OperacaoInvalidaException {
        ContaCorrente cc = new ContaCorrente(200.0);
        cc.processarOperacao("Saque", 200.0);
    }
}
