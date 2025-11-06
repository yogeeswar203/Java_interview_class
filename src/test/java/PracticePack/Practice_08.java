package PracticePack;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

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
		System.out.println("---------------------------- Executing int Swap Program 4 -------------------------------------");
		String rev = "";
		for(int i=str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println("Reversed String using normal method: "+rev);
	
		System.out.println("---------------------------- Executing int Swap Program 5 -------------------------------------");
	}
	
	public static String reverseStringReccursive(String str)
	{
		if(str.length()<=1 || str==null)
		{
			return str;
		}
		char c1 = str.charAt(0);
		String rem = str.substring(1);
		
		return reverseStringReccursive((rem))+c1;
	}
	
	public static void missingElementinArray(int arr[]) {
		System.out.println("---------------------------- Executing int Swap Program 6 -------------------------------------");
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			sum1 = sum1 + arr[i];
		}
		//System.out.println(sum1);
		int c1 = arr[0];
		int c2 = arr[arr.length-1];
		
		for(int i=c1; i<=c2; i++)
		{
			sum2 = sum2 + i;
		}
		System.out.println("Missing Element in Array: "+(sum2-sum1));
		
	}
	
	public static void countInts(int arr[]) {
		System.out.println("---------------------------- Executing int Swap Program 7 -------------------------------------");
		Map<Integer, Integer> imap = new HashMap<Integer, Integer>();
		
		for(int i:arr)
		{
			if(imap.containsKey(i))
			{
				imap.put(i, imap.get(i)+1);
			}else
			{
				imap.put(i, 1);
			}
			
		}
		
		// To print all the values in array 
		for(int i:imap.keySet())
		{
			System.out.print(i+":"+imap.get(i)+" ");
		}
		System.out.println();
		int max = Collections.max(imap.values());
		for(int i:imap.keySet())
		{
			if(max == imap.get(i))
			{
				System.out.println("Maximum repeated value is: "+i+":"+imap.get(i));
			}
		}
		
		
	}
	
	public static void charCount(String str) {
		System.out.println("---------------------------- Executing int Swap Program 8 -------------------------------------");
		char arr[] = str.toCharArray();
		Map<Character, Integer> cmap = new HashMap<Character, Integer>();
		
		for(char c:arr)
		{
			if(!String.valueOf(c).isBlank())
			{
				if(cmap.containsKey(c))
				{
					cmap.put(c, cmap.get(c)+1);
				}else
				{
					cmap.put(c, 1);
				}
				
			}
			
		}
		// To Print all the values
		for(char c1:cmap.keySet())
		{
			System.out.print(c1+":"+cmap.get(c1)+" ");
		}
		System.out.println();
		
		// To find out maximum value
		int max = Collections.max(cmap.values());
		for(char c2:cmap.keySet())
		{
			if(max == cmap.get(c2))
			{
				System.out.println("Maximum repeated value is: "+c2+":"+cmap.get(c2));
			}
		}
	}
	
	public static void findSecDigit(String str[]) {
		System.out.println("---------------------------- Executing int Swap Program 9 -------------------------------------");
		for(String eachWord:str)
		{
			char c2 = eachWord.charAt(1);
			if(Character.isDigit(c2))
			{
				System.out.print(eachWord+" ");
			}
		}
		System.out.println();
	}
	
	public static void checkIntPalandrome(int num) {
		System.out.println("---------------------------- Executing int Swap Program 10 -------------------------------------");
		
		int rev = 0;
		int num1 = num;
		
		while(num1!=0) {
			rev = rev*10 + num1%10;
			num1 = num1/10;
		}
		
		if(rev == num)
		{
			System.out.println("Given Number "+num+" is Palandrome");
		}else
		{
			System.out.println("Given Number "+num+" is Not Palandrome");
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
	
		int num1 = 2;
		int num2 = 50;
		int num3 = 1931;
		
		int arr1[] = {99, 100, 102,103};
		int arr2[] = {1, 1, 2, 2, 2, 3, 5, 5};
		
		String str = "test";
		String str1[] = {"B2b", "test", "R4R"};
		
		// Programs
		intSwap(num1, num2);
		chekPrime(num2);
		generatePrimenum(num1, num2);
		reverseString(str);
		System.out.println("Reversed String using recursive method: "+reverseStringReccursive(str));
		missingElementinArray(arr1);
		countInts(arr2);
		charCount(str);
		findSecDigit(str1);
		checkIntPalandrome(num3);
		
		
		
	}

}
