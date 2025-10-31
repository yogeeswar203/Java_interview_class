package PracticePack;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class practice_03 {
	
	public static String reverseString(String str) {
		if(str.length()<=1 || str==null)
		{
			return str;
		}
		
		char c = str.charAt(0);
		String lastString = str.substring(1);
		return reverseString(lastString)+c;
	}
	
	public static void printOvwels(String str)
	{
		str = str.toLowerCase();
		for(int i=0; i<str.length()-1; i++)
		{
			char c = str.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c== 'u') {
				System.out.print(str.charAt(i)+" ");
			}
		}
		System.out.println();
	}
	
	public static void countCharOcc(String str) {
		
	char chararry[]	= str.toCharArray();
	Map<Character, Integer> charMap = new HashMap<Character, Integer>();
	
	for(char c:chararry)
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
	}
	
	public static void findMaxCharOcc(String str) {
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
		int maxOCC = Collections.max(charMap.values());
		System.out.println(maxOCC);
		
		for(char c:charMap.keySet())
		{
			if(maxOCC==charMap.get(c))
			{
				System.out.println(c+":"+charMap.get(c));
			}
		}
	}
	
	public static void maxIntOcc(int arr[]) {
		
		Map<Integer, Integer> inarr = new HashMap<Integer, Integer>();
		
		for(int i:arr)
		{
			if(inarr.containsKey(i))
			{
				inarr.put(i, inarr.get(i)+1);
			}else
			{
				inarr.put(i, 1);
			}
			
		}
		int maxO  = Collections.max(inarr.values());
		int mx = 0;
		for(int i:inarr.keySet())
		{
			if(mx<=inarr.get(i))
			{
				mx = inarr.get(i);
			}
		}
		System.out.println(mx);
		
		for(int i:inarr.keySet())
		{
			if(maxO==inarr.get(i))
			{
				System.out.println(i+":"+inarr.get(i));
			}
		}
		System.out.println();
	}
	
	

	public static void main(String[] args) {
		
		String str = "Tttttttggg";
		int arr[] = {1, 2,2, 2, 2, 3, 4};
		System.out.println(reverseString("test"));
		printOvwels("Aeiou");
		countCharOcc(str);
		findMaxCharOcc(str);
		maxIntOcc(arr);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
