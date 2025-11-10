package mock_questions;

import java.util.Arrays;

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
	}

	public static void main(String[] args) {
		int arr[] = {5, 2, 8, 2, 5, 1, 8, 9};
		duplicateValues(arr);

	}

}
