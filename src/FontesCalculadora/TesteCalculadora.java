package FontesCalculadora;

public class TesteCalculadora {

	public static void main(String[] args) {
	   
		CalculadoraAritimetica cel = new CalculadoraAritimetica();
		
		int resultado;
		resultado= cel.somar(10, 50);
		System.out.println(resultado);
		
	 resultado= cel.subtrair(50, 10);
	 System.out.println(resultado);
	 
	 resultado= cel.multiplicar(50, 60);
	 System.out.println(resultado);
	 
	 resultado= cel.dividir(50,2);
	 System.out.println(resultado);
	 
	}
	

}
