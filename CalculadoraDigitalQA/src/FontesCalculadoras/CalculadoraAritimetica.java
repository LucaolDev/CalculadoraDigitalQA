package FontesCalculadoras;

public class CalculadoraAritimetica {
	
	public  double multiplicar(double n1, double n2) {
		return n1 * n2;
	}

	public double dividir(double n1, double n2) {
	    if (n2 == 0) {
	        throw new IllegalArgumentException("Não é possível dividir por zero");
	    }
	    return n1 / n2;
	}

	public  double somar(double nro1, double nro2) {
		return nro1 + nro2;
		
	}

	public  double subtrair(double n1, double n2) {
		return n1 - n2;
		
	}
	
	
	   
	

}