package Practice_Package2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Practice_02 {
	
	public static void intSwap(int num1, int num2) {
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
	
	public static void checkPrimeNumber(int num)
	{
		System.out.println();
		System.out.println("***************** Running Program 2 *************************");
		int c =0;
		if(num>=1) {
			
			for(int i=1; i<= num; i++)
			{
				if(num%i == 0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.println("Given number is Prime number: "+num);
			}else
			{
				System.out.println("Given number is not Prime Number: "+num);
			}
		}
		
	}
	
	public static void generatePrimeNumbers(int num1, int num2) {
		System.out.println();
		System.out.println("***************** Running Program 3 *************************");
		
		for(int i=num1; i<=num2; i++) {
			int c = 0;
			for(int j=1; j<num2; j++)
			{
				if(i%j == 0)
				{
					c++;
				}
				
			}
			if(c ==2)
			{
				System.out.print(i+" ");
			}
		
			
		}
	}
	
	public static void revString(String str)
	{
		System.out.println();
		System.out.println("***************** Running Program 4 *************************");
		String rev = "";
		for(int i=str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println("Revered String: "+rev);
	}
	
	public static String reverseStringMenthod2(String str) {
		if(str.length()<=1 || str == null)
		{
			return str;
		}
		
		char c1 = str.charAt(0);
		String rem = str.substring(1);
		return reverseStringMenthod2((rem))+c1;
	}
	
	
	
	public static void revint(int num1)
	{
		System.out.println();
		System.out.println("***************** Running Program 5 *************************");
		int act_num = num1;
		int rev = 0;
		
		while(num1!=0)
		{
			rev = rev * 10 + num1%10;
			num1 = num1/10;
		}
		
		//System.out.println("After reversing num: "+rev);
		if(act_num==rev)
		{
			System.out.println("Given int is palandrome: "+rev);
			
		}else
		{
			System.out.println("Given int is not a Palandrome: "+act_num);
		}
	}
	
	public static void StringPalandrome(String str) {
		System.out.println();
		System.out.println("***************** Running Program 6 *************************");
		String rev ="";
		for(int i= str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		if(rev.equals(str))
		{
			System.out.println("Given String is Palandrome: "+rev);
		}else
		{
			System.out.println("Given String is not Palandrome: "+str);
		}
	}
	
	public static void countStringChar(String str) {
		System.out.println();
		System.out.println("***************** Running Program 7 *************************");
		
		char charArr[] = str.toCharArray();
		Map<Character, Integer> charmap = new HashMap<Character, Integer>();
		
		for(char c:charArr)
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
		
		for(char c:charmap.keySet())
		{
			System.out.print(c+":"+charmap.get(c)+" ");
		}
		int maxv = Collections.max(charmap.values());
		System.out.println();
		for(char c:charmap.keySet())
		{
			if(maxv == charmap.get(c))
			{
				System.out.println("Maximum repeated value: "+c+":"+charmap.get(c));
			}
		}
		
	}
	
	public static void countOfNum(int arr[])
	{
		System.out.println();
		System.out.println("***************** Running Program 8 *************************");
		
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
		int maxV = Collections.max(imap.values());
		System.out.println();
		for(int i:imap.keySet())
		{
			if(maxV==imap.get(i))
			{
				System.out.println("Maximum repeated number is: "+i+":"+imap.get(i));
			}
		}
	}

	
	public static void main(String[] args) {
		int a= 10;
		int b = 20;
		String str = "tetttttt";
		int m = 12521;
		int arr[] = {1, 2, 2, 2, 3};
		
		intSwap(a, b);
		checkPrimeNumber(a);
		generatePrimeNumbers(a, b);
		revString(str);
		revint(m);
		StringPalandrome(str);
		countStringChar(str);
		countOfNum(arr);
		System.out.println("Revered string method 2: " +reverseStringMenthod2(str));
		

	}

}
