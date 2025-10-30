package mock_questions;

import java.util.HashMap;
import java.util.Map;

public class countSeriesOfOccurance {

	public static void seriesOfOccurance(String str) {
		
		char[] charArry = str.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		for(char c:charArry)
		{
			if(!String.valueOf(c).isBlank()) {
				if(charMap.containsKey(c)) {
					charMap.put(c, charMap.get(c)+1);
				}else
				{
					charMap.put(c, 1);
					
				}
			}
		}
		
		for(char c:charMap.keySet()) {
			System.out.println(c+"-"+charMap.get(c)+" ");
		}
		System.out.println(charMap);
		
		
		
	}
	
	public static void main(String[] args) {
		
		seriesOfOccurance("test");
	}

}
