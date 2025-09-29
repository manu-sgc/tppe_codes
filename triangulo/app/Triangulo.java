package triangulo.app;

import triangulo.exceptions.NaoEhTrianguloException;

public class Triangulo {

	private int a; // atributos // private porque só podem ser acessados dentro da classe
	private int b;
	private int c;

	public Triangulo(int a, int b, int c) {
		this.a = a; // define os atributos como parametros para serem usados
		this.b = b; 
		this.c = c;
	}

	public int calcularArea() {
		return a * b / 2 ;
	}

	public int calcularPerimetro() {
		return a + b + c;
	}

	public boolean ehTriangulo() throws NaoEhTrianguloException { // se ehTriangulo for falso, lança a exceção
		boolean ehTriangulo = (a >= Math.abs(b-c) && a <= Math.abs(b+c)) &&
						   (b >= Math.abs(a-c) && b <= Math.abs(a+c)) &&
						   (c >= Math.abs(a-b) && c <= Math.abs(a+b));
		if (!ehTriangulo)
			throw new NaoEhTrianguloException();
		return ehTriangulo;
	}

}