package triangulo.tst;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class) // indica que a classe é uma suíte de testes
@SuiteClasses({ SteFuncional.class, TesteExcecao.class }) // classes que serão testadas
public class AllTests {

}
