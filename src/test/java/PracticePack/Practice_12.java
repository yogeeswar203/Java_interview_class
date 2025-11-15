package PracticePack;

import java.util.Arrays;

public class Practice_12 {
	
	public static void intSwap(int num1, int num2)
	{
		System.out.println("--------------------------------------------------- Program 1 --------------------------------------------");
		System.out.println("Before Swapping the numbers: "+num1 +":"+num2);
		int t= 0;
		t = num1;
		num1 = num2;
		num2 = t;
		System.out.println("Before Swapping the numbers: "+num1 +":"+num2);
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		System.out.println("Before Swapping the numbers: "+num1 +":"+num2);
		
	}
	
	public static void checkPrime(int num1)
	{
		System.out.println("--------------------------------------------------- Program 2 --------------------------------------------");
		int c=0;
		if(num1<=1)
		{
			System.out.println("Please enter number more than 1");
		}else
		{
			for(int i=1; i<=num1; i++)
			{
				if(num1%i == 0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.println("Given number is Prime: "+num1);
			}else
			{
				System.out.println("Given number is Not Prime: "+num1);
			}
		}
	}
	
	public static void generatePrimeNumbers(int num1, int num2) {
		System.out.println("--------------------------------------------------- Program 3 --------------------------------------------");
		for(int i=num1; i<=num2; i++)
		{
			int c =0;
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
	
	public static void chekIntPaladrome(int num)
	{
		System.out.println("--------------------------------------------------- Program 4 --------------------------------------------");
		int rev = 0;
		int num1 = num;
		if(num<=1)
		{
			System.out.println("Please enter the value more than 1");
		}else
		{
			while(num<=0)
			{
				rev = rev*10 + num%10;
				num = num/10;
			}
		}
		
		if(rev == num1)
		{
			System.out.println("Given int value is Palandrome: "+rev);
		}else
		{
			System.out.println("Given int value is Not Palandrome: "+num1);
		}
		
	}
	
	public static void duplicateinArray(int arr[]) {
		System.out.println("--------------------------------------------------- Program 5 --------------------------------------------");
		for(int i=0; i<arr.length-1; i++)
		{
			Arrays.sort(arr);
			if(arr[i] == arr[i+1])
			{
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
	
	public static void uniArry(int arr[]) {
		System.out.println("--------------------------------------------------- Program 6 --------------------------------------------");
		int j= 0;
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i] == arr[i+1])
			{
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[arr.length-1];
		int newUni[] = Arrays.copyOf(arr, j);
		System.out.println(Arrays.toString(newUni));
	}

	
	
	
	
	public static void main(String[] args) {
		// Declaring the variables
		int num1 = 13;
		int num2 = 30;
		int num3 = 121;
		
		String str = "tet";
		String str1[] = {"t2s", "b5T", "ram", "Raj", "h4", "Raj"};
				
		int arr[] = {1,1, 2, 2, 3, 4, 4, 5, 6};
		//int arRe[] = {1,1, 2, 2, 3, 4, 4,4, 5, 6};
		int missingArr[] = {81, 83, 84, 85};
		Integer arr3[] = {1,1, 2, 2, 3, 4, 4,4, 5, 6};
		
		
		// Calling the methods 
		
		intSwap(num1, num2);
		checkPrime(num1);
		generatePrimeNumbers(num1, num2);
		chekIntPaladrome(num3);
		
		duplicateinArray(arr);
		uniArry(arr);
		
		
				
	}

}
