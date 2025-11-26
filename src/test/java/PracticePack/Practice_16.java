package PracticePack;

public class Practice_16 {
	
	public static void intSwap(int num1, int num2) {
		System.out.println("-------------------------------------------------- Program 1 ------------------------------------------------");
		System.out.println("Before Swapping numbers: "+num1+":"+num2);
		int t= 0;
		t = num1;
		num1 = num2;
		num2 = t;
		System.out.println("Before Swapping numbers: "+num1+":"+num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("Before Swapping numbers: "+num1+":"+num2);
		
	}

	public static void reverseInt(int num1) {
		System.out.println("-------------------------------------------------- Program 2 ------------------------------------------------");
		int num = num1;
		int rev = 0;
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num = num/10;
			
		}
		if(num1 == rev)
		{
			System.out.println("Given number is Palandrome: "+rev);
		}else
		{
			System.out.println("Given number is not palandrome:"+num1);
		}
	}
	
	
	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 30;
		int num3 = 1981;
		
		String str = "tttess";
		String str1[] = {"t2s", "b5T", "ram", "Raj", "h4", "Raj"};
				
		int arr[] = {1,1, 2, 2, 3, 4, 4, 5, 6};
		int arRe[] = {1,1, 2, 2, 3, 4, 4,4, 5, 6};
		int missingArr[] = {81, 83, 84, 85};
		Integer arr3[] = {1,1, 2, 2, 3, 4, 4,4, 5, 6};
		
		
		intSwap(num1, num2);
		reverseInt(num3);
		      
	}
}
