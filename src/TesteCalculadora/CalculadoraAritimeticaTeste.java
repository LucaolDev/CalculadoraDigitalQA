package TesteCalculadora;

import static org.junit.Assert.*;

import org.junit.Test;

import FontesCalculadora.CalculadoraAritimetica;

public class CalculadoraAritimeticaTeste {


	 CalculadoraAritimetica calc = new CalculadoraAritimetica();

	    @Test
	    public void testeSoma() {
	        int resultadoEsperado = 5;
	        int resultadoReal = calc.somar(2, 3);

	        assertEquals(resultadoEsperado, resultadoReal);
	    }

	    @Test
	    public void testeSubtracao() {
	        int resultadoEsperado = 1;
	        int resultadoReal = calc.subtrair(3, 2);

	        assertEquals(resultadoEsperado, resultadoReal);
	    }

	    @Test
	    public void testeMultiplicacao() {
	        int resultadoEsperado = 6;
	        int resultadoReal = calc.multiplicar(2, 3);

	        assertEquals(resultadoEsperado, resultadoReal);
	    }

	    @Test
	    public void testeDivisao() {
	        int resultadoEsperado = 2;
	        int resultadoReal = calc.dividir(6, 3);

	        assertEquals(resultadoEsperado, resultadoReal);
	    }

	    @Test
	    public void testeDivisaoPorZero() {
	        assertThrows(IllegalArgumentException.class, () -> {
	            calc.dividir(5, 0);
	        });
	    }

}
