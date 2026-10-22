package basics;

public class SumOfNumber1toN {

	public static void main(String[] args) {
		// There is two ways to solve this problem, by using "for" loop  or "while" loop
		
		int num = 100;
		int totalSum = 0;
		
		for(int i=0; i<=num; i++) {
			totalSum = totalSum + i;
		}
		System.out.println("Total sum using /'for/' loop is : " + totalSum);
		
		
		
		int j = 1;
		int totalSum2 = 0;
		while(j <= num) {
			totalSum2 = totalSum2 + j;
			j++;
		}
		System.out.println("Total sum using /'while/' loop is : " + totalSum2);
		
	}

}
