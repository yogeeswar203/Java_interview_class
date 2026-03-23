package Practice_Package2;

public class practice_01 {

	public static void display() {
		System.out.println("Thi is re-start program from me");
	}
	
	public static void intSwap(int num1, int num2){
		System.out.println("Before swapping the numbers: "+num1 +":"+num2);
		int temp = 0;
		
		temp = num1; // temp = 10
		num1 = num2; // num1 = 20
		num2 = temp; // num2 = 10
		System.out.println("Before swapping the numbers: "+num1 +":"+num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("Before swapping the numbers: "+num1 +":"+num2);
		
	}
	
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		display();
		intSwap(num1, num2);
	}

}
