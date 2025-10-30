package day1;

interface iTDemo {
	
	void show();
	
}


public class interface_01 implements iTDemo{
	
	public void show() {
		System.out.print("Test");
	}

	public static void main(String[] args) {
		
		iTDemo it = new interface_01();
		it.show();
		
	}

}
