package mock_questions;

public class checkPrime_06 {
	public static void checkPrimenum(int num) {
		int count = 0;
		if(num<=0) 
		{
			System.out.println("Please provide number greater than '0'");
		}else if (num==2 ) 
		{
			System.out.println("Given number is Prime number: "+num);
		}else
		{
			if(num>1)
			{
				for(int i =1; i<=num; i++)
				{
					if(num%i == 0)
					{
						count++;
					}
				}
			}
			if(count == 2) {
				System.out.println("Given Number is Prime: "+num);
			}else
			{
				System.out.println("Given Number is Not a Prime:"+num);
			}
		}
	}
	

	public static void main(String[] args) {
		checkPrimenum(2);

	}

}
