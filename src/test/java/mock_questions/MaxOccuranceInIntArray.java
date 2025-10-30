package mock_questions;

import java.util.HashMap;
import java.util.Map;

public class MaxOccuranceInIntArray {
	
	public static void maxOccuranceIninArray(int arr[]) {
		
		Map<Integer, Integer> intmap = new HashMap<Integer, Integer>();
		for(int i:arr) {
			if(intmap.containsKey(i)) {
				intmap.put(i, intmap.get(i)+1);
			}else
			{
				intmap.put(i,1);
			}
			
		}
		int max =0;
		for(int j:intmap.keySet()) {
			if(max<=intmap.get(j)) {
				max = intmap.get(j);
			}
		}
		
		for(int k:intmap.keySet())
		{
			if(max==intmap.get(k))
			{
				System.out.println(k+": "+intmap.get(k));
			}
		}
		
		
	}

	public static void main(String[] args) {
		int arr[]= {1, 2, 3, 4, 4, 5, 5, 5,6};
		maxOccuranceIninArray(arr);

	}

}
