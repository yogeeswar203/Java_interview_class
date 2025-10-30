package mock_questions;

public class swapnum_01 {
	
	public static void swapNumbers(int a, int b) {
		int temp = 0;
		
		System.out.println("Before swapping the numbers: a:"+a +" b: "+b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("Before swapping the numbers: a:"+a +" b: "+b);
		
		System.out.println("Below result is without using the temp variables");
		
		a = a+b; // 20+10 = 30
		b = a-b; // 30-10 = 20
		a = a-b; // 30-20 = 10
		System.out.println("Before swapping the numbers: a:"+a +" b:"+b);
		
	}
	
	
	public static void main(String[] args) {
		swapNumbers(10, 20);
	}

}
