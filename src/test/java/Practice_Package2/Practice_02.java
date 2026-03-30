package Practice_Package2;

public class Practice_02 {
	
	public static void intSwap(int num1, int num2) {
		System.out.println("Before swapping the numbers: "+num1+":"+num2);
		int t = 0;
		t = num1;
		num1 = num2;
		num2 = t;
		System.out.println("Before swapping the numbers: "+num1+":"+num2);
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("Before swapping the numbers: "+num1+":"+num2);
	}

	public static void main(String[] args) {
		int a= 10;
		int b = 20;
		
		intSwap(a, b);
		

	}

}
