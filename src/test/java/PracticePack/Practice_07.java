package PracticePack;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;



public class Practice_07 {
	
	public static void intSwap(int num1, int num2) {
		System.out.println("-----------------------------------------------Executing the Swapping the elements program 1 ---------------------------------------------- ");
		int t=0;
		System.out.println("Before Swap: "+num1 + ":"+num2);
		
		t  = num1; 
		num1 = num2; 
		num2 = t;
		System.out.println("Before Swap: "+num1 + ":"+num2);
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("Before Swap: "+num1 + ":"+num2);

	}	
	
	public static void missingElementinArray(int arr[])
	{
		System.out.println();
		System.out.println("-----------------------------------------------Executing the missing element in Array program 2 ------------------------------------------- ");
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i=0; i<=arr.length-1; i++)
		{
			sum1 = sum1 + arr[i];
		}
		//System.out.println("Sum of the Array: "+sum1);
		
		int c1 = arr[0];
		int len = arr.length-1;
		int c2 = arr[len];
		
		for(int i=c1; i<=c2; i++)
		{
			sum2 = sum2 + i;
		}
		//System.out.println("Sum of the all the elements: "+sum2);
		System.out.println("Missing Elemenet is: "+(sum2-sum1));
	
		
	}
	
	public static void checkPrime(int num) {
		System.out.println();
		System.out.println("-----------------------------------------------Executing the Check Prime number program 3 ------------------------------------------------- ");
		
		if(num<=1)
		{
			System.out.println("Please eneter the value more than : "+num);
		}else
		{
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
				System.out.println("Given number is Prime: "+num);
			}
		}
		
	}
	
	public static void generatePrimeNumbers(int num1, int num2)
	{
		System.out.println();
		System.out.println("-----------------------------------------------Executing the Genarating Prime number program 4 ------------------------------------------------- ");
		
		for(int i=num1; i<=num2; i++)
		{
			int c=0;
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
		System.out.println("-----------------------------------------------Executing the reversing the String program 5 ---------------------------------------------------- ");
		
	}

	
	public static String  reverseStringReccursive(String str) {
		
		if(str==null || (str.length()<=1)) {
			return str;
		}
		char c1 = str.charAt(0);
		String remaingStr = str.substring(1);
		
		return (reverseStringReccursive(remaingStr))+c1;
	}
	
	public static void CheckStrPalandrome(String str) {
		System.out.println();
		System.out.println("-----------------------------------------------Executing the Check Palandrmoe the String program 6 --------------------------------------------- ");
		
		String rev = "";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		
		if(str.equals(rev))
		{
			System.out.println("Given String is Palandrmoe: "+ rev);
		}else
		{
			System.out.println("Given String is Not Palandrmoe: "+ str);
		}
	}
	
	public static void checkInt(int num) {
		System.out.println();
		System.out.println("-----------------------------------------------Executing the Check Palandrmoe the String program 7 --------------------------------------------- ");
		int rev =0;
		int num1 = num;
		
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
		if(num1==rev) {
			System.out.println("Given integer is Palandrome: "+rev);
		}else
		{
			System.out.println("Given integer is Not a Palandrome: "+num1);
		}
	}
	
	public static void countChar(String str) {
		System.out.println();
		System.out.println("-----------------------------------------------Executing the Count Char the String program 8 --------------------------------------------- ");
		char arr[] = str.toCharArray();
		Map<Character, Integer> charmap = new HashMap<Character, Integer>();
		
		
		for(char c: arr)
		{
			if(!String.valueOf(c).isBlank())
			{
				if(charmap.containsKey(c))
				{
					charmap.put(c, charmap.get(c)+1);
				}else
				{
					charmap.put(c, 1);
				}
			}
		}
		
		int maxv = Collections.max(charmap.values());
		
		for(char c: charmap.keySet()) 
		{
			if(maxv == charmap.get(c))
			{
				System.out.println("Max Repeated Value is: "+c+":"+charmap.get(c));
			}
		}
	}
	
	public static void CountInt(int num[]) {
		System.out.println();
		System.out.println("-----------------------------------------------Executing the Count int the String program 9 --------------------------------------------- ");
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
		
		int mx = Collections.max(imap.values());
		
		
		for(int c:imap.keySet())
		{
			if(mx==imap.get(c))
			{
				System.out.print("Max repeated value: "+c+":"+imap.get(c)+" ");
			}
		}
		
	}
	
	public static void countSecDigit(String str[]) {
		System.out.println();
		System.out.println("-----------------------------------------------Executing finding String program 11 ------------------------------------------------------- ");

		
		for(String eachWord: str)
		{
			char c = eachWord.charAt(1);
			if(Character.isDigit(c))
			{
				System.out.print(eachWord+" ");
			}
		}
	}
	
	
	
	public static void main(String[] args) {
	
		int num1 = 1;
		int num2 = 50;
		int num3 = 101;
		
		int arr1[] = {1, 2, 3, 3, 3, 4};
		String str1[] = {"T2b", "BTC", "B09"};
		int arr2[] = {1, 2, 4};
		String str = "TET";
		
		// Calling programs
		intSwap(num1, num2);
		missingElementinArray(arr2);
		checkPrime(num1);
		generatePrimeNumbers(num1, num2);
		System.out.println(reverseStringReccursive(str));
		CheckStrPalandrome(str);
		checkInt(num3);
		countChar(str);
		CountInt(arr1);
		countSecDigit(str1);
		
		
		
		
		
	}

}
