package dad.codewars;

public class SumaArrays {
	public static double suma(double[] nums) {
		double resultado = 0;
		
		if(nums.length == 0) {
			return 0;
		} else {
			for(int i = 0; i < nums.length; i++) {
				resultado += nums[i];
			}
		    return resultado;
		}
		
		
	  }
}
