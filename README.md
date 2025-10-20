# tppe_codes

para compilar:
	1)Exceções: javac -d out exceptions\CaractereInvalidoException.java  
	2)App: javac -d out -cp "out" app\Forca.java
	3)Testes: javac -d out -cp "out;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" tst\*.java
            

para rodar os testes: java -cp "out;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore jogoDaForca.tst.AllTests
