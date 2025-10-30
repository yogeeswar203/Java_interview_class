package day1;

public class Ploymorphisam_01 {

	// Polymorphisam is called one function into different behaviour
	
	void m1() {
		System.out.println("This is m1 method");
	}
	public Ploymorphisam_01() {
		// TODO Auto-generated constructor stub
	}
	
	void m2(int a) {
		System.out.println(a+"This is method 2");
	}
	
	void m3(String s1) {
		System.out.println("This is method 3"+s1);
	}
	
	
	
	public static void main(String[] args) {
		Ploymorphisam_01 p = new Ploymorphisam_01();
		p.m1();
		p.m3("Yogeeswar");
		p.m2(10);
		
		Encaps_01 e1 = new Encaps_01();
		e1.setNum(10);
		System.out.println(e1.getNum());

	}

}
