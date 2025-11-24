package PracticePack;

import java.util.Arrays;

public class Practice_15 {

	public static void intSwap(int num1, int num2) {
		System.out.println("------------------------------------------------- Program 1 ------------------------------------------------");
		System.out.println("Before Swapping Num: "+num1 +":"+num2);
		int t=0;
		t = num1;
		num1 = num2;
		num2 = t;
		System.out.println("Before Swapping Num: "+num1 +":"+num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("Before Swapping Num: "+num1 +":"+num2);
	}
	
	public static void duplicateValuesInArray(int arr[]) {
		System.out.println("------------------------------------------------- Program 2 ------------------------------------------------");
		Arrays.sort(arr);
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i] == arr[i+1])
			{
				System.out.print(arr[i]+" ");
			}
		}
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 30;
		int num3 = 1218;
		
		String str = "tet";
		String str1[] = {"t2s", "b5T", "ram", "Raj", "h4", "Raj"};
				
		int arr[] = {1,1, 2, 2, 3, 4, 4, 5, 6};
		int arRe[] = {1,1, 2, 2, 3, 4, 4,4, 5, 6};
		int missingArr[] = {81, 83, 84, 85};
		Integer arr3[] = {1,1, 2, 2, 3, 4, 4,4, 5, 6};
		

		// Programs
		
		intSwap(num1, num2);
		duplicateValuesInArray(arr);
	}

}
