package day_19;

public class printLetters {
public static void main(String[] args) {
	String word = "Amazon";
	             //012345-index
	             //123456- num of chars
	int idx = 0 ;
	
	
	while(idx< word.length()) {
		System.out.println(word.charAt(idx++));
		// or idx++
	}
	
	int idx2 = word.length()-1 ;
	
	while (idx2 >= 0) {
		System.out.println(word.charAt(idx2));
		
		idx2--;
	}
//	System.out.println(word.charAt(idx));
//	++idx;
//	System.out.println(word.charAt(idx));
//	++idx;
//	System.out.println(word.charAt(idx));
//	++idx;
//	System.out.println(word.charAt(idx));
//	++idx;
//	System.out.println(word.charAt(idx));
//	++idx;
//	System.out.println(word.charAt(idx));
////	++idx;
	//print each character one byone in seperate lines
}
}
