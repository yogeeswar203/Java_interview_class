package mock_questions;

public class count_sum_of_digits {
	
	public static void countOfDigits(int num) {
		int count =0;
		
		while(num!=0) {
			num = num/10;
			count++;
		}
		System.out.println("The No of digits Present: "+count);
	}
	
	public static void sumOfDigits(int num)
	{
		int sum = 0;
		
		while(num!=0)
		{
			sum = sum + num%10;
			num = num/10;
		}
		System.out.println("The Sum of digits is: "+sum);
	}

	public static void main(String[] args) {
	
		countOfDigits(1234);
		sumOfDigits(1234);
	}

}
