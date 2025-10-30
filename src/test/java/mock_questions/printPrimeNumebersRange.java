package mock_questions;

public class printPrimeNumebersRange {
	
	public static void printPrimeNum(int num1, int num2) {
		
		for(int i=num1; i<=num2; i++)
		{
			int count = 0;
			for(int j=num1; j<=num2; j++)
			{
				if(i%j == 0) 
				{
					count++;
				}
			}
			if(count==2) {
				System.out.print(i+" ");
			}
		}
		
	}

	public static void main(String[] args) {
		
		printPrimeNum(1, 20);
		//2, 3, 5, 7, 11, 13, 17, 19.
	}

}
