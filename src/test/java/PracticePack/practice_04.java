package PracticePack;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class practice_04 {

	public static void swapnum(int num1, int num2)
	{
		int tem = 0;
		System.out.println("before swap: "+num1 +":"+num2);
		tem  = num1;
		num1 = num2; 
		num2 = tem;
		System.out.println("before swap: "+num1 +":"+num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("before swap: "+num1 +":"+num2);
	}
	
	public static void printVowels(String str)
	{
		str = str.toLowerCase();
		boolean status = false;
		for(int i=0; i<str.length(); i++)
		{
			char c = str.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c == 'o' || c=='u') 
			{
				System.out.print(c+" ");
				status = true;
			}
		}
		if(status==false)
		{
			System.out.println("No Vowels are present: "+str);
		}
		System.out.println();
	}
	
	public static void counInt(int num[])
	{
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
			if(maxv == imap.get(i))
			{
				System.out.println("Max repeated Value: "+i+":"+imap.get(i));
			}
		}
	}
	
	public static void charCount(String str)
	{
		char chararr[] = str.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		for(char c:chararr)
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
		
		System.out.println();
		int maxV = Collections.max(charMap.values());
		
		for(char c1:charMap.keySet())
		{
			if(maxV == charMap.get(c1))
			{
				System.out.println("Max Repeated value: "+c1+":"+charMap.get(c1));
			}
		}
				
	}
	
	public static void checkPrime(int num)
	{
		int count =0;
		if(num<=1)
		{
			System.out.println("Please enter number value more than :"+num);
		}else
		{
			for(int i=1; i<=num; i++)
			{
				if(num%i == 0)
				{
					count++;
				}
			}
		}
		if(count==2)
		{
			System.out.println("Give number is prime: "+num);
		}else
		{
			System.out.println("Given number is not Prime: "+num);
		}
		
	}
	
	public static void generatePrimeNumbers(int num1, int num2)
	{
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
	
	public static String reverseString(String str)
	{
		if(str.length()<=1 || str==null)
		{
			return str;
		}
		char firstChar = str.charAt(0);
		String reminingStr = str.substring(1);
		
		return reverseString((reminingStr)) + firstChar;
	}
	
	public static void reverseString1(String str)
	{
		System.out.println("**********Executing Reverse String using normal method ***********************");
		String rev = "";
		for(int i=str.length()-1; i>=0; i--)
		{
			rev = rev+str.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(str))
		{
			System.out.println("Given String is Palandrome: "+rev);
		}else
		{
			System.out.println("Given String is not Palandrome: "+rev);
		}
	}
	
	public static void checkIntPalandrome(int num) {
		System.out.println();
		System.out.println("********** Checking Given Int value is Palandrome ***********************");
		int revN = 0;
		int num1 = num;
		
		while(num1!=0)
		{
			revN = revN*10 + num1%10;
			num1 = num1/10;
		}
		if(num == revN) {
			System.out.println("Given number is a palandrome: "+revN);
		}else
		{
			System.out.println("Given number is not a palandrome: "+revN);
		}
	}
	
	public static void main(String[] args) {
		String str = "TET";
		int arr[] = {1, 1, 2, 2, 2, 3, 4, 4, 5, 6};
		swapnum(10, 21);
		printVowels(str);
		charCount(str);
		counInt(arr);
		checkPrime(23);
		generatePrimeNumbers(1, 100);
		System.out.println(reverseString(str));
		reverseString1(str);
		checkIntPalandrome(121);
		
	}

}
