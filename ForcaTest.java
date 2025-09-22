import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ForcaTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {'a', 3, "a*a*a"},
                {'r', 2, "*r*r*"},
                {'b', 0, "*****"}
        });
    }

    private final char caractere;
    private final int ocorrencias;
    private final String revelada;
    private final Forca forca = new Forca("arara");

    public ForcaTest(char caractere, int ocorrencias, String revelada) {
        this.caractere = caractere;
        this.ocorrencias = ocorrencias;
        this.revelada = revelada;
    }

    @Test
    @Category(Funcional.class)
    public void testRevelarCaractere() {
        assertEquals(ocorrencias, forca.contarOcorrencias(caractere));
        assertEquals(revelada, forca.revelar(caractere));
    }

    @Test(expected = CaractereInvalidoException.class)
    @Category(Excecao.class)
    public void testCaractereInvalido() {
        forca.revelar('\0');
    }
}

// Categorias
interface Funcional {}
interface Excecao {}
