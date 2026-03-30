package Practice_Package2;

public class Practice_02 {
	
	public static void intSwap(int num1, int num2) {
		System.out.println("***************** Running Program 1 *************************");
		System.out.println("Before swapping the numbers: "+num1+":"+num2);
		int t = 0;
		t = num1;
		num1 = num2;
		num2 = t;
		System.out.println("Before swapping the numbers: "+num1+":"+num2);
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("Before swapping the numbers: "+num1+":"+num2);
	}
	
	public static void checkPrimeNumber(int num)
	{
		System.out.println();
		System.out.println("***************** Running Program 2 *************************");
		int c =0;
		if(num>=1) {
			
			for(int i=1; i<= num; i++)
			{
				if(num%i == 0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.println("Given number is Prime number: "+num);
			}else
			{
				System.out.println("Given number is not Prime Number: "+num);
			}
		}
		
	}

	public static void main(String[] args) {
		int a= 23;
		int b = 20;
		
		intSwap(a, b);
		checkPrimeNumber(a);
		

	}

}
