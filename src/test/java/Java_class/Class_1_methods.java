package Java_class;

public class Class_1_methods {
	
	public static void m1()
	{
		System.out.println("This is no Parameter and no value");
	}
	
	public static void m2(String str)
	{
		System.out.println("This is with parameter "+str);
	}
	
	public static int m3() {
		
		return 2;
	}
	
	public static String m4(String st1)
	{
		return st1;
	}

	public static void main(String[] args) {
		
		m1();
		m2("test");
		System.out.println(m3());
		System.out.println(m4("test"));
	}

}
