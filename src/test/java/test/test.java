package test;

import java.util.HashMap;
import java.util.Map;

public class test {
	
	
	public static String reverseStringRecursive(String str)
	{
		if(str==null || str.length()<=1)
		{
			return str;
		}
		return reverseStringRecursive(str.substring(1))+str.charAt(0);
		
	}

	public static void countInt(int[] itr1)
	{
		Map<Integer, Integer> intmap = new HashMap<Integer, Integer>();
		
		for(int i:itr1) {
			
			if(intmap.containsKey(i)) {
				intmap.put(i, intmap.get(i)+1);
			}else
			{
				intmap.put(i, 1);
			}
		}
		System.out.println(intmap);
	
		
		int max =0;
		for(int j:intmap.keySet())
		{
			if(max<=intmap.get(j))
			{
				max = intmap.get(j);
			}
		}
		System.out.println(max);
		
		for(int k:intmap.keySet())
		{
			if(max == intmap.get(k))
			{
				System.out.println(k+":"+intmap.get(k));
			}
		}
		
	}
	
	public static void swapNum(int n1, int n2) {
		System.out.println("Before Swap: "+n1+":"+n2);
		int t = 0;
		t = n1;
		n1 = n2;
		n2 = t;
		System.out.println("Before Swap: "+n1+":"+n2);
		n1 = n1 + n2;
		n2 = n1-n2;
		n1 = n1-n2;
		System.out.println("Before Swap: "+n1+":"+n2);
		
	}
	
	public static void checkPalandrome(int n1) {
		
		int n2 = 0;
		int or = n1;
		while(n1!=0) {
			n2=n2*10 + n1%10;
			n1 = n1/10;
		}
		if(or == n2) {
			System.out.println("Both are equal: "+n2);
		}else
		{
			System.out.println("Given number is not a Palandrome: "+n2);
		}
		
	}
	
	public static String chekPalandromeString(String str) {
		
		if(str==null || str.length()<1)
		{
			return str;
		}
		return chekPalandromeString(str.substring(1))+str.charAt(0);
		
	}
	
	public static void CheckPalandromeStrin(String str)
	{
		String rev = "";
		String org = str;
		for(int i=str.length()-1; i>=0; i--) {
			rev = rev+str.charAt(i);
		}
		System.out.println("rev: "+rev);
		if(rev.equals(org))
		{
			System.out.println("Palandrome: "+rev);
		}else {
			System.out.println("Not a Palandrome String "+rev);
		}
	}
	
	public static void chekPrime(int num) {
		if((num<=0) || num==1) {
			System.out.println("Please enter value more than 1");
		}
		int count =0;
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				count++;
			}
			
		}
		if(count==2) {
			System.out.println("Prime");
		}else
		{
			System.out.println("Not a Prime");
		}
	}
	
	
	public static void generateRangePri(int n1, int n2) {
		
		for(int i=0; i<=n2; i++) {
			int con =0;
			for(int j=1; j<=n2; j++)
			{
				if(i%j ==0) {
					con++;
				}
			}if(con == 2) {
				System.out.print(i+" ");
			}
		}
	}
	
	public static void main(String[] args) {
	
		String s = "tet";
		int[] irr = {1, 2, 3, 4, 6, 6, 6,};
		//System.out.println(reverseStringRecursive(s));
		countInt(irr);
		swapNum(10, 20);	
		checkPalandrome(121112);
		System.out.println(chekPalandromeString(s));
		CheckPalandromeStrin(s);
		chekPrime(23);
		generateRangePri(1, 20);
		
	}
		
}

