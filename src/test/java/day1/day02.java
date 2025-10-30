package day1;

import java.util.HashMap;
import java.util.Map;

public class day02 {
	
	public static void intSwap(int num1, int num2)
	{
		System.out.println("Before swapping the numbers: "+num1+" "+num2);
		int t= 0;
		
		t = num1;
		num1 = num2;
		num2 = t;
		
		System.out.println("Before swapping the numbers: "+num1+" "+num2);
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("Before swapping the numbers: "+num1+" "+num2);
		
		
	}
	
	
	public static void checkPrime(int num)
	{
		if(num<=1) 
		{
			System.out.println("Please enter the number more than 1");
		}
		int count = 0;
		
		for(int i=1; i<=num; i++)
		{
			if(num%i == 0) 
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("Given number is Prime: "+num);
		}else
		{
			System.out.println("Given number is Not Prime: "+num);
		}
		
	}
	
	public static void SecDigit(String str[])
	{
		for(String eachWord:str)
		{
			char secDigit = eachWord.charAt(1);
			if(Character.isDigit(secDigit))
			{
				System.out.print(eachWord+" ");
			}
		}
	}
	
	public static void CharOcc(String str)
	{
		char arr[] = str.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		for(char c: arr)
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
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************** Program 1 ************************");
		intSwap(10, 20);
		System.out.println("************** Program 2 ************************");
		checkPrime(21);
		
		System.out.println("************** Program 3 ************************");
		String arr[] = {"12B", "H23", "6Gb", "t2EST"};
		SecDigit(arr);
		
		System.out.println("************** Program 4 ************************");
		String t = "test";
		CharOcc(t);
		

	}

}
