package mock_questions;

public class largeNum_09 {
	
	public static void maxNumber(int a, int b, int c) {
		
		if(a>b && a>c) 
		{
			System.out.println("A is greater than b, c: "+a);
		}else if (b>a && b>c)
		{
			System.out.println("B is greater than c, a: "+b);
		}else
		{
			System.out.println("C is greater than b, a: " +c);
		}
		
	}

	public static void main(String[] args) {
		
		maxNumber(1, 2, 3);
	}

}
