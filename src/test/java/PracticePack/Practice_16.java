package PracticePack;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Practice_16 {
	
	public static void intSwap(int num1, int num2) {
		System.out.println("-------------------------------------------------- Program 1 ------------------------------------------------");
		System.out.println("Before Swapping numbers: "+num1+":"+num2);
		int t= 0;
		t = num1;
		num1 = num2;
		num2 = t;
		System.out.println("Before Swapping numbers: "+num1+":"+num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("Before Swapping numbers: "+num1+":"+num2);
		
	}

	public static void reverseInt(int num1) {
		System.out.println("-------------------------------------------------- Program 2 ------------------------------------------------");
		int num = num1;
		int rev = 0;
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num = num/10;
			
		}
		if(num1 == rev)
		{
			System.out.println("Given number is Palandrome: "+rev);
		}else
		{
			System.out.println("Given number is not palandrome:"+num1);
		}
		System.out.println("-------------------------------------------------- Program 3 ------------------------------------------------");
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
	
	public static void reverseString1(String str)
	{
		System.out.println("-------------------------------------------------- Program 4 ------------------------------------------------");
		String rev = "";
		for(int i=str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println("Reversed String is: "+rev);
		if(str.equals(rev))
		{
			System.out.println("Given String is Palandrome: "+rev);
		}else
		{
			System.out.println("Given String is not palandrome: "+str);
		}
	}
	
	public static void duplicateValue(int arr[])
	{
		System.out.println("-------------------------------------------------- Program 5 ------------------------------------------------");
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
	
	public static void UniqueArry(int arr[]) {
		System.out.println("-------------------------------------------------- Program 6 ------------------------------------------------");
		int j= 0;
		Arrays.sort(arr);
		int temp[] = new int[arr.length];
		
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[arr.length-1];
		int unia[] = Arrays.copyOf(temp, j);
		System.out.println("Original Array: "+Arrays.toString(arr));
		System.out.println("Unique   Array: "+Arrays.toString(unia));
	}
	
	public static void uniArraySet(Integer arr[])
	{
		System.out.println("-------------------------------------------------- Program 7 ------------------------------------------------");
		Set<Integer> s1 = new HashSet<Integer>(Arrays.asList(arr));
		Integer un[] = s1.toArray(new Integer[0]);
		System.out.println("Original Aary: "+Arrays.toString(arr));
		System.out.println("Unique Array: "+Arrays.toString(un));
		
	}
	
	public static void charCount(String str)
	{
		System.out.println("-------------------------------------------------- Program 8 ------------------------------------------------");
		char carr [] = str.toCharArray();
		Map<Character, Integer> cmap = new HashMap<Character, Integer>();
		
		for(char c:carr)
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
				System.out.println("Max Repeated value is: "+c+":"+cmap.get(c));
			}
		}
	}
	
	public static void intCount(int arr[])
	{
		System.out.println("-------------------------------------------------- Program 9 ------------------------------------------------");
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
			if(max == imap.get(i))
			{
				System.out.println("Maximu repeated value is: "+i+":"+imap.get(i));
			}
		}
	}
	
	public static void secDigit(String arr[])
	{
		System.out.println("-------------------------------------------------- Program 10 ------------------------------------------------");
		for(String eachword:arr)
		{
			char c1 = eachword.charAt(1);
			if(Character.isDigit(c1))
			{
				System.out.print(eachword+" ");
			}
		}
		System.out.println();
	}
	
	public static void checkPrime(int num)
	{
		System.out.println("-------------------------------------------------- Program 11 ------------------------------------------------");
		int c= 0;
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
		}else
		{
			System.out.println("Given number is not Prime: "+num);
		}
	}
	
	public static void GeneratePrimeNumbers(int num1, int num2)
	{
		System.out.println("-------------------------------------------------- Program 12 ------------------------------------------------");
		for(int i=num1; i<=num2; i++)
		{
			int c= 0;
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
	
	public static void missingNumber(int arr[])
	{
		System.out.println("-------------------------------------------------- Program 13 ------------------------------------------------");
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
		
		System.out.println("Missing element in Array: "+(sum2-sum1));
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 30;
		int num3 = 1981;
		
		String str = "tttess";
		String str1[] = {"t2s", "b5T", "ram", "Raj", "h4", "Raj"};
				
		int arr[] = {1,1, 2,2, 2, 3, 4, 4, 5, 6};    
		int arRe[] = {1,1, 2, 2, 3, 4, 4,4, 5, 6};
		int missingArr[] = {81, 83, 84, 85};
		Integer arr3[] = {1,1, 2, 2, 3, 4, 4,4, 5, 6};
		
		
		intSwap(num1, num2);
		reverseInt(num3);
		System.out.println("Reversed String is: "+reverseString(str));
		reverseString1(str);
		duplicateValue(arr);
		UniqueArry(arRe);
		uniArraySet(arr3);
		charCount(str);
		intCount(arr);
		secDigit(str1);
		checkPrime(num2);
		GeneratePrimeNumbers(num1, num2);
		missingNumber(missingArr);
		
		      
	}
}
