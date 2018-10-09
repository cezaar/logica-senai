package exercicios;

import java.util.Arrays;

public class Ex007SaqueCerto {
	public static void main(String[] args) {

		int[] notas = { 100, 50, 20, 10, 5, 2 , 1,0 };
		
		 int saque = 1233 ;
		
		for (int i = 0; i < notas.length ; i++) {
			
			int qtNotas = saque / notas[i] ;
			 
			qtNotas = saque / notas[i];
			
			qtNotas = saque / notas[i];
			
			saque %= notas[i];
			
			System.out.println(" notas de " + notas[i] + "  " + qtNotas );
		}
	}


	}
	

