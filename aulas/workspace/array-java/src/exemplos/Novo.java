package exemplos;

public class Novo {
	public static void main(String[] args) {
		double P1 [] = {2.0,7.5,3.0,2.0,0.0,10.0,1.0,3.0,4.0,2.0};
		double P2 [] = {4.5,7.5,4.0,7.0,10.0,5.0,10.0,9.0,8.0,5.0};
		double P3 [] = {6.0,4.0,9.0,7.0,5.0,4.0,5.0,6.0,7.0,9.0};

		double Media=0;
		for (int i=0;i Media = (P1[i] + (P1[i]*0.2)) + (P2[i] + (P2[i]*0.4)) + (P3[i] + (P3[i]*0.4));
		Media = Media/3;
	
		if (Media>5){
		if (Media>7){
		System.out.println("Aluno Aprovado");
		}
		
		}
		else{
		System.out.println("Aluno reprovado");
		}

		}
		}