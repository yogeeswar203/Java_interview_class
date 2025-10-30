package day1;

public class employee {
	
	employee(int a){
		System.out.println("This a constructor");
	}
	
	int emp_id;
	String emp_name;
	
	void display() {
		System.out.println(emp_id);
		System.out.println(emp_name);
		
	}
	
	
	public void dis() {
		System.out.println("This Method is examl=ple for the no Parameter and No Return");
	}
	
	public int dis1() {
		System.out.println("This method is example for the no Parm and with return");
		return 0;
	}
	
	public void dis(String s1) {
		System.out.println(s1);
	}
	
	public int dis(int a1) {
		
		return a1;
	}
	int x;
	int y;
	employee(int a, int b){
		x  = a;
		y = b;
	}
	
	void sum() {
		System.out.println(x+y);
	}
	
	// constructor Demo
	
	int number;
	void s1(int number) {
		number = number+10;
		System.out.println(number);
	}
	
	
	
	public static void main(String[] args) {
		employee emp1 = new employee(20);
		emp1.emp_id =100;
		emp1.emp_name = "Yogeeswar";
		emp1.display();
		employee e= new employee(20);
		e.dis1();
		employee e1= new employee(20, 10);
		e1.sum();

	}

}
