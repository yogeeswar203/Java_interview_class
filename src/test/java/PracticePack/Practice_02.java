package PracticePack;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Practice_02 {

	public static void intswap(int num1, int num2)
	{
		System.out.println("****************** Executing int swap program 1****************");
		int t=0;
		System.out.println("Before swapping: "+num1 +":"+num2);
		t = num1; // t = 10
		num1 = num2; // num1 = 20
		num2  = t; // num1 = 10
		System.out.println("Before swapping: "+num1 +":"+num2);
		num1 = num1 +num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("Before swapping: "+num1 +":"+num2);
		
		System.out.println();
		System.out.println("****************** Executing int swap program 2****************");
		
	}
	
	public static String revString(String str)
	{
		
		
		if(str.length()<=1 || str == null)
		{
			return str;
		}
		char chatatzero = str.charAt(0);
		String remainingString = str.substring(1);
		
		return revString((remainingString))+chatatzero;
	}
	
	public static void charCount(String str)
	{
		System.out.println();
		System.out.println("****************** Executing counting chars in word program 3****************");
		char arr[] = str.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		for(char c:arr)
		{
			if(!String.valueOf(c).isBlank())
			{
				if(charMap.containsKey(c))
				{
					charMap.put(c, charMap.get(c)+1);
				}else
				{
					charMap.put(c, 1);
				}
			}
		}
		
		for(char c:charMap.keySet())
		{
			System.out.print(c+":"+charMap.get(c)+" "); 
			
		}
		int maxV = Collections.max(charMap.values());
		System.out.println();
		for(char c:charMap.keySet())
		{
			if(maxV==charMap.get(c))
			{
				System.out.println("Max repeated value: "+c+":"+charMap.get(c));
			}
		}
		
		
	}
	
	public static void intCountinArray(int num[])
	{
		System.out.println();
		System.out.println("****************** Executing counting integers in array program 4****************");
		
		Map<Integer, Integer> imap = new HashMap<Integer, Integer>();
		
		for(int i:num)
		{
			if(imap.containsKey(i))
			{
				imap.put(i, imap.get(i)+1);
			}else
			{
				imap.put(i, 1);
			}
		}
		
		for(int i:imap.keySet())
		{
			System.out.print(i+":"+imap.get(i)+" ");
		}
		System.out.println();
		int maxv = Collections.max(imap.values());
		for(int i:imap.keySet())
		{
			if(maxv==imap.get(i))
			{
				System.out.println("Max repeated value: "+i+":"+imap.get(i));
			}
		}
	}
	
	
	public static void reverseString(String str)
	{
		System.out.println();
		System.out.println("****************** Executing reverse String Palandrome program 5****************");
		
		String rev = "";
		for(int i=str.length()-1; i>=0; i--)
		{
			rev = rev+str.charAt(i);
		}
		
		if(rev.equals(str)) {
			System.out.println("Given String is palandrome: "+rev);
		}else
		{
			System.out.println("Given String is not palandrome: "+rev);
		}
	}
	
	
	public static void checkintPalandrome(int num1)
	{
		System.out.println();
		System.out.println("****************** Executing Int  Palandrome program 6****************");
		int rev = 0;
		int num = num1;
		
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
		if(num1 == rev)
		{
			System.out.println("Given int value is Palandrome: "+num1);
		}else
		{
			System.out.println("Given int value is not Palandrome: "+num1);
		}
	}
	
	public static void checkPrime(int num)
	{
		System.out.println();
		System.out.println("****************** Executing Checking Prime number program 7****************");
		int c = 0;
		for(int i=1; i<=num; i++)
		{
			if(num%i == 0)
			{
				c++;
			}
		}
		if(c==2)
		{
			System.out.println("Prime number: "+num);
		}else
		{
			System.out.println("Not Prime Number: "+num);
		}
	}
	
	public static void generatePrimeNumners(int num1, int num2) {
		System.out.println();
		System.out.println("****************** Executing Prime numbers generation  program 8****************");
		for(int i=num1; i<=num2; i++)
		{
			int c =0;
			for(int j=1; j<=num2; j++)
			{
				if(i%j ==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.print(i+" ");
			}
		}
	}
	
	public static void secDigitinArr(String arr[])
	{
		System.out.println();
		System.out.println();
		System.out.println("****************** Executing checking second digit  program 9****************");
		for(String eachWord:arr)
		{
			char c2 = eachWord.charAt(1);
			if(Character.isDigit(c2))
			{
				System.out.print(eachWord+" ");
			}
		}
	}
	
	public static void searchElementInArray(int arr[], int num) {
		System.out.println();
		System.out.println("****************** Executing search Element in Array  program 10****************");
		for(int i:arr)
		{
			if(num==i)
			{
				System.out.println(i);
				break;
			}
		}
	}
	
	public static void missingElementinArray(int arr[])
	{
		System.out.println();
		System.out.println("****************** Executing search Element in Array  program 11****************");
		int sum =0;
		int sum2 = 0;
		
		for(int i:arr)
		{
			sum = sum + i;
		}
		
		int i0 = arr[0];
		int il= arr[arr.length-1];
		//System.out.println(i0+":"+il);
		
		for(int i=i0; i<=il; i++)
		{
			sum2 = sum2 + i;
		}
		System.out.println("Sum of actual array: "+sum);
		System.out.println("Sum of created array: "+sum2);
		System.out.println("Missing number is: "+(sum2-sum));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 100;
		String str = "MOM";
		int arr[] = {1, 2, 2, 2, 3, 4, 4, 5};
		int arr2[] = {12, 13, 15};
		String strArr[] = {"t2V", "test", "t%B", "g2b"};
		
		
		// Programs
		intswap(num1, num2);
		System.out.println("Reversed String using reccursive method: "+revString(str));
		charCount(str);
		intCountinArray(arr);
		reverseString(str);
		checkintPalandrome(num1);
		checkPrime(num2);
		generatePrimeNumners(num1, num2);
		secDigitinArr(strArr);
		searchElementInArray(arr, 2);
		missingElementinArray(arr2);
		

	}

}
