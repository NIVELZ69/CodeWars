package dad.codewars;

public class SmallestInterger {

	public static int smallest(int[] serie) {
		
		int smallest = serie[0];
		
		for (int i = 1; i < serie.length; i++) {
			if(serie[i] < smallest) {
				smallest = serie[i];
			}
		}
		
		return smallest;
		
	}
	
	
	
}
