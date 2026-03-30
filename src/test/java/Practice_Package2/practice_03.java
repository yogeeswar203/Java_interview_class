package Practice_Package2;

public class practice_03 {
	public static void intSwap(int num1, int num2)
	{
		System.out.println("-------------------------------------------------- Program 1 ------------------------------------------------");
		System.out.println("Before swapping the numbers: "+num1+":"+num2);
		int t=0;
		t 		= num1;
		num1 	= num2;
		num2 	= t;
		System.out.println("Before swapping the numbers: "+num1+":"+num2);
		num1 = num1 + num2;
		num2 = num1-num2;
		num1 = num1-num2;
		System.out.println("Before swapping the numbers: "+num1+":"+num2);
	}
	
	public static void sceDigit(String arr[]) {
		
		System.out.println("-------------------------------------------------- Program 2 ------------------------------------------------");
		for(String eachWord: arr)
		{
			char c=eachWord.charAt(1);
			if(Character.isDigit(c))
			{
				System.out.print(eachWord+" ");
			}
		}
	}

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 30;
		int num3 = 1981;
		
		String str = "tttess";
		String str1[] = {"t2s", "b5T", "ram", "Raj", "h4", "Raj"};
				
		int arr[] = {1,1, 2,2, 2, 3, 4, 4, 5, 6};    
		int arRe[] = {1,1, 2, 2, 3, 4, 4,4, 5, 6};
		int missingArr[] = {81, 83, 84, 85};
		Integer arr3[] = {1,1, 2, 2, 3, 4, 4,4, 5, 6};

		intSwap(num1, num2);
		sceDigit(str1);
		
		//checkPrimeNumber(a);
		//generatePrimeNumbers(a, b);
		//revString(str);
		//revint(m);
		//StringPalandrome(str);
		//countStringChar(str);
		//countOfNum(arr);
		//System.out.println();
		//System.out.println("***************** Running Program 9 *************************");
		//System.out.println("Revered string method 2: " +reverseStringMenthod2(str));
		
		// programs on Arrays 
		//duplicateValue(arr1);
		//uniArryValues(arr1);
		//uniQArray(arr1);
		//uniArraySet(arr2);
		
	}

}
