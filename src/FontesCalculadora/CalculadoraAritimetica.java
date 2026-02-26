package FontesCalculadora;

public class CalculadoraAritimetica {
	
	public  int multiplicar(int n1, int n2) {
		return n1 * n2;
	}

	public int dividir(int n1, int n2) {
	    if (n2 == 0) {
	        throw new IllegalArgumentException("Não é possível dividir por zero");
	    }
	    return n1 / n2;
	}

	public  int somar(int n1, int n2) {
		return n1 + n2;
		
	}

	public  int subtrair(int n1, int n2) {
		return n1 - n2;
		
	}
	
	
	   
	

}
