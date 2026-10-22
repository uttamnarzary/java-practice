package basics;

public class FactorialOfNumber {

	public static void main(String[] args) {
		int num = 10;
		int factor = 1;
		
		for (int i = 1; i<=num; i++) {
			factor = factor * i;
		}
		
		System.out.println(factor);

	}

}
