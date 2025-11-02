package PracticePack;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Practice_05 {
	
	public static void swapNum(int num1, int num2) {
		System.out.println("********************* Executing Swap numbers 1*****************************");
		System.out.println("Before swapping the numbers: "+num1 +":"+num2);
		int t= 0;
		 
		t = num1;
		num1 = num2;
		num2 = t;
		System.out.println("Before swapping the numbers: "+num1 +":"+num2);
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("Before swapping the numbers: "+num1 +":"+num2);
	}
	
	public static void chraCount(String str)
	{
		System.out.println();
		System.out.println("********************* Executing Char Count Program 2*****************************");
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
		System.out.println();
		int maxv = Collections.max(charMap.values());
		for(char c:charMap.keySet())
		{
			if(maxv==charMap.get(c))
			{
				System.out.println("Max Repeated value: "+c+":"+charMap.get(c));
			}
		}
		
		int mx = 0;
		for(char c:charMap.keySet())
		{
			if(mx<=charMap.get(c))
			{
				mx = charMap.get(c);
			}
		}
		System.out.println("Max value is: "+mx);
	}
	
	public static void intCount(int arr[])
	{
		System.out.println();
		System.out.println("********************* Executing Int Count Program 3*****************************");
		
		Map<Integer, Integer> intmap = new HashMap<Integer, Integer>();
		
		for(int i:arr)
		{
			if(intmap.containsKey(i))
			{
				intmap.put(i, intmap.get(i)+1);
			}else
			{
				intmap.put(i, 1);
			}
		}
		
		for(int i:intmap.keySet())
		{
			System.out.print(i+":"+intmap.get(i)+" ");
		}
		System.out.println();
		int max = Collections.max(intmap.values());
		for(int i:intmap.keySet())
		{
			if(max==intmap.get(i))
			{
				System.out.println("Max repeated value: "+i+":"+intmap.get(i));
			}
		}

	}
	
	public static void SecDigit(String str1[]) {
		System.out.println();
		System.out.println("********************* Executing Int Count Program 4*****************************");
		for(String eachWord:str1)
		{
			char SecDigit = eachWord.charAt(1);
			if(Character.isDigit(SecDigit))
			{
				System.out.print(eachWord+" ");
			}
		}
	}
	
	public static void CheckPrime(int num)
	{
		System.out.println();
		System.out.println();
		System.out.println("********************* Executing Int Count Program 5*****************************");
		
		if(num<=1)
		{
			System.out.println("Please enter value more than "+num);
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
				System.out.println("Given number is prime: "+num);
			}
		}
}
		
		public static void generatePrimeNumbers(int num1, int num2)
		{
			System.out.println();
			System.out.println("********************* Executing Int Count Program 6*****************************");
			
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
			System.out.println();
			System.out.println("********************* Executing Reverse String reccursive Program 7*****************************");
		}
		
		
	public static String reverseString(String str) {
		
		if(str.length()<=0 || str==null)
		{
			return str;
		}
		
		char charAtzero = str.charAt(0);
		String remainString = str.substring(1);
		
		return reverseString((remainString))+charAtzero;
		
	}
	
	public static void reverseString1(String str)
	{
		System.out.println();
		System.out.println("********************* Executing Reverse String normal Program 8*****************************");
		String strrev ="";
		for(int i=str.length()-1; i>=0; i--)
		{
			strrev = strrev + str.charAt(i);
		}
		System.out.println(strrev);
		if(strrev.equals(str))
		{
			System.out.println("Given String is Palandrome: "+str);
		}else
		{
			System.out.println("Given String is not a Palandrome: "+str);
		}
	}
	
	public static void reverseInt(int num) {
		System.out.println();
		System.out.println("********************* Executing Reverse & Check Paladrome int normal Program 9*****************************");
		
		int rev = 0;
		int num1 = num;
		
		while(num1!=0)
		{
			rev = rev*10 + num1%10;
			num1 = num1/10;
		}
		if(rev == num)
		{
			System.out.println("Given int is palandrome: "+rev);
		}else
		{
			System.out.println("Given int is not a palandrome: "+rev);
		}
	}
	public static void SeachElementinArray(int arr[], int searchNum) {
		System.out.println();
		System.out.println("********************* Executing Search element in array 10*****************************");
		for(int i:arr)
		{
			if(searchNum==i)
			{
				System.out.println("Element is Found: "+i);
				break;
			}
		}
	}
	
	public static void countNoofdigits(int num)
	{
		System.out.println();
		System.out.println("********************* Executing No of integers are present 10*****************************");
		int c =0;
		
		while(num!=0)
		{
			c++;
			num = num/10;
		}
		System.out.println("No of dits present in give int: "+c);
	}
	
	

	public static void main(String[] args) {
		String str="tet";
		int num1 = 1;
		int num2 = 101;
		int arr[]  = {1, 1, 1, 2, 2, 2, 2, 3, 4};
		int arr2 []= {1, 2, 3, 4};
		String strarr[] = {"D12", "t2R", "res", "T3e"};
		
		swapNum(10, 20);
		chraCount(str);
		intCount(arr);
		SecDigit(strarr);
		CheckPrime(num1);
		generatePrimeNumbers(num1, num2);
		System.out.println(reverseString(str));
		reverseString1(str);
		reverseInt(num2);
		SeachElementinArray(arr2, 3);
		countNoofdigits(num2);
	}
	
}
