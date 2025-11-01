package PracticePack;

public class Practice_06 {

	public static void intSwap(int num1, int num2) {
		System.out.println("-------------------------------------- int Swap program 1---------------------------------------");
		int t = 0;
		System.out.println("Before swapping: "+num1 +":"+num2);
		t = num1;
		num1 = num2;
		num2 = t;
		System.out.println("Before swapping: "+num1 +":"+num2);
		
		num1 = num1 + num2;
		num1 = num1 - num2;
		num2 = num1 - num2;
		System.out.println("Before swapping: "+num1 +":"+num2);
		
	}
	public static void checkPrime(int num1) {
		System.out.println("-------------------------------------- Checking Prime Number program 2--------------------------");
		if(num1<=1) {
			System.out.println("Please enter the number more than 1");
		}else
		{
			int c=0;
			for(int i=1; i<=num1; i++)
			{
				if(num1%i == 0)
				{
					c++;
				}
			}if(c==2)
			{
				System.out.println("Prime number: "+num1);
			}else
			{
				System.out.println("Not a Prime number: "+num1);
			}
		}
	}
	
	public static void generatePrimeNumbers(int num1, int num2)
	{
		System.out.println("-------------------------------------- Genearting Prime Numbers program 3-----------------------");
		for(int i=num1; i<=num2; i++)
		{
			int c=0;
			for(int j=1; j<=num2; j++)
			{
				if(i%j ==0)
				{
					c++;
				}
			}if(c==2)
			{
				System.out.print(i+" ");
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		int num1 = 11;
		int num2 = 100;
		
		intSwap(num1, num2);
		checkPrime(num1);
		generatePrimeNumbers(num1, num2);

	}

}
