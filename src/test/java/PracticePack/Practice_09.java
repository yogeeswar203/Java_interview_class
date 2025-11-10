package PracticePack;

import java.util.Arrays;

public class Practice_09 {

	public static void findDuplicateElementInArraY(int arr[]) {
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.print(arr[i]+" ");
				}
			}
		}
		
	}
	
	public static int[] uniqueArray(int[] arr) {
		int j=0;
		if(arr==null || arr.length<=1) {
			return arr;
		}else
		{
			Arrays.sort(arr);
			
			for(int i=0; i<arr.length-1; i++)
			{
				if(arr[i]!=arr[i+1])
				{
					arr[j++] = arr[i];
				}
			}
			
		}
		arr[j++] = arr[arr.length-1];
		return Arrays.copyOf(arr, j);
		
	}
	
	
	public static void main(String[] args) {
		int arr[] = {1,1, 2, 2, 3, 4, 4, 5, 6};
	
		int[] numbers = {5, 2, 8, 2, 5, 1, 8, 9};
		findDuplicateElementInArraY(arr);
		int[] arr2 = uniqueArray(arr);
		System.out.println(Arrays.toString(arr2));
       
	}
}
