package arrays;

public class LargestElementOfArray {

	public static void main(String[] args) {
		int[] num = {12, 45, 7, 89, 23, 56};
		int largest = num[0];
		
		for(int i = 1; i<num.length; i++) {
			if(num[i] > largest) {
				largest = num[i];
			}
		}
		
		System.out.println(largest);

	}

}
