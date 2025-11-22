package PracticePack;

import java.lang.reflect.Array;
import java.util.Arrays;

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
		
		int j =0;
		int temp[] = new int [arr.length];
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i] != arr[i+1])
			{
				temp[j++] = arr[i];
			}
		}
		
		temp[j++] = arr[arr.length-1];
		int newA[] = Arrays.copyOf(temp, j);
		System.out.println("Original String: "+Arrays.toString(arr));
		System.out.println("Original String: "+Arrays.toString(newA));
		
	}

	public static void main(String[] args) {
		int num1 = 13;
		int num2 = 30;
		int num3 = 121;
		
		String str = "twt";
		String str1[] = {"t2s", "b5T", "ram", "Raj", "h4", "Raj"};
				
		int arr[] = {1,1, 2, 2, 3, 4, 4, 5, 6};
		int arRe[] = {1,1, 2, 2, 3, 4, 4,4, 5, 6};
		int missingArr[] = {81, 83, 84, 85};
		Integer arr3[] = {1,1, 2, 2, 3, 4, 4,4, 5, 6};
		
		
		// executing the programs
		
		intSwap(num1, num2);
		findDuplicatesinArry(arr);
		UniqArr(arRe);

	}

}
