package PracticePack;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Practice_11 {
	
	public static void intSwap(int num1, int num2) {
		System.out.println("--------------------------------------------------------- Program 1 ------------------------------------------------");
		System.out.println("Before swapping the Variables: "+num1+":"+num2);
		int t = 0;
		t = num1;
		num1 = num2;
		num2 = t;
		System.out.println("Before swapping the Variables: "+num1+":"+num2);
		num1 = num1 + num2; // 40
		num2 = num1 - num2; // 40-30 = 10
		num1 = num1 - num2; // 40-10 = 30
		
		System.out.println("Before swapping the Variables: "+num1+":"+num2);
		
	}
	
	public static void chekPrime(int num1) {
		System.out.println("--------------------------------------------------------- Program 2 ------------------------------------------------");
		if(num1<=1)
		{
			System.out.println("Please enter the value more than: "+num1);
		}else
		{
			int c = 0;
			for(int i=1; i<=num1; i++)
			{
				if(num1%i == 0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.println("Given number is Prime: "+num1);
			}else
			{
				System.out.println("Given number is Not Prime: "+num1);
			}
		}
		
	}
	
	public static void generatePrimeNumbers(int num1, int num2) {
		System.out.println("--------------------------------------------------------- Program 3 ------------------------------------------------");
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
	}
	
	public static void reveseIntPalandrome(int num) {
		System.out.println("--------------------------------------------------------- Program 4 ------------------------------------------------");
		int rev = 0;
		int num1 = num;
		
		while(num!=0)
		{
			rev = rev * 10 + num%10;
			num = num/10;
		}
		if(rev ==num1)
		{
			System.out.println("Given int is Palandrome: "+rev);
		}else
		{
			System.out.println("Given int is not a Palandrome: "+num1);
		}
	}
	
	public static void revString(String str) {
		System.out.println("--------------------------------------------------------- Program 5 ------------------------------------------------");
		String rev = "";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		if(rev.equals(str))
		{
			System.out.println("Given String is Palandrome: "+rev);
		}else
		{
			System.out.println("Given String is Not Palandrome: "+str);
		}
	}
	
	public static void findSecDigit(String str[]) {
		System.out.println("--------------------------------------------------------- Program 6 ------------------------------------------------");
		for(String eachWord: str)
		{
			char c2 = eachWord.charAt(1);
			if(Character.isDigit(c2))
			{
				System.out.print(eachWord+" ");
			}
		}
		System.out.println();
	}
	
	public static void charcOunt(String str) {
		System.out.println("--------------------------------------------------------- Program 7 ------------------------------------------------");
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
		
		for(char c:cmap.keySet())
		{
			System.out.print(c+":"+cmap.get(c)+" ");
		}
		System.out.println();
		// Finding the max occurance Array
		int max  = Collections.max(cmap.values());
		for(char c:cmap.keySet())
		{
			if(max == cmap.get(c))
			{
				System.out.println("Max repeated Value is: "+c+":"+cmap.get(c));
			}
		}
		
	}
	
	public static void duplicateinArr(int arr[]) {
		System.out.println("--------------------------------------------------------- Program 8 ------------------------------------------------");
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
	
	public static void uniArr(int arr[])
	{
		System.out.println("--------------------------------------------------------- Program 9 ------------------------------------------------");
		int j =0;
		if(arr.length<=1 || arr==null)
		{
			System.out.println(Arrays.toString(arr));
		}else
		{
			for(int i=0; i<arr.length-1; i++)
			{
				if(arr[i]!=arr[i+1])
				{
					arr[j++] = arr[i];
				}
			}
		}
		arr[j++] = arr[arr.length-1];
		int uniarr[] = Arrays.copyOf(arr, j);
		System.out.println(Arrays.toString(uniarr));
	}
	
	public static void uniarrSet(Integer[] arr)
	{
		System.out.println("--------------------------------------------------------- Program 10 ------------------------------------------------");
		System.out.println("Given Array is: "+Arrays.toString(arr));
		Set<Integer> newAr = new HashSet<Integer>(Arrays.asList(arr));
		Integer [] una = newAr.toArray(new Integer[0]);
		System.out.println("Given Array is: "+Arrays.toString(una));
		
	}

	public static void uniString(String[] str)
	{
		System.out.println("--------------------------------------------------------- Program 11 ------------------------------------------------");
		System.out.println("Given Array is: "+Arrays.toString(str));
		Set<String> newStr = new HashSet<String>(Arrays.asList(str));
		String[] unStr = newStr.toArray(new String[0]);
		System.out.println("Given Array is: "+Arrays.toString(unStr));
	}
	
	
	public static void missingElementinArray(int arr[]) {
		System.out.println("--------------------------------------------------------- Program 12 ------------------------------------------------");
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
		int missingEl = (sum2 - sum1);
		System.out.println("Missing Elemement in Array: "+missingEl);
		
	}
	
	public static void main(String[] args) {
	
		// Declaring the variables
		int num1 = 11;
		int num2 = 30;
		int num3 = 121;
		
		String str = "tet";
		String str1[] = {"t2s", "b5T", "ram", "Raj", "h4", "Raj"};
				
		int arr[] = {1,1, 2, 2, 3, 4, 4, 5, 6};
		int arRe[] = {1,1, 2, 2, 3, 4, 4,4, 5, 6};
		int missingArr[] = {81, 83, 84, 85};
		Integer arr3[] = {1,1, 2, 2, 3, 4, 4,4, 5, 6};
		
		// Calling the methods 
		
		intSwap(num1, num2);
		chekPrime(num1);
		generatePrimeNumbers(num1, num2);
		reveseIntPalandrome(num3);
		revString(str);
		findSecDigit(str1);
		charcOunt(str);
		duplicateinArr(arr);
		uniArr(arr);
		uniarrSet(arr3);
		uniString(str1);
		missingElementinArray(missingArr);

	}

}
