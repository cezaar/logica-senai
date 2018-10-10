package exercicios;

public class CalculosPraVoce {
	public static void main(String[] args) {
		// Invocação
		System.out.println(CalculosPraVoce.soma(2.0, 4.0));
		
		// Uma forma de invocar o método e imprimir o resultado
		System.out.println(CalculosPraVoce.subtracao(120.0, 10.0));
		
		// Igual ao de cima, mas guarda o resultado numa variável, pra depois imprimir
		double resultado = CalculosPraVoce.subtracao(120.0, 10.0);
		
		// Invocando sem return
		
		CalculosPraVoce.multiplicacao(3.0, 3.0);
		
	}

	// Declaração
	public static double soma(double num1, double num2) {

		return num1 + num2;

	}

	public static double divisao(double num1, double num2) {

		return num1 / num2;

	}

	public static void multiplicacao(double num1, double num2) {

		System.out.println("Multiplicação: " + num1 * num2);
				

	}

	public static double subtracao(double num1, double num2) {

		return num1 - num2;

	}
}
