package triangulo.tst;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import triangulo.app.Triangulo;
import triangulo.exceptions.NaoEhTrianguloException;

@RunWith(Parameterized.class) // o teste será rodado varias vezes com parâmetros diferentes
public class TesteExcecao {

	//Criar os atributos do objeto de teste
	int a, 
	    b, 
	    c;
	Triangulo t;
	
	@Parameters // parâmetros que serão testados que não formam um triangulo
	public static Collection<Object[]> getParameters() {
		Object[][] parametros = new Object[][] {
			{4, 5, 12},
			{2, 3, 6},
			{1, 1, 3}
		};
		return Arrays.asList(parametros);
	}
	
	public TesteExcecao(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	@Before
	public void setup() {
		t = new Triangulo(a, b, c); // cria uma instancia do triangulo com os lados a, b e c
	}
	
	@Test(expected=NaoEhTrianguloException.class) // o teste passa apenas se a exceção esperada for lançada
	@Category(Excecao.class) // pertence à categoria de teste "Excecao"
	public void test() throws NaoEhTrianguloException {
		t.ehTriangulo();
	}

}
