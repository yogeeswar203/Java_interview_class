package mock_questions;

public class checkPalandromString_05 {
	
	public static void checkPalandromStrin(String s) {
		
		String revS = "";
		String originaStr = s;
		
		for(int i=s.length()-1; i>=0; i--)
		{
			revS  = revS + s.charAt(i);
		}
		if(revS.equals(originaStr))
		{
			System.out.println("Given string is Palandrome: "+originaStr);
		}else
		{
			System.out.println("Given string is Not a Palandrome: "+originaStr);
		}

	}
	
	public static void main(String[] args) {
		checkPalandromStrin("TET");
	}

}
