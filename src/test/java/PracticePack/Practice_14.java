package PracticePack;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;



public class Practice_14 {
	
	public static void intSwap(int num1, int num2) {
		System.out.println("-------------------------------------------- Program 1 --------------------------------------------------");
		System.out.println("Before Swapping numbers: "+num1+":"+num2);
		int t= 0;
		t = num1;
		num1 = num2;
		num2 = t; 
		System.out.println("Before Swapping numbers: "+num1+":"+num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("Before Swapping numbers: "+num1+":"+num2);
	}
	
	public static void findDuplicatesinArry(int arr[]) {
		System.out.println("-------------------------------------------- Program 2 --------------------------------------------------");
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
	
	public static void UniqArr(int arr[]) {
		System.out.println("-------------------------------------------- Program 3 --------------------------------------------------");
		
		int temp[] = new int[arr.length];
		int j =0;
		Arrays.sort(arr);
		
		for(int i =0; i<arr.length-1; i++) {
			if(arr[i] != arr[i+1])
			{
				temp[j++] = arr[i];
			}
			
		}
		temp[j++] = arr[arr.length-1];
		int newAr[] = Arrays.copyOf(temp, j);
		System.out.println("Original String: "+Arrays.toString(arr));
		System.out.println("Original String: "+Arrays.toString(newAr));
		System.out.println("-------------------------------------------- Program 4 --------------------------------------------------");
	}
	
	public static String reverseString(String str)
	{
		
		if(str.length()<=1 || str == null)
		{
			return str;
		}
		
		char c1 = str.charAt(0);
		String rem = str.substring(1);
		
		return reverseString((rem))+c1;
		
	}
	
	
	public static void revString(String str) {
		System.out.println();
		System.out.println("-------------------------------------------- Program 5 --------------------------------------------------");
		String rev = "";
		for(int i=str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		
		if(str.equals(rev))
		{
			System.out.println("Given String is Palandrome: "+rev);
		}else
		{
			System.out.println("Given String is not a Palandrome: "+str);
		}
	}
	
	public static void intrev(int num1)
	{
		System.out.println("-------------------------------------------- Program 6 --------------------------------------------------");
		int num = num1;
		int rev = 0;
		while(num1!=0)
		{
			rev = rev * 10 + num1 % 10;
			num1 = num1/10;
			
		}
		
		if(num == rev)
			
		{
			System.out.println("Given number is palandrome: "+rev);
		}else
		{
			System.out.println("Given number is not a Palandrome: "+num);
		}
	}
	
	public static void missingElement(int arr[]) {
		System.out.println("-------------------------------------------- Program 7 --------------------------------------------------");
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
	
	public static void UniArray(Integer arr[])
	{
		System.out.println("-------------------------------------------- Program 8 --------------------------------------------------");
		System.out.println("Given Array: "+Arrays.toString(arr));
		Set<Integer> ar = new HashSet<Integer>(Arrays.asList(arr));
		Integer[] un = ar.toArray(new Integer[0]);
		System.out.println("Given Array: "+Arrays.toString(un));
	}
	
	public static void uniStringAr(String str[])
	{
		System.out.println("-------------------------------------------- Program 9 --------------------------------------------------");
		System.out.println("Given Array: "+Arrays.toString(str));
		Set<String> str1 = new HashSet<String>(Arrays.asList(str));
		String uniAr[] = str1.toArray(new String[0]);
		System.out.println("Unique Array: "+Arrays.toString(uniAr));
	}
	
	
	public static void Wovels(String str) {
		System.out.println("-------------------------------------------- Program 10 --------------------------------------------------");
		boolean status = false;
		for(int i=0; i<str.length()-1; i++)
		{
			if(		str.charAt(i) == 'a' ||
					str.charAt(i) == 'e'||
					str.charAt(i) == 'i' ||
					str.charAt(i) == 'o' ||
					str.charAt(i) == 'u'
					)
				System.out.print(str.charAt(i)+" ");
			status = true;
		}
		
		if(status==false)
		{
			System.out.println("No Wovels are present in the Given String: "+ str);
		}
		System.out.println();
	}
	
	public static void secondDigit(String arr[])
	{
		System.out.println("-------------------------------------------- Program 11 --------------------------------------------------");
		for(String eachWord: arr)
		{
			char c1 = eachWord.charAt(1);
			if(Character.isDigit(c1))
			{
				System.out.print(eachWord+" "); 
				
			}
		}
	}

	public static void main(String[] args) {
		int num1 = 13;
		int num2 = 30;
		int num3 = 1218;
		
		String str = "tet";
		String str1[] = {"t2s", "b5T", "ram", "Raj", "h4", "Raj"};
				
		int arr[] = {1,1, 2, 2, 3, 4, 4, 5, 6};
		int arRe[] = {1,1, 2, 2, 3, 4, 4,4, 5, 6};
		int missingArr[] = {81, 83, 84, 85};
		Integer arr3[] = {1,1, 2, 2, 3, 4, 4,4, 5, 6};
		
		
		// executing the programs
		
		intSwap(num1, num2);
		findDuplicatesinArry(arr);
		UniqArr(arRe);
		System.out.print(reverseString(str));
		revString(str);
		intrev(num3);
		missingElement(missingArr);
		UniArray(arr3);
		uniStringAr(str1);
		Wovels(str);
		secondDigit(str1);
		
	}

}
