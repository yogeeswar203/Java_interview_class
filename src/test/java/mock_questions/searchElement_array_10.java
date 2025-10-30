package mock_questions;

public class searchElement_array_10 {
	
	public static void searchElement_ar(String []strArray, String str) {
		
		boolean status = false;
		for(int i=0; i<=strArray.length-1; i++)
		{
			if(strArray[i].equals(str))
			{
				System.out.println("Element Found: "+strArray[i]);
				status = true;
				break;
			}
		}
		if(status==false)
		{
			System.out.println("Element is not found: "+str);
		}
		
	}
	
	public static void main(String[] args) {
		
		String [] arr= {"te", "tet", "pass", "test"};
		
		searchElement_ar(arr, "test");
	}

}
