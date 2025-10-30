package day1;

public class static_nonstatic {
	
	int a=14;
	public static void m1() {
		System.out.println("This is static method");
	}
	
	public void m2() {
		System.out.println("This is Non-Static Menthod");
		m1();
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		m1();
		static_nonstatic m = new static_nonstatic();
		m.m2();

	}

}
