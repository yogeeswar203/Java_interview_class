package test;

public class subString_question {

	public static void main(String[] args) {
		String str = "(2132) Records Found";
		
		String c = str.substring(1, 2);
		//System.out.println(c);
		int c1 = str.indexOf("(")+1;
		int c2 = str.indexOf("Records")-2;
		//System.out.println(str.charAt(c1));
		System.out.println(str.substring(c1, c2));
		System.out.println(str.substring(str.indexOf("F")));

	}

}
