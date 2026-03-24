package Practice_Package2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;



public class practice_01 {

	public static void display() {
		System.out.println("Thi is re-start program from me");
	}
	
	public static void intSwap(int num1, int num2){
		System.out.println("Before swapping the numbers: "+num1 +":"+num2);
		int temp = 0;
		
		temp = num1; // temp = 10
		num1 = num2; // num1 = 20
		num2 = temp; // num2 = 10
		System.out.println("Before swapping the numbers: "+num1 +":"+num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("Before swapping the numbers: "+num1 +":"+num2);
		
	}
	
	
	public static void charCount(String str) {
		//System.out.println();
		System.out.println("****************** Program 3****************");
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
	}
	
	
	public static void intCountintArray(int num[]) {
		System.out.println();
		System.out.println("****************** Program 3****************");
		Map<Integer, Integer> imap = new HashMap<Integer, Integer>();
		
		for(int i:num)
		{
			if(imap.containsKey(i))
			{
				imap.put(i, imap.get(i)+1);
			}else
			{
				imap.put(i, 1);
			}
		}
		
		for(int i: imap.keySet())
		{
			System.out.print(i+":"+imap.get(i)+" ");
		}
		System.out.println("");
		int maxv = Collections.max(imap.values());
		for(int i:imap.keySet())
		{
			if(maxv == imap.get(i))
			{
				System.out.println("Maximum repeated value is: "+i+":"+imap.get(i));
			}
		}
	}
	
	public static void revString(String str) {
		System.out.println();
		System.out.println("****************** Program 4 ****************");
		String rev = "";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			rev = rev+str.charAt(i);
		}
		
		System.out.println("After reversing the string: "+rev);
		
	}
	
	
	public static void checkintPalandrome(int num)
	{
		System.out.println();
		System.out.println("****************** Program 5 ****************");
		int rev = 0;
		int act_num = num;
		
		while(num!=0)
		{
			rev = rev*10 + rev % 10;
			num = num/10;
		}
		
		if(rev == act_num)
		{
			System.out.println("Given number is palandrome: "+rev);
		}else
		{
			System.out.println("Given number is not a palandrome: "+act_num);
		}
		
	}
	
	public static void checkPrime(int num) {
		System.out.println();
		System.out.println("****************** Program 5 ****************");
		
		int c= 0;
		
		for(int i=1; i<=num; i++)
		{
			if(num%i ==0)
			{
				c++;
			}
		}
		
		if(c==2)
		{
			System.out.println("Prime Number: "+num);
		}else
		{
			System.out.println("Not Prime Number: "+num);
		}
	}
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int num3 = 11011;
		String str = "Yogee";
		int arr[] = {1, 2, 2, 2, 3, 4, 4, 5};
		
		
		display();
		intSwap(num1, num2);
		charCount(str);
		intCountintArray(arr);
		revString(str);
		checkintPalandrome(num3);
		checkPrime(num1);
	}

}
