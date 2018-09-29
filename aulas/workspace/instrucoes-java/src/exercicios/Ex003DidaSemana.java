package exercicios;

import java.util.Random;

public class Ex003DidaSemana {
	public static void main(String[] args) {
		int n = new Random().nextInt(7) + 1;

		switch (n) {

		case 1:
			System.out.println("domingo");
			break;
		case 2:
			System.out.println("Segunda feira, Droga!");
			break;
		case 3:
			System.out.println("Terça feira, saco!");
			break;
		case 4:
			System.out.println("quarta feira, quase");
			break;
		case 5:
			System.out.println("quinta feira, ta chegando");
			break;
		case 6:
			System.out.println("sexta feira, chegou sua linda");
			break;
		case 7:
			System.out.println("sabado, to curtindo");
			break;

		default:
			System.out.println("morri");
			break;

		}

	}

}
