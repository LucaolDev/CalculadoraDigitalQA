package FontesCalculadoras;

public class TesteCalculadora {

	public static void main(String[] args) {
	   
		CalculadoraAritimetica calc = new CalculadoraAritimetica();
		
		double resultado;
		resultado= calc.somar(10, 50);
		System.out.println(resultado);
		
	 resultado= calc.subtrair(50, 10);
	 System.out.println(resultado);
	 
	 resultado= calc.multiplicar(50, 60);
	 System.out.println(resultado);
	 
	 resultado= calc.dividir(50,2);
	 System.out.println(resultado);
	 
	}
	

}