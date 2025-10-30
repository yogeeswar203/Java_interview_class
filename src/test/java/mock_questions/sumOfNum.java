package mock_questions;

public class sumOfNum {

	public static void sumOfDigits(int num) {
		
		int sum = 0;
		while(num!=0) {
			int rem = num%10;
			sum = rem + sum;
			num = num/10;
		}
		System.out.println(sum);
		
		
	}
	public static void main(String[] args) {
		sumOfDigits(123);

	}

}
