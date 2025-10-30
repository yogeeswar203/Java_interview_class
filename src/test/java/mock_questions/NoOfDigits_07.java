package mock_questions;

public class NoOfDigits_07 {
	
	public static void noOfDigits(int num) {
		
		int c =0;
		while(num!=0) {
			
			num = num/10;
			c ++;
		}
		
		System.out.println(c);
		
		
	}

	public static void main(String[] args) {
		
		noOfDigits(123);
	}

}
