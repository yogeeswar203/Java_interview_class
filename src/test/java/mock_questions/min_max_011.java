package mock_questions;

public class min_max_011 {

	public static void min_max_missingNum(int []intarr)
	{
		int min = 0;
		int max = 0;
		max = intarr[0];
		
		for(int i=0; i<=intarr.length-1;i++)
		{
			if(intarr[i]>max)
			{
				max = intarr[i];
			}
		}
		System.out.println("Maximum value: "+max);
		
		min = intarr[0];
		
		for(int i=0; i<=intarr.length-1; i++)
		{
			if(intarr[i]<min)
			{
				min = intarr[i];
			}
		}
		System.out.println("Minimum Value: "+min);
		
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {9, 10, 12, 13, 14, 15};
		min_max_missingNum(arr);
	}

}
