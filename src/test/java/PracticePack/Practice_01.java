package PracticePack;

public class Practice_01 {
	
	
	public static void findVowels(String str) {
	
		String lo_str = str.toLowerCase();
		for(int i=0; i<lo_str.length(); i++)
		{
			char c = lo_str.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') 
			{
				System.out.print(c+" ");
			
			}
			
		}
		System.out.println();
	}
	
	public static String reverseString(String str)
	{
		if(str == null || str.length()<=1) {
			return str;
		}
		char f = str.charAt(0);
		String last = str.substring(1);
		return reverseString(last)+f;
	}

	public static void main(String[] args) {
		findVowels("aeiOu");
		System.out.println(reverseString("test"));

	}

}
