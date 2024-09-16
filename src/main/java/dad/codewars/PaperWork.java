package dad.codewars;

public class PaperWork {
	
	public static int paper(int n, int m) {
		
		int resultado = n * m;
		
		if (n < 0 || m < 0) {
			resultado = 0;
		}
		
		return resultado;
		
	}
	
}
