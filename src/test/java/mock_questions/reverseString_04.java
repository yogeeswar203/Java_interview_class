package mock_questions;

public class reverseString_04 {
	
	public static void revString(String s1) {
		String revString = "";
		
		for(int i = s1.length()-1; i>=0; i--) {
			revString = revString+s1.charAt(i);
		}
		System.out.println(revString);
	}

	// method 2
	public static String revrseStringRecursive(String str) {
		
		if(str == null || str.length()<=1) {
			return str;
		}
		return revrseStringRecursive(str.substring(1))+str.charAt(0);
	}
	
	public static String max(String str) {
		
		if(str==null || str.length()<=1) {
			return str;
		}
		
		return max(str.substring(1))+str.charAt(0);
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		String s = "Test";
		String s2 = "Working in TCS";
		
		revString(s);
		System.out.println(revrseStringRecursive(s2));
		System.out.println(max(s));
	}

}
