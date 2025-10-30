package mock_questions;

public class reverseNum_02 {
	
	public static void revnum(int a) {
		int revn = 0;
		
		while(a!=0) {
			revn = revn *10 + a%10;
			a = a/10;
		}
		System.out.println("After reverse the numeber is: "+revn);
	}

	public static void main(String[] args) {
		
		revnum(123);
	}

}
