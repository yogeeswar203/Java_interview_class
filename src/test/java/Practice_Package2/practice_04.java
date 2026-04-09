package Practice_Package2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.hpsf.Array;

public class practice_04 {
	
	public static void intSwap(int num1, int num2)
	{
		System.out.println("***************** Running Program 1 *************************");
		System.out.println("Before swapping the numbers: "+num1+":"+num2);
		int t = 0;
		t = num1;
		num1 = num2;
		num2 = t;
		System.out.println("Before swapping the numbers: "+num1+":"+num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("Before swapping the numbers: "+num1+":"+num2);
	}
	
	public static void checkPrime(int num1)
	{
		System.out.println();
		System.out.println("***************** Running Program 2 *************************");
		
		if(num1>1)
		{
			int c= 0;
			for(int i=1; i<=num1; i++)
			{
				if(num1%i == 0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.println("Prime: "+num1);
			}else
			{
				System.out.println("Not Prime: "+num1);
			}
		}else
		{
			System.out.println("Please enter the number more than 1");
		}
	}
	
	public static void generatePrimeNumbers(int num1,int num2)
	{
		System.out.println();
		System.out.println("***************** Running Program 3 *************************");
		
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
	}
	
	public static void revInt(int num1)
	{
		System.out.println();
		System.out.println("***************** Running Program 4 *************************");
		int ac = num1;
		int rev = 0;
				
		
		while(num1!=0)
		{
			rev = rev *10 + num1%10;
			num1 = num1/10;
		}
		System.out.println("After reversring the number is: "+rev);
		if(rev == ac)
		{
			System.out.println("Given number is Palandrome: "+rev);
		}else
		{
			System.out.println("Given number is not palandrome: "+rev);
		}
		
	}
	
	public static void revString(String str)
	{
		System.out.println();
		System.out.println("***************** Running Program 5 *************************");
		String rev = "";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println("After reversing the string: "+rev);
		
		if(str.equals(rev))
		{
			System.out.println("Given String is Palandrome: "+rev);
		}else
		{
			System.out.println("Given string is not a Palandrome: "+str);
		}
	}
	
	public static void countStringChar(String str)
	{
		System.out.println();
		System.out.println("***************** Running Program 6 *************************");
		char charArr[] = str.toCharArray();
		Map<Character, Integer> cmap = new HashMap<Character, Integer>();
		
		for(char c:charArr)
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
		
		int max = Collections.max(cmap.values());
		System.out.println();
		for(char c:cmap.keySet())
		{
			if(max == cmap.get(c))
			{
				System.out.println("Maximum repeated character is  "+c+":"+cmap.get(c));
			}
		}
	}
	
	public static void countOfNum(int arr[])
	{
		System.out.println();
		System.out.println("***************** Running Program 7 *************************");
		
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
				System.out.println("Maximum repeated value is: "+i+":"+imap.get(i));
			}
		}
			
	}
	
	public static String reverseStringMenthod2(String str)
	{
		
		if(str.length() ==1 || str==null)
		{
			return str;
		}
		char c= str.charAt(0);
		String rem = str.substring(1);
		return reverseStringMenthod2((rem))+c;
		
	}
	
	
	public static void duplicateValue(int arr[])
	{
		System.out.println();
		System.out.println("***************** Running Program 9 *************************");
		Arrays.sort(arr);
		System.out.println("Given Array after sorting: "+Arrays.toString(arr));
		System.out.println("Duplicate Values are ");
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i]==arr[i+1])
			{
				if(i==0 || arr[i]!=arr[i-1])
				{
					System.out.print(arr[i]+" ");
				}
			}
		}
	
	}
	
	public static void uniQArray(int arr[])
	{
		System.out.println();
		System.out.println("***************** Running Program 10 *************************");
		int j=0;
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
		int uniArray[] = Arrays.copyOf(temp, j);
		System.out.println("Original Array: "+Arrays.toString(arr));
		System.out.println("Original Array: "+Arrays.toString(uniArray));
		
	}
	


	public static void main(String[] args) {
		int a= 11;
		int b = 20;
		String str = "test";
		int m = 12521;
		//int arr[] = {1, 2, 2, 2, 3};
		int arr1[] = {1,1,2, 3, 4, 4,4, 5, 6,6,6};
		//Integer arr2[] = {1,1, 2,2, 2, 3, 4, 4, 5, 6};
		
		intSwap(a, b);
		checkPrime(a);
		generatePrimeNumbers(a, b);
		//revString(str);
		revInt(m);
		revString(str);
		countStringChar(str);
		countOfNum(arr1);
		System.out.println();
		System.out.println("***************** Running Program 8 *************************");
		System.out.println("Revered string method 2: " +reverseStringMenthod2(str));
		
		// programs on Arrays 
		duplicateValue(arr1);
		
		//uniArryValues(arr1);
		uniQArray(arr1);
		//uniArraySet(arr2);
		// secDigit(str1); UniqueArry(arRe); uniArraySet(arr3);
	}

}
