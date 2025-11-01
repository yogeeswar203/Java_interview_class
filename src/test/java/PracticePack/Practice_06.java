package PracticePack;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Practice_06 {

	public static void intSwap(int num1, int num2) {
		System.out.println("-------------------------------------- int Swap program 1---------------------------------------");
		int t = 0;
		System.out.println("Before swapping: "+num1 +":"+num2);
		t = num1;
		num1 = num2;
		num2 = t;
		System.out.println("Before swapping: "+num1 +":"+num2);
		
		num1 = num1 + num2;
		num1 = num1 - num2;
		num2 = num1 - num2;
		System.out.println("Before swapping: "+num1 +":"+num2);
		
	}
	public static void checkPrime(int num1) {
		System.out.println("-------------------------------------- Checking Prime Number program 2--------------------------");
		if(num1<=1) {
			System.out.println("Please enter the number more than 1");
		}else
		{
			int c=0;
			for(int i=1; i<=num1; i++)
			{
				if(num1%i == 0)
				{
					c++;
				}
			}if(c==2)
			{
				System.out.println("Prime number: "+num1);
			}else
			{
				System.out.println("Not a Prime number: "+num1);
			}
		}
	}
	
	public static void generatePrimeNumbers(int num1, int num2)
	{
		System.out.println("-------------------------------------- Genearting Prime Numbers program 3-----------------------");
		for(int i=num1; i<=num2; i++)
		{
			int c=0;
			for(int j=1; j<=num2; j++)
			{
				if(i%j ==0)
				{
					c++;
				}
			}if(c==2)
			{
				System.out.print(i+" ");
			}
		}
	}
	
	public static void countChar(String str) {
		System.out.println();
		System.out.println("----------------------------------Counting character in String  program 4-----------------------");
		
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
					charMap.put(c,1);
				}
			}
		}
		for(char c: charMap.keySet())
		{
			System.out.print(c+":"+charMap.get(c)+" ");
		}
		System.out.println();
		int max = Collections.max(charMap.values());
		
		for(char c:charMap.keySet())
		{
			if(max == charMap.get(c))
			{
				System.out.println("Max Repeated value: "+c+":"+charMap.get(c));
			}
		}
		
		
	}
	
	public static void countInt(int num[]) {
		System.out.println();
		System.out.println("----------------------------------Counting integer in program 5---------------------------------");
		
		Map<Integer, Integer> imap = new HashMap<Integer, Integer>();
		
		for(int i:num) {
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
		
		int max = Collections.max(imap.values());
		System.out.println();
		for(int i:imap.keySet())
		{
			if(max == imap.get(i))
			{
				System.out.print(i+":"+imap.get(i));
			}
		}
		System.out.println();
		System.out.println("----------------------------------Reverse String using recurssive in program 6------------------");
		
	}
	
	public static String revString(String str)
	{
		if(str.length()<=1 ||  str ==null)
		{
			return str;
		}
		char charAtZero = str.charAt(0);
		String strRemaining = str.substring(1);
		
		return (revString(strRemaining))+charAtZero;
	}
	
	public static void reverseString(String str) {
		System.out.println();
		System.out.println("----------------------------------Reverse String using normal in program 7 ---------------------");
		String rev ="";
		for(int i=str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
	
		if(str.equals(rev))
		{
			System.out.println("Given String is Palandrome: "+rev);
		}else
		{
			System.out.println("Given String is not Palandrome: "+str);
		}
	}
	
	public static void reverseInt(int num1) {
		System.out.println();
		System.out.println("----------------------------------Reverse int using normal in program 8 ------------------------");
		int rev = 0;
		int num = num1;
		
		while(num!=0)
		{
			rev = rev *10+ num%10;
			num=num/10;
		}
		if(rev==num1)
		{
			System.out.println("Given int is Palandrome: "+num1);
		}else
		{
			System.out.println("Given int is not Palandrome: "+num);
		}
	}
	
	public static void findSecDigit(String str[]) {
		System.out.println();
		System.out.println("----------------------------------Find second Digit word in program 9 --------------------------");
		for(String eachWord:str)
		{
			char secDigit = eachWord.charAt(1);
			if(Character.isDigit(secDigit))
			{
				System.out.print(eachWord+" ");
			}
		}
	} 
	
	public static void FindElementinArray(int arr[], int num)
	{
		System.out.println();
		System.out.println("----------------------------------Find Element in Array in program 10 --------------------------");
		for(int i:arr)
		{
			if(i==num)
			{
				System.out.println("Element Found: "+num);
				break;
			}
		}
	}
	
	public static void missingElementinArray(int arr[]) {
		System.out.println();
		System.out.println("----------------------------------Find missing in Array in program 11 --------------------------");
		int num =0;
		int num1 = 0;
		
		for(int i:arr)
		{
			num = num + i;
		}
		
		int sum2 =0;
		for(int k=0; k<=arr.length-1;k++)
		{
			sum2 = sum2 + k;
		}
		
		int c1 =arr[0];
		System.out.println("length"+arr.length);
		int l = ((arr.length)-1);
		int c2 = l;
		//System.out.println("length: "+c2);
		
		
		for(int j=c1; j<=c2; j++)
		{
			num1 = num1 + j;
			//System.out.println(num1);
		}
		
		System.out.println(num);
		System.out.println(num1);
		System.out.println("test: "+sum2);
		System.out.println("Missing Element in Array: "+(num - num1));
	}
	
	
	public static void main(String[] args) {
		int num1 = 121;
		int num2 = 100;
		String str ="Yoogi";
		int iarr[] = {1, 2, 2, 2, 3, 4, 5};
		String strArr[] = {"T2T", "tes", "22B"};
		int marr[] = {1,3,4};
		
		intSwap(num1, num2);
		checkPrime(num1);
		generatePrimeNumbers(num1, num2);
		countChar(str);
		countInt(iarr);
		System.out.println(revString(str));
		reverseString(str);
		reverseInt(num1);
		findSecDigit(strArr);
		FindElementinArray(iarr, 5);
		missingElementinArray(marr);
		
		int s1=0;
		for(int i=0; i<=3; i++)
		{
			s1 = s1 +i;
		}
		System.out.println(s1);

	}

}
