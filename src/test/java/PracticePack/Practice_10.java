package PracticePack;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Practice_10 {

	public static void intSwap(int num1, int num2) {
		int t= 0;
		System.out.println("---------------------------------------- Program 1 ---------------------------------------");
		System.out.println("Before swapping: "+num1+":"+num2);
		t = num1;
		num1 = num2;
		num2 = t;
		System.out.println("Before swapping: "+num1+":"+num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("Before swapping: "+num1+":"+num2);
		
		
	}
	
	public static void reverseIntPalandrom(int num1) {
		System.out.println("---------------------------------------- Program 2 ---------------------------------------");
		int num = num1;
		int rev = 0;
		while(num1!=0)
		{
			rev = rev*10 + num1%10;
			num1 = num1/10;
			
		}
		if(num==rev)
		{
			System.out.println("Given int is Palandrome: "+rev);
		}else
		{
			System.out.println("Given int is not a palandrome: "+num);
		}
	}
	
	public static void checkPrime(int num1)
	{
		System.out.println("---------------------------------------- Program 3 ---------------------------------------");
		int c=0;
		if(num1<=1)
		{
			System.out.println("Please eneter value more than: "+num1);
		}else
		{
			for(int i=1; i<=num1; i++)
			{
				if(num1%i == 0)
				{
					c++;
				}
			}
		}
		if(c==2)
		{
			System.out.println("Given number is Prime number: "+num1);
		}else
		{
			System.out.println("Given number is not Prime: "+num1);
		}
	}
	
	public static void generatePrimeNumbers(int num1, int num2)
	{
		System.out.println("---------------------------------------- Program 4 ---------------------------------------");
		for(int i = num1; i<=num2; i++)
		{
			int c = 0;
			for(int j=1; j<num2; j++)
			{
				if(i%j == 0)
				{
					c++;
				}
			}if(c==2)
			{
				System.out.print(i+" ");
				
			}
		}
		System.out.println();
	}
	
	public static void countInt(int arr[]) {
		System.out.println("---------------------------------------- Program 5 ---------------------------------------");
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
		
		// print the array with count int 
		for(int i:imap.keySet())
		{
			System.out.print(i+":"+imap.get(i)+" ");
		}
		int max = Collections.max(imap.values());
		System.out.println();
		for(int i:imap.keySet())
		{
			if(max == imap.get(i))
			{
				System.out.println("Max repeated value: "+i+":"+imap.get(i));
			}
		}
	}
	
	public static void duplicateValuesinArr(int arr[])
	{
		System.out.println("---------------------------------------- Program 6 ---------------------------------------");
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
	
	public static void UniqArray(int arr[])
	{
		System.out.println("---------------------------------------- Program 7 ---------------------------------------");
		int j=0;
		if(arr.length<=1 || arr==null)
		{
			System.out.println(Arrays.toString(arr));
		}else
		{
			Arrays.sort(arr);
			for(int i=0; i<arr.length-1; i++)
			{
				if(arr[i]!=arr[i+1])
				{
					arr[j++] = arr[i];
				}
			}
		}
		arr[j++] = arr[arr.length-1];
		int uniArr[] = Arrays.copyOf(arr, j);
		System.out.println(Arrays.toString(uniArr));
	}
	
	public static void missElement(int arr[])
	{
		System.out.println("---------------------------------------- Program 8 ---------------------------------------");
		int sum1 = 0; 
		int sum2 = 0;
		
		
		for(int i=0; i<arr.length-1; i++)
		{
			sum1 = sum1 + arr[i];
		}
		
		for(int i = arr[0]; i<arr[arr.length-1]; i++)
		{
			sum2 = sum2 + i;
		}
		int missingEl = (sum2 - sum1);
		System.out.println("Missing Element is: "+missingEl);
		
	}
	
	public static void uniArray(Integer [] arr)
	{
		System.out.println("---------------------------------------- Program 9 ---------------------------------------");
		System.out.println("Original given array: "+Arrays.toString(arr));
		Set<Integer> unique = new HashSet<Integer>(Arrays.asList(arr));
		Integer [] newarr = unique.toArray(new Integer[0]);
		System.out.println("New Array without duplicates: "+Arrays.toString(newarr));
	}
	
	public static void uniString(String[] str)
	{
		System.out.println("---------------------------------------- Program 10 ---------------------------------------");
		System.out.println("Original given array: "+Arrays.toString(str));
		Set<String> newSetString = new HashSet<String>(Arrays.asList(str));
		String [] uniStrings = newSetString.toArray(new String[0]);
		System.out.println("New Array without duplicates: "+Arrays.toString(uniStrings));
		
				
		
	}
	
	public static void countChar(String str)
	{
		System.out.println("---------------------------------------- Program 11 ---------------------------------------");
		char sarr[] = str.toCharArray();
		Map<Character, Integer> smap = new HashMap<Character, Integer>();
		
		for(char i:sarr)
		{
			if(!String.valueOf(i).isBlank())
			{
				if(smap.containsKey(i))
				{
					smap.put(i, smap.get(i)+1);
				}else
				{
					smap.put(i, 1);
				}
			}
		}
		
		for(char c:smap.keySet())
		{
			System.out.print(c+":"+smap.get(c)+" ");
		}
		System.out.println();
		int max = Collections.max(smap.values());
		
		for(char c:smap.keySet())
		{
			if(max == smap.get(c))
			{
				System.out.println("Max repeated char is: "+c+":"+smap.get(c));
			}
		}

	
		
	}
	
	public static void FindSecDigi(String str[])
	{
		System.out.println("---------------------------------------- Program 12 ---------------------------------------");
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
	
	
	public static void reverseStringPalandrome(String str) {
		System.out.println("---------------------------------------- Program 13 ---------------------------------------");
		String rev = "";
		for(int i=str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(str))
		{
			System.out.println("Given String is Palandrome: "+rev);
		}else
		{
			System.out.println("Given String is not a Palandrome: "+str);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		int num1 = 11;
		int num2 = 50;
		int num3 =112;
		
		int arr[] = {1,1, 2, 2, 3, 4, 4, 5, 6};
		int arRe[] = {1,1, 2, 2, 3, 4, 4,4, 5, 6};
		int missingArr[] = {86, 87, 88, 90};
		Integer arr3[] = {1,1, 2, 2, 3, 4, 4,4, 5, 6};
		
		String str = "TET";
		String str1[] = {"t2t", "Test", "H5G", "t2t"};
		
		// Programs
		intSwap(num1, num2);
		reverseIntPalandrom(num3);
		checkPrime(num1);
		generatePrimeNumbers(num1, num2);
		countInt(arRe);
		duplicateValuesinArr(arr);
		UniqArray(arRe);
		missElement(missingArr);
		uniArray(arr3);
		uniString(str1);
		countChar(str);
		FindSecDigi(str1);
		reverseStringPalandrome(str);
		
		
		
	}
}
