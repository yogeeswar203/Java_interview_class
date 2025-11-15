package PracticePack;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;



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
		int j = 0;
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length-1; i++)
		{
			
			if(arr[i] == arr[i+1])
			{
				arr[j++] = arr[i];
			}
		}
		
		arr[j++] = arr[arr.length-1];
		int newArr[] = Arrays.copyOf(arr, j);
		System.out.println(Arrays.toString(newArr));
	}
	
	
	public static void arrSet(Integer arr[]) {
		System.out.println("--------------------------------------------------- Program 6 --------------------------------------------");
		System.out.println("Original Array: "+Arrays.toString(arr));
		Set<Integer> newAr = new HashSet<Integer>(Arrays.asList(arr)); 
		Integer[] uniArry2 = newAr.toArray(new Integer[0]);
		System.out.println("Uniquie Array: "+Arrays.toString(uniArry2));
		
	}
	
	public static void uniString(String str[]) {
		System.out.println("--------------------------------------------------- Program 7 --------------------------------------------");
		System.out.println("Original Array: "+Arrays.toString(str));
		Set<String> newSet = new HashSet<String>(Arrays.asList(str));
		String uniArr[] = newSet.toArray(new String [0]);
		
		System.out.println("Unique Array: "+Arrays.toString(uniArr));
	}
	
	public static void checkPalandromeString(String str) {
		System.out.println("--------------------------------------------------- Program 8 --------------------------------------------");
		String rev = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}
		if(rev.equals(str))
		{
			System.out.println("Given Sting is Palandrome: "+rev);
		}else
		{
			System.out.println("Given String is not Palandrome: "+str);
		}
		System.out.println("--------------------------------------------------- Program 9 --------------------------------------------");
	}

	
	public static String recursiveStr(String str) {
		if(str.length()<=1 || str==null) {
			return str;
		}
		
		char c = str.charAt(0);
		String remString  = str.substring(1);
		
		return recursiveStr(remString)+c;
	}
	
	public static void missingElement(int[]arr) {
		System.out.println("--------------------------------------------------- Program 10 --------------------------------------------");
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i=0; i<arr.length-1; i++)
		{
			sum1 = sum1 + arr[i];
		}
		
		for(int i=arr[0]; i<arr[arr.length-1]; i++)
		{
			sum2 = sum2 + i;
		}
		
		System.out.println("Missing Element in Array: "+(sum2-sum1));
	}
	
	
	
	
	public static void main(String[] args) {
		// Declaring the variables
		int num1 = 13;
		int num2 = 30;
		int num3 = 121;
		
		String str = "test";
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
		arrSet(arr3);
		uniString(str1);
		checkPalandromeString(str);
		System.out.println("Reversed String: "+recursiveStr(str));
		missingElement(missingArr);
				
	}

}
