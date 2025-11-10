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
		System.out.println();
		
	}
	
	public static  void uniqueArray(int[] arr) {
		int j=0;
		if(arr==null || arr.length<=1) {
			System.out.println(arr.toString());
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
		int arr3[] = Arrays.copyOf(arr, j);
		System.out.println(Arrays.toString(arr3));
		
	}
	
	
	public static void findUniqArray(int arr[]) {
		int j=0;
		if(arr.length<=1 || arr==null)
		{
			System.out.println(Arrays.toString(arr));
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
		int uniArray[] = Arrays.copyOf(arr, j);
		System.out.println(Arrays.toString(uniArray));
	}
	
	
	public static void main(String[] args) {
		int arr[] = {1,1, 2, 2, 3, 4, 4, 5, 6};
	
		int[] numbers = {5, 2, 8, 2, 5, 1, 8, 9};
		findDuplicateElementInArraY(arr);
		System.out.println(Arrays.toString(numbers));
		uniqueArray(numbers);
		findUniqArray(arr);
       
	}
}
