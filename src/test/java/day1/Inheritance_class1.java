package day1;



class parentClass{
	int p1=10;
	void display() {
		System.out.println("This coming frm=om the Parent Class");
	}
	
}

class childClass extends parentClass{
	int c1=10;
	void show() {
		System.out.println("This coming from the Child Class");
	}
	
}

class grandChild extends childClass{
	
	void dis() {
		System.out.println("This is grand child class");
		
	}
	
	
}





public class Inheritance_class1 {

	public static void main(String[] args) {
		childClass s = new childClass();

		s.show();   
		System.out.println(s.p1);
		System.out.println(s.c1);
		s.display();
		
		grandChild gc = new grandChild();
		System.out.println(gc.c1);
		System.out.println(gc.p1);
		gc.dis();
		
	}

}
