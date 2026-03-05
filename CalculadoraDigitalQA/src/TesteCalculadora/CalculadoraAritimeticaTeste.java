package TesteCalculadora;

import static org.junit.Assert.*;

import org.junit.Test;

import FontesCalculadoras.CalculadoraAritimetica;

public class CalculadoraAritimeticaTeste {


	 CalculadoraAritimetica calc = new CalculadoraAritimetica();

	    @Test
	    public void testeSoma() {
	    	double resultadoEsperado = 5;
	    	double resultadoReal = calc.somar(2, 3);

	        assertEquals(resultadoEsperado, resultadoReal,0);
	    }

	    @Test
	    public void testeSubtracao() {
	    	double resultadoEsperado = 1;
	    	double resultadoReal = calc.subtrair(3, 2);

	        assertEquals(resultadoEsperado, resultadoReal,0);
	    }

	    @Test
	    public void testeMultiplicacao() {
	    	double resultadoEsperado = 6;
	    	double resultadoReal = calc.multiplicar(2, 3);

	        assertEquals(resultadoEsperado, resultadoReal,0);
	    }

	    @Test
	    public void testeDivisao() {
	    	double resultadoEsperado = 1.5;
	    	double resultadoReal = calc.dividir(3, 2);

	        assertEquals(resultadoEsperado, resultadoReal,0.1);
	    }

	    @Test
	    public void testeDivisaoPorZero() {
	        assertThrows(IllegalArgumentException.class, () -> {
	            calc.dividir(5, 0);
	        });
	    }

}