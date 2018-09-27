package relacionais;

public class DuploDivisao {
	public static void main(String[] args) {
		int x = 4;
		int y = 4;	
						
		System.out.println(x /=  y);
		
		x = 3;
		
		System.out.println(x /= y);
		
	}
}
