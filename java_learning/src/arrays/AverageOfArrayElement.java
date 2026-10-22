package arrays;

public class AverageOfArrayElement {

	public static void main(String[] args) {
		int[] num = {12, 45, 7, 89, 23, 56};
		int sum = 0;
		int totalValue = num.length;
		
		for(int a : num) {
			sum += a;
		}
		
		System.out.println((double) sum/totalValue); //type casting

	}

}
