package TesteCalculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import FontesCalculadora.CalculadoraAritimetica;

public class CalculadoraTeste {

	private static int contador = 1;
	private String nomeTeste = "";
	private double resultadoReal;

	@Before
	public void abrirTeste() {
		System.out.println("Iniciando o teste numero: " + contador);
	}

	@After
	public void fecharTeste() {
		System.out.println("Teste " + nomeTeste);
		System.out.println("RESULTADO: " + resultadoReal);
		System.out.println("Finalizado Teste: " + contador + "\n");

		contador++;
	}

	/**
	 * 
	 * Teste de somar na Calculadora.
	 * 
	 */

	@Test
	public void testeSomar5e5() {
		nomeTeste = "testeSomar5e5";
		double nro1 = 5;

		double nro2 = 5;
		CalculadoraAritimetica calc = new CalculadoraAritimetica();

		double resultadoEsperado = 10;

		resultadoReal = calc.somar(nro1, nro2);

		assertEquals(resultadoEsperado, resultadoReal, 0);

	}

	/**
	 * 
	 * Teste de subtrair na Calculadora.
	 * 
	 */

	@Test
	public void testeSubtrair5e5() {
		nomeTeste = "testeSubtrair5e5";
		double nro1 = 5;

		double nro2 = 5;

		CalculadoraAritimetica calc = new CalculadoraAritimetica();

		double resultadoEsperado = 0;

		resultadoReal = calc.subtrair(nro1, nro2);

		assertEquals(resultadoEsperado, resultadoReal, 0);

	}

	/**
	 * 
	 * Teste de multiplicar na Calculadora.
	 * 
	 */

	@Test
	public void testeMultiplicar3e3() {
		nomeTeste = "testeMultiplicar3e3";
		double nro1 = 3;

		double nro2 = 3;

		CalculadoraAritimetica calc = new CalculadoraAritimetica();

		double resultadoEsperado = 9;

		resultadoReal = calc.multiplicar(nro1, nro2);

		assertEquals(resultadoEsperado, resultadoReal, 0);

	}

	/**
	 * 
	 * Teste de dividir na Calculadora.
	 * 
	 */

	@Test
	public void testeDividir3por2() {
		nomeTeste = "testeDividir3por2";
		double nro1 = 3;

		double nro2 = 2;

		CalculadoraAritimetica calc = new CalculadoraAritimetica();

		double resultadoEsperado = 1.5;

		resultadoReal = calc.dividir(nro1, nro2);

		assertEquals(resultadoEsperado, resultadoReal, 0.1);

	}

	@Test
	public void testeDividir3por7() {
		nomeTeste = "testeDividir3por7";
		double nro1 = 3;

		double nro2 = 7;

		CalculadoraAritimetica calc = new CalculadoraAritimetica();

		double resultadoEsperado = 0.42857;

		resultadoReal = calc.dividir(nro1, nro2);

		assertEquals(resultadoEsperado, resultadoReal, 0.00001);

	}
}