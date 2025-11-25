package PracticePack;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Practice_15 {

	public static void intSwap(int num1, int num2) {
		System.out.println("------------------------------------------------- Program 1 ------------------------------------------------");
		System.out.println("Before Swapping Num: "+num1 +":"+num2);
		int t=0;
		t = num1;
		num1 = num2;
		num2 = t;
		System.out.println("Before Swapping Num: "+num1 +":"+num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("Before Swapping Num: "+num1 +":"+num2);
	}
	
	public static void duplicateValuesInArray(int arr[]) {
		System.out.println("------------------------------------------------- Program 2 ------------------------------------------------");
		Arrays.sort(arr);
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i] == arr[i+1])
			{
				System.out.print(arr[i]+" ");
			}
		}
		
		System.out.println();
		
	}
	
	public static void uniArr(int arr[]) {
		System.out.println("------------------------------------------------- Program 3 ------------------------------------------------");
		int j =0;
		Arrays.sort(arr);
		int tem[] = new int[arr.length];
		
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i] !=arr[i+1]) 
			{
				tem[j++] = arr[i];
			}
		}
		
		tem[j++] = arr[arr.length-1];
		int uniA[] = Arrays.copyOf(tem, j);
		System.out.println("Original Array: "+Arrays.toString(arr));
		System.out.println("Unique Array: "+Arrays.toString(uniA));
	}
	
	public static void UnArray(Integer arr[]) {

		System.out.println("------------------------------------------------- Program 4 ------------------------------------------------"); //mmup, jout 
		System.out.println("Original Array: "+Arrays.toString(arr));
		Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(arr));
		Integer UnAr[] = set1.toArray(new Integer[0]);
		System.out.println("Unique Array: "+Arrays.toString(UnAr));
	}
	
	public static void UniString(String str[]) {
		System.out.println("------------------------------------------------- Program 5 ------------------------------------------------");
		System.out.println("Given String Array: "+Arrays.toString(str));
		Set<String> set1 = new HashSet<String>(Arrays.asList(str));
		String Un[] = set1.toArray(new String[0]);
		System.out.println("Uniques String Array: "+Arrays.toString(Un));
	}
	
	public static void checkPrime(int num) {
		System.out.println("------------------------------------------------- Program 6 ------------------------------------------------");
		int c =0;
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
		}else
		{
			System.out.println("Given number is not a Prime: "+num);
		}
	}
	
	public static void GeneratePrimeNumbers(int num1, int num2)
	{
		System.out.println("------------------------------------------------- Program 7 ------------------------------------------------");	
		for(int i =num1; i<=num2; i++)
		{
			int c  = 0;
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
	
	public static void checkPalandromeInt(int num1) {
		System.out.println("------------------------------------------------- Program 8 ------------------------------------------------");
		int num = num1;
		int rev = 0;
		
		while(num!=0)
		{
			rev = rev * 10 + num%10;
			num = num/10;
		}
		if(num1 == rev)
		{
			System.out.println("Given number is Palandrome: "+rev);
		}else
		{
			System.out.println("Given number is Not Palandrome: "+num1);
		}
		System.out.println("------------------------------------------------- Program 9 ------------------------------------------------");
	}
	
	
	public static String reverseString(String str) {
		
		if(str.length()<=1 || str==null)
		{
			return str;
		}
		char c1 = str.charAt(0);
		String rem = str.substring(1);
		
		return reverseString((rem))+c1;
		
	}
	
	public static void reverseString2(String str) {
		System.out.println("------------------------------------------------- Program 10 ------------------------------------------------");
		String rev = "";
		for(int i=str.length(); i<=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		if(rev.equals(str))
		{
			System.out.println("Given String is Palandrome: "+rev);
		}else
		{
			System.out.println("Given String is not a Palandrome: "+str);
		}
	}
	
	public static void secDigit(String str[]) {
		System.out.println("------------------------------------------------- Program 11 ------------------------------------------------");
		
		for(String eachWord:str) {
			char c1 = eachWord.charAt(1);
			if(Character.isDigit(c1))
			{
				System.out.print(eachWord+" ");
			}
		}
		System.out.println();	
	}
	
	public static void countChar(String str)
	{
		System.out.println("------------------------------------------------- Program 12 ------------------------------------------------");
		Map<Character, Integer> cmap = new HashMap<Character, Integer>();
		char cr[] = str.toCharArray();
		
		for(char c:cr)
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
		for(char c:cmap.keySet())
		{
			System.out.print(c+":"+cmap.get(c)+" ");
		}
		System.out.println();
		int max = Collections.max(cmap.values());
		for(char c:cmap.keySet())
		{
			if(max == cmap.get(c))
			{
				System.out.println("Maximum repeated value is "+c+":"+cmap.get(c));
			}
		}
		
	}
	
	public static void IntCount(int arr[]) {
		System.out.println("------------------------------------------------- Program 13 ------------------------------------------------");
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
		
		for(int i:imap.keySet())
		{
			System.out.print(i+":"+imap.get(i)+" ");
		}
		System.out.println();
		int max = Collections.max(imap.values());
		for(int i:imap.keySet())
		{
			if(max==imap.get(i))
			{
				System.out.println("Max repeated value is: "+i+":"+imap.get(i));
			}
		}
	}
	
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 30;
		int num3 = 1981;
		
		String str = "tttess";
		String str1[] = {"t2s", "b5T", "ram", "Raj", "h4", "Raj"};
				
		int arr[] = {1,1, 2, 2, 3, 4, 4, 5, 6};
		int arRe[] = {1,1, 2, 2, 3, 4, 4,4, 5, 6};
		int missingArr[] = {81, 83, 84, 85};
		Integer arr3[] = {1,1, 2, 2, 3, 4, 4,4, 5, 6};
		

		// Programs
		
		intSwap(num1, num2);
		duplicateValuesInArray(arr);
		uniArr(arr);
		UnArray(arr3);
		UniString(str1);
		checkPrime(num3);
		GeneratePrimeNumbers(num1, num2);
		checkPalandromeInt(num3);
		System.out.println(reverseString(str));
		reverseString2(str);
		secDigit(str1);
		countChar(str);
		IntCount(arr);
	}

}
