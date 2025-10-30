package mock_questions;

public class NoOfEven_Odd_08 {
	
	public static void evn_odd(int num) {
		int evn = 0;
		int od = 0;
		
		while(num!=0) {
			
			int rem = num%10;
			if(rem%2 == 0) {
				evn++;
			}else
			{
				od++;
			}
			
			num = num/10;
		}
		System.out.println(evn +" "+od);
		
	}
	
	public static void main(String[] args) {
		evn_odd(12345);
	}

}
