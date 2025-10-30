package mock_questions;

public class missingNum_Array {
	
	public static void missingNum(int arr[]) {
		int sumOfArr = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			sumOfArr = sumOfArr + arr[i];
		}
		System.out.println(sumOfArr);
		
		int sum = 0;
		for(int i=10; i<=17; i++)
		{
			sum = sum + i;
		}
		System.out.println("Missing Number: "+(sum-sumOfArr));
	}
	
	

	public static void main(String[] args) {
		int arr [] = {10, 11, 12, 13, 14, 15, 17};
		missingNum(arr);
	}

}
