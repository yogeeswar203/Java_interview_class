package PracticePack;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Practice_13 {

	public static void intSwap(int num1, int num2) {
		System.out.println("--------------------------------------------- Program 1 ----------------------------------------------------");
		System.out.println("Before Swapping numbers: "+num1+":"+num2);
		int t= 0;
		t = num1;
		num1 = num2;
		num2 = t;
		System.out.println("Before Swapping numbers: "+num1+":"+num2);
		num1 = num1+num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("Before Swapping numbers: "+num1+":"+num2);
	}
	
	public static void duplicateNum(int arr[]) {
		System.out.println("--------------------------------------------- Program 2 ----------------------------------------------------");
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
	
	public static void UniArr(int arr[]) {
		System.out.println("--------------------------------------------- Program 3 ----------------------------------------------------");
		int temp[] = new int[arr.length];
		int j=0;
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[arr.length-1];
		int uni[] = Arrays.copyOf(temp, j);
		System.out.println("Original Array: "+Arrays.toString(arr));
		System.out.println("Uniques  Array: "+Arrays.toString(uni));
	}
	
	public static void uniqueArry(Integer arr[]) {
		System.out.println("--------------------------------------------- Program 4 ----------------------------------------------------");
		System.out.println("Given Array: "+Arrays.asList(arr));
		Set<Integer> ar = new HashSet<Integer>(Arrays.asList(arr));
		Integer unar[] = ar.toArray(new Integer[0]);
		System.out.println("Given Array: "+Arrays.asList(unar));
		
		
	}
	
	public static void uniString(String str[]) {
		System.out.println("--------------------------------------------- Program 5 ----------------------------------------------------");
		System.out.println("Given Array: "+Arrays.asList(str));
		Set<String> str1 = new HashSet<String>(Arrays.asList(str));
		String st[] = str1.toArray(new String[0]);
		System.out.println("Given Array: "+Arrays.asList(st));
	}
	
	public static void chekPrime(int num) {
		System.out.println("--------------------------------------------- Program 6 ----------------------------------------------------");
		int c = 0;
		for(int i=1; i<=num; i++)
		{
			if(num%i == 0)
			{
				c++;
			}
		}
		if(c==2)
		{
			System.out.println("Given number is Prime: "+num);
		}else
		{
			System.out.println("Given number is not a Prime: "+num);
		}
	}
	
	public static void generatePrimeNumbers(int num1, int num2) {
		System.out.println("--------------------------------------------- Program 7 ----------------------------------------------------");
		for(int i=num1; i<=num2; i++)
		{
			int c = 0;
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

	public static void Owvels(String str) {
		System.out.println("--------------------------------------------- Program 8  ----------------------------------------------------");
		boolean status = true;
		for(int i=0; i<str.length(); i++)
		{
			if(	str.charAt(i) == 'a' ||
				str.charAt(i) == 'e' ||
				str.charAt(i) == 'i' ||
				str.charAt(i) == 'o' ||
				str.charAt(i) == 'u') {
				
				System.out.println(str.charAt(i));
			}else
			{
				status = false;
			}
			
		}
		if(status = false)
		{
			System.out.println("No Wovels are present: "+str);
		}
	}
	
	public static void intPalandrome(int num) {
		System.out.println("--------------------------------------------- Program 9  ----------------------------------------------------");
		int num1 = num;
		int rev = 0;
		
		while(num!=0)
		{
			rev = rev *10 + num %10;
			num = num/10;
		}
		if(num1 == rev)
		{
			System.out.println("Given Number is Palandrome: "+rev);
		}else
		{
			System.out.println("Given Number is not a Palandrome: "+num);
		}
	}
	
	public static void StringPalandrom(String str) {
		System.out.println("--------------------------------------------- Program 10  ----------------------------------------------------");
		String rev = "";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		if(rev.equals(str))
		{
			System.out.println("Given String is Palandrome: "+ rev);
		}else
		{
			System.out.println("Given String is Not a Palandrome: "+str);
		}
	}
	
	public static void missingElement(int arr[]) {
		System.out.println("--------------------------------------------- Program 11  ----------------------------------------------------");
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
		
		System.out.println("Missing Element: "+(sum2-sum1));
	}
	
	public static void main(String[] args) {
		
		int num1 = 13;
		int num2 = 30;
		int num3 = 121;
		
		String str = "tet";
		String str1[] = {"t2s", "b5T", "ram", "Raj", "h4", "Raj"};
				
		int arr[] = {1,1, 2, 2, 3, 4, 4, 5, 6};
		//int arRe[] = {1,1, 2, 2, 3, 4, 4,4, 5, 6};
		int missingArr[] = {81, 83, 84, 85};
		Integer arr3[] = {1,1, 2, 2, 3, 4, 4,4, 5, 6};
		
		
		intSwap(num1, num2);
		duplicateNum(arr);
		UniArr(arr);
		uniqueArry(arr3);
		uniString(str1);
		chekPrime(num1);
		generatePrimeNumbers(num1, num2);
		Owvels(str);
		intPalandrome(num3);
		StringPalandrom(str);
		missingElement(missingArr);
		
	}
	
}
