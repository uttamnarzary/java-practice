package arrays;

public class SumOfArrayElement {

	public static void main(String[] args) {
		int[] num = {12, 45, 7, 89, 23, 56};
		int sum = 0;
		
		for(int a : num) {
			sum += a;
		}
		
		System.out.println(sum);

	}

}
