package Practice_Package2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class practice_03 {
	public static void intSwap(int num1, int num2)
	{
		System.out.println("-------------------------------------------------- Program 1 ------------------------------------------------");
		System.out.println("Before swapping the numbers: "+num1+":"+num2);
		int t=0;
		t 		= num1;
		num1 	= num2;
		num2 	= t;
		System.out.println("Before swapping the numbers: "+num1+":"+num2);
		num1 = num1 + num2;
		num2 = num1-num2;
		num1 = num1-num2;
		System.out.println("Before swapping the numbers: "+num1+":"+num2);
	}
	
	public static void sceDigit(String arr[]) {
		
		System.out.println("-------------------------------------------------- Program 2 ------------------------------------------------");
		for(String eachWord: arr)
		{
			char c=eachWord.charAt(1);
			if(Character.isDigit(c))
			{
				System.out.print(eachWord+" ");
			}
		}
		System.out.println();
	}
	
	public static void checkPrimeNumber(int num1)
	{
		System.out.println("-------------------------------------------------- Program 3 ------------------------------------------------");
		if(num1>1)
		{
			int c =0;
			for(int i=1; i<=num1; i++)
			{
				if(num1%i ==0)
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
			System.out.println("Please eneter the value more than 1");
		}
	}
	
	public static void generatePrimeNumbers(int num1, int num2)
	{
		System.out.println("-------------------------------------------------- Program 4 ------------------------------------------------");
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
	
	public static void revString(String str)
	{
		System.out.println("-------------------------------------------------- Program 5------------------------------------------------");
		String rev = "";
		for(int i=str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println("Actual String: "+str);
		System.out.println("Reversed String: "+rev);
	}
	
	public static String reverseStringMenthod2(String str)
	{
		if(str.length()<=1 || str == null)
		{
			return str;
		}
		
		char c = str.charAt(0);
		String rem = str.substring(1);
		return reverseStringMenthod2((rem))+c;
	}
	
	public static void revint(int num1)
	{
		System.out.println("-------------------------------------------------- Program 7------------------------------------------------");
		int ac = num1;
		int rev = 0;
		while(ac!=0)
		{
			rev = rev * 10 + ac%10;
			ac = ac/10;
		}
		System.out.println("After reversing the number: "+rev);
		if(rev == num1)
		{
			System.out.println("Given number is Palandrome: "+rev);
		}else
		{
			System.out.println("Given number is not a palandrome: "+num1);
		}
	}
	
	public static void StringPalandrome(String str)
	{
		System.out.println("-------------------------------------------------- Program 8------------------------------------------------");
		String rev="";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		
		if(rev.equals(str))
		{
			System.out.println("Given string is Palandrome: "+rev);
		}else
		{
			System.out.println("Given String is not a Palandrome: "+str);
		}
	}
	
	public static void countStringChar(String str)
	{
		System.out.println("-------------------------------------------------- Program 9------------------------------------------------");
		
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
		System.out.println();
		int max = Collections.max(cmap.values());
		
		
		for(char c1:cmap.keySet())
		{
			if(max==cmap.get(c1))
			{
				System.out.println((c1+":"+cmap.get(c1)));
			}
		}
	}
	
	public static void countOfEachVal(int arr[])
	{
		System.out.println("-------------------------------------------------- Program 10------------------------------------------------");
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
		
		int max = Collections.max(imap.values());
		for(int i:imap.keySet())
		{
			if(max == imap.get(i))
			{
				System.out.println("Max repeated value: "+i+":"+imap.get(i));
			}
		}
		
		for(int i:imap.keySet())
		{
			System.out.print(i+":"+imap.get(i)+" ");
		}
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 23;
		int num3 = 181;
		
		String str = "tet";
		String str1[] = {"t2s", "b5T", "ram", "Raj", "h4", "Raj"};
				
		int arr[] = {1,1, 2, 3, 4, 4, 5, 6,6,6,6};    
		int arRe[] = {1,1, 2, 2, 3, 4, 4,4, 5, 6};
		int missingArr[] = {81, 83, 84, 85};
		Integer arr3[] = {1,1, 2, 2, 3, 4, 4,4, 5, 6};

		intSwap(num1, num2);
		sceDigit(str1);
		checkPrimeNumber(num1);
		generatePrimeNumbers(num1, num2);
		revString(str);
		System.out.println("-------------------------------------------------- Program 6------------------------------------------------");
		System.out.println("Revered string method 2: " +reverseStringMenthod2(str));
		revint(num3);
		StringPalandrome(str);
		countStringChar(str);
		countOfEachVal(arr);
		//System.out.println();
		
		
		// programs on Arrays 
		//duplicateValue(arr1);
		//uniArryValues(arr1);
		//uniQArray(arr1);
		//uniArraySet(arr2);
		
		
		
	}

}
