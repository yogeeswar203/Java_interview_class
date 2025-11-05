package PracticePack;

public class Practice_08 {
	
	public static void intSwap(int num1, int num2)
	{
		System.out.println("---------------------------- Executing int Swap Program 1-------------------------------------");
		int t =0;
		System.out.println("Before swapping: "+num1 +":"+num2);
		
		t = num1;
		num1 = num2;
		num2 = t;
		System.out.println("Before swapping: "+num1 +":"+num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("Before swapping: "+num1 +":"+num2);
		
	}
	
	public static void chekPrime(int num) {
		System.out.println("---------------------------- Executing int Swap Program 2-------------------------------------");
		int c = 0;
		if(num<=1)
		{
			System.out.println("Please enter value more than :"+num);
		}else
		{
			for(int i=1; i<=num; i++)
			{
				if(num%i ==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.println("Give number is Prime: "+num);
			}else
			{
				System.out.println("Given number is not Prime: "+num); 
				
			}
		}
	}
	
	
	public static void generatePrimenum(int num1, int num2)
	{
		System.out.println("---------------------------- Executing int Swap Program 3 -------------------------------------");
		for(int i=num1; i<num2; i++) {
			
			int c = 0;
			for(int j=1; j<=num2; j++)
			{
				if(i%j == 0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.print(i+" ");
			}
		}
	System.out.println();
	}
	
	
	public static void reverseString(String str)
	{
		String rev = "";
		for(int i=str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
	}
	
	public static void main(String[] args) {
	
		int num1 = 2;
		int num2 = 50;
		int num3 = 121;
		
		int arr1[] = {1, 3, 4,5};
		int arr2[] = {1, 1, 2, 2, 2, 3, 5, 5};
		
		String str = "test";
		String str1[] = {"B2b", "test", "R4R"};
		
		// Programs
		intSwap(num1, num2);
		chekPrime(num2);
		generatePrimenum(num1, num2);
		reverseString(str);
		
		
		
	}

}
