package mock_questions;

public class checkPalandrom_num_03 {
	
	public static void palandromNumber(int a) {
		int revn = 0;
		int orginalNum = a;
		
		while(a!=0)
		{
			revn = revn * 10 + a%10;
			a = a/10;
		}
		if(revn == orginalNum)
		{
			System.out.println("Given number is Palandrome :"+orginalNum);
		}else
		{
			System.out.println("Given number is Not a Palandrome: "+orginalNum);
		}
	}

	public static void main(String[] args) {
		
		palandromNumber(121);
	}

}
