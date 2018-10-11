package exercicios;

public class OrelhaDeGato {
public static void main(String[] args) {
	System.out.println(OrelhaDeGato.contarOrelhas(3));
}
	public static int contarOrelhas (int gatos) {
		if (gatos == 0 ) 
			
			return 0;
			
			
			
			return 2 + contarOrelhas (gatos - 1);
		
			
		}
	
}

