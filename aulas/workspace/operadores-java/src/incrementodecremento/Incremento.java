package incrementodecremento;

public class Incremento {

	public static void main(String[] args) {
		int x = 10;
		x++; // 11
		
		System.out.println(" O valor de X �: " +x);
		int y = x++; 
		
		System.out.println(" O valor de Y �: " + y);
		
		int z = ++x;
		
		System.out.println(" O valor de Z �: " + z);
		System.out.println(" O valor de X �: " + x);
	
		// Retorna imediatamente o incremento
		
		int soma = 1 + x++;
		
		//
		
		System.out.println(soma);
	}

}
