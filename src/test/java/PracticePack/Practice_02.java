package PracticePack;

public class Practice_02 {

	public static void intswap(int num1, int num2)
	{
		int t=0;
		System.out.println("Before swapping: "+num1 +":"+num2);
		t = num1; // t = 10
		num1 = num2; // num1 = 20
		num2  = t; // num1 = 10
		System.out.println("Before swapping: "+num1 +":"+num2);
		num1 = num1 +num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("Before swapping: "+num1 +":"+num2);
	}
	
	public static void main(String[] args) {
		intswap(10, 20);

	}

}
