package mock_questions;

public class Array_secondDigit {

	public static void main(String[] args) {
		/*l list={test,37m,green,78,3}
		output = {37m, 78}
		condition: if second letter in a word is digit then print that string
		{"test", "37m", "3m5", "33T", "78"};
		Expected out = 37m, 33T, 78
		
				*/
		
		String [] strArray = {"test", "37m", "3m5", "33T", "78"};
		
		for(String wordStr:strArray) {
			if(wordStr.length()>=2) {
				char secDigit = wordStr.charAt(1);
				if(Character.isDigit(secDigit)) {
					System.out.print(wordStr+" ");
				}
			}
		}
		

	}

}
