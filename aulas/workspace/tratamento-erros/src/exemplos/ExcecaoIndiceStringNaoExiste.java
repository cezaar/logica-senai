package exemplos;

public class ExcecaoIndiceStringNaoExiste {
	public static void main(String[] args) {
		String a = "N�o sei o que t� fazendo";
		char c = a.charAt(50);
		System.out.println(c);

	}
}
