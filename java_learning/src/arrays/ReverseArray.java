package arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] num = {12, 45, 7, 89, 23, 56};
		int[] revNum = new int[num.length];
//		int[] revArray = new int[num.length];
		
		for(int i = 0; i<=num.length-1; i++) {
			revNum[i] = num[i];
		}
		
		for(int a : revNum) {
			System.out.print(a + " ");
		}

	}

}
