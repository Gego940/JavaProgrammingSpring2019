package day_14;

public class CharAt {
public static void main(String[] args) {
	
	String word = "Computer";
	
	System.out.println(word.charAt(0));
	System.out.println(word.charAt(1));
	System.out.println(word.charAt(2));
	System.out.println(word.charAt(3));
	System.out.println(word.charAt(4));
	System.out.println(word.charAt(5));
	System.out.println(word.charAt(6));
	System.out.println(word.charAt(7));
	
	String word2="Java";
	
	if (word2.charAt(0) == 'J') {
		System.out.println("J is first char");
	}else {
		System.out.println("J isnt first letter");
	}
	
	String word3 = "GeorG";
	if(word3.charAt(0)==word3.charAt(4)) {
		System.out.println("First and last letter are the same");
	}else {
		System.out.println("they diffirent");
	}
	String word4 ="papadopulos";
	
	char lastChar = word4.charAt(word4.length()-1);
	System.out.println("Last char of "+word4+ " is "+lastChar);
	
	
}
}
