package triangulo.tst;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

// suite de testes que agrupa todos os testes funcionais
@RunWith(Categories.class)
@SuiteClasses({ AreaPerimetro.class }) // classes que serão testadas
@IncludeCategory(Funcional.class)
public class SteFuncional {

}
