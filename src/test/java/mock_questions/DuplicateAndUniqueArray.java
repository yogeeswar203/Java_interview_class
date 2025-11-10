package mock_questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateAndUniqueArray {
	
	public static void duplicateValues(int arr[])
	{
		for(int i=0; i<arr.length-1; i++)
		{
			Arrays.sort(arr);
			if(arr[i] == arr[i+1])
			{
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
	
	
	public static void setArray(int arr[]) {
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
		int uarr[]= Arrays.copyOf(arr, j);
		System.out.println(Arrays.toString(uarr));
		
	}
	
	public static void uniArraySet(String arr[]) {
		
		
    }

	
	public static void finddu(int arr[]) {
		
		for(int i=0; i<arr.length-1; i++)
		{
			Arrays.sort(arr);
			if(arr[i] == arr[i+1])
			{
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
		
	public static void uni(int arr[]) {
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
		int uniar[] = Arrays.copyOf(arr, j);
		System.out.println(Arrays.toString(uniar));
	}
	

	public static void main(String[] args) {
		int arr[] = {5, 2, 8, 2, 5, 1, 8, 9};
		duplicateValues(arr);
		setArray(arr);
		int arr2[] = {5, 2, 8, 2, 5, 1, 8, 9};
		finddu(arr2);
		uni(arr2);

	}

}
