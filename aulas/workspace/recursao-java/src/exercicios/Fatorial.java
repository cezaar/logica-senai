package exercicios;

public class Fatorial {
	public static void main(String[] args) {
		System.out.println(Fatorial(3));
	}

	public static int Fatorial(int numero) {
		if (numero != 1) {
			
		int resultado = Fatorial (numero - 1);
		return numero * (resultado);
						
			
		} else {
			return 1;
		
			
		}

	}
}
