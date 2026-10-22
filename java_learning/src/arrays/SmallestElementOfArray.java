package arrays;

public class SmallestElementOfArray {

	public static void main(String[] args) {

		int[] num = {12, 45, 7, 89, 23, 56};
		int smallest = num[0];
		
		for(int i = 1; i<num.length; i++) {
			if(num[i] < smallest) {
				smallest = num[i];
			}
		}
		
		System.out.println(smallest);

	

	}

}
