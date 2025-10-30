package day1;

public class CallByValue {

	public static void main(String[] args) {
		
		employee e1 = new employee(100);
		e1.number = 10;
		System.out.println(e1.number);
		e1.s1(10);
		System.out.println(e1.number);

	}

}
